package com.mycompany.loggerframework.configuration;

import com.mycompany.myproject.logger.LogLevel;
import com.mycompany.myproject.logger.sink.SinkInitializationContext;

public class LoggerConfigurationTemplate {
	
	private String timeFormat;
	private LogLevel logLevel;
	private SinkInitializationContext sinkInitializableContext;
	
	public String getTimeFormat() {
		return timeFormat;
	}
	public void setTimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}
	public LogLevel getLogLevel() {
		return logLevel;
	}
	public void setLogLevel(LogLevel logLevel) {
		this.logLevel = logLevel;
	}
	public SinkInitializationContext getSinkInitializableContext() {
		return sinkInitializableContext;
	}
	public void setSinkInitializableContext(
			SinkInitializationContext sinkInitializableContext) {
		this.sinkInitializableContext = sinkInitializableContext;
	}

	
}
