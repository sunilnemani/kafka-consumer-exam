package com.sunil.kafka.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sunil.*")
public class KafkaConsumerApplication extends SpringBootServletInitializer
{

	public static void main(String[] args) 
	{
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) 
	{
		return application.sources(KafkaConsumerApplication.class);
	}

}
