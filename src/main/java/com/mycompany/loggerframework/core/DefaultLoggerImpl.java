package com.mycompany.loggerframework.core;

import com.mycompany.loggerframework.configuration.LoggerConfiguration;
import com.mycompany.loggerframework.configuration.LoggerConfigurationTemplate;
import com.mycompany.loggerframework.sink.Sink;
import com.mycompany.loggerframework.sink.SinkFactory;
import com.mycompany.loggerframework.sink.SinkWriteContext;

public class DefaultLoggerImpl implements Logger {

	private LoggerConfiguration loggerConfiguration;


	public void logMessage(Message message) {

		 
		 LoggerConfigurationTemplate loggerConfigurationTemplate = loggerConfiguration
				.findLoggerConfigurationByLogLevel(message.getLogLevel());

		Sink sink = SinkFactory.getSink(loggerConfigurationTemplate
				.getSinkInitializableContext());

		SinkWriteContext context = new SinkWriteContext();

		context.setMessage(message);

		sink.writeMessage(context);
	}

}
