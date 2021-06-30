package com.cloud.stream.producer.controller;

import com.cloud.stream.model.CustomMessage;
import com.cloud.stream.producer.service.CloudStreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest Controller to handle Event sent through REST API Request
 */
@RestController
@RequestMapping("/v1")
public class CloudStreamController {

    @Autowired
    private CloudStreamService service;

    @PostMapping("/sendMessage")
    public ResponseEntity<CustomMessage> publishMessageDetails(@RequestBody CustomMessage customMessage) {
        return new ResponseEntity<>(service.publishToTopic(customMessage), HttpStatus.OK);
    }

}
