package com.example.kafkademo.model;

public class MessageRequest {
	private String message;

	public String getMessage() {
		return message;
	}

	public MessageRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageRequest(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageRequest [message=" + message + "]";
	}
}