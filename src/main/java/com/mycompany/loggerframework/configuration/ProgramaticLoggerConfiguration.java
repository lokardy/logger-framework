package com.mycompany.loggerframework.configuration;

import java.util.Map;
import com.mycompany.loggerframework.core.LogLevel;
import com.mycompany.loggerframework.sink.TextFileSinkInitializationContext;

public class ProgramaticLoggerConfiguration implements LoggerConfiguration {

	private Map<LogLevel, LoggerConfigurationTemplate> loggerConfigurationTemplates;


	public void initializeLoggerConfiguration() {
		LoggerConfigurationTemplate template = new LoggerConfigurationTemplate();
		
		template.setLogLevel(LogLevel.INFO);
		
		TextFileSinkInitializationContext sinkInitializableContext = new TextFileSinkInitializationContext();
		
		sinkInitializableContext.setDirectory("C:\\Log");
		sinkInitializableContext.setFileName("OwnLog.txt");
		
		template.setSinkInitializableContext(sinkInitializableContext);
		
		template.setTimeFormat("dd-mm-yyyy-hh-mm-ss");
		
		loggerConfigurationTemplates.put(LogLevel.INFO, template);
		
	}
	

	public LoggerConfigurationTemplate findLoggerConfigurationByLogLevel(
			LogLevel logLevel) {
		
		LoggerConfigurationTemplate template  = loggerConfigurationTemplates.get(logLevel);
		
		if(template == null) {
			throw new RuntimeException(String.format("Configuration is not available for the given log level %s", logLevel));
		}
		
		return template;
	}
}
