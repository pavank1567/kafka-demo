package com.example.kafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkademo.model.MessageRequest;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
	
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}

	@PostMapping
	public void publish(@RequestBody MessageRequest request) {
//		System.out.println(request.getMessage());
		kafkaTemplate.send("kafka-topic",request.getMessage());
	}
	
	@GetMapping
	public String hello() {
		return "me";
	}
}
