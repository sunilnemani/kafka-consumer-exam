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

    @KafkaListener(topics = "consumer_topic", groupId = "consumer_group", containerFactory = "kafkaListener1")
    public void consume1(Consumer consumer) 
    {
        log.info("Consumed1 JSON message: " + consumer);
    }
    
//    @KafkaListener(topics = "consumer_topic", groupId = "consumer_group_2", containerFactory = "kafkaListener2")
//    public void consume2(Consumer consumer) 
//    {
//        log.info("Consumed2 JSON message: " + consumer);
//    }
	
}
