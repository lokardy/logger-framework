package com.mycompany.loggerframework.sink;

import com.mycompany.loggerframework.core.Message;

public class SinkWriteContext {

	private Message message;

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
	
}
