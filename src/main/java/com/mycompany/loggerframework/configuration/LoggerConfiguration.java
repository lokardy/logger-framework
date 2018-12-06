package com.mycompany.loggerframework.configuration;

import com.mycompany.myproject.logger.LogLevel;

public interface LoggerConfiguration {
	
	public void initializeLoggerConfiguration();

	public LoggerConfigurationTemplate findLoggerConfigurationByLogLevel(LogLevel logLevel);
}
