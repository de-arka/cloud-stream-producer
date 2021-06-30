package com.cloud.stream.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Event Model
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomMessage implements Serializable {
    private String messageId;
    private String messageContent;
    private String isMessageActive;
}
