package com.example.kafkademo.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

	@KafkaListener(topics="kafka-topic", groupId="groupId")
	public void listener(String data) {
		System.out.println("Listener rec:"+data+":)");
	}
}
