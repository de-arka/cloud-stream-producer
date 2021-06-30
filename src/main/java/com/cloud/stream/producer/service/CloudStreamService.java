package com.cloud.stream.producer.service;

import com.cloud.stream.model.CustomMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * Service Class to handle actual Message sending to topic using Spring MessageBuilder and Message Channel
 */
@Service
public class CloudStreamService {

    /**
     * Injects Message Channel instance & maps the messageChannel with config defined channel using Qualifier
     */
    @Autowired
    @Qualifier("output")
    private MessageChannel messageChannel;

    /**
     * Method to publish Message to target topic
     * @param customMessage
     * @return
     */
    public CustomMessage publishToTopic(CustomMessage customMessage) {
        messageChannel.send(MessageBuilder.withPayload(customMessage).build());
        return customMessage;
    }

}
