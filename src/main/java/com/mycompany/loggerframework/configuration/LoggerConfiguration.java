package com.mycompany.loggerframework.configuration;

import com.mycompany.loggerframework.core.LogLevel;

public interface LoggerConfiguration {
	
	public void initializeLoggerConfiguration();

	public LoggerConfigurationTemplate findLoggerConfigurationByLogLevel(LogLevel logLevel);
}
