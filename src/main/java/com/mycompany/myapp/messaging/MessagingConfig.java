package com.mycompany.myapp.messaging;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@EnableBinding(value = {Source.class, ProducerChannel.class})
public class MessagingConfig {
}
