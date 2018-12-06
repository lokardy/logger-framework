package com.mycompany.loggerframework.configuration;

import com.mycompany.loggerframework.core.LogLevel;
import com.mycompany.loggerframework.sink.SinkInitializationContext;

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
