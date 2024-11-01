package com.sunil.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.sunil.kafka.dto.Consumer;

@Component
public class KafkaMessageConsumer
{
	
	private static final Logger log=LoggerFactory.getLogger(KafkaMessageConsumer.class);
	
	@KafkaListener(topics = "string_topic", groupId = "string_group", containerFactory = "stringKafkaListener")
    public void stringConsume(String message) 
	{
        log.info("Consumed string message: " + message);
    }

    @KafkaListener(topics = "consumer_topic", groupId = "consumer_group", containerFactory = "kafkaListener")
    public void consume(Consumer consumer) 
    {
        log.info("Consumed JSON message: " + consumer);
    }
	
}
