package com.mycompany.loggerframework.core;

public class Message {

	private String content;
	
	private String namespace;
	
	private LogLevel logLevel;

	public Message(String content, String namespace, LogLevel logLevel) {
		super();
		this.content = content;
		this.namespace = namespace;
		this.logLevel = logLevel;
	}

	public String getContent() {
		return content;
	}

	public String getNamespace() {
		return namespace;
	}

	public LogLevel getLogLevel() {
		return logLevel;
	}
	
	
}
