package com.mycompany.loggerframework.core;

import java.util.concurrent.Callable;
import com.mycompany.loggerframework.configuration.LoggerConfiguration;
import com.mycompany.loggerframework.configuration.LoggerConfigurationTemplate;
import com.mycompany.loggerframework.sink.Sink;
import com.mycompany.loggerframework.sink.SinkFactory;
import com.mycompany.loggerframework.sink.SinkWriteContext;

public class LoggerWriteTask<V>  implements Callable<Void>{
	
	
	
	public LoggerWriteTask(LoggerConfiguration loggerConfiguration,
						   Message currentmessage) {
		super();
		this.loggerConfiguration = loggerConfiguration;
		this.currentmessage = currentmessage;
	}

	private LoggerConfiguration loggerConfiguration;
	
	private Message currentmessage;
	

	public Void call() throws Exception {
		
		 LoggerConfigurationTemplate loggerConfigurationTemplate = loggerConfiguration
					.findLoggerConfigurationByLogLevel(currentmessage.getLogLevel());

			Sink sink = SinkFactory.getSink(loggerConfigurationTemplate
					.getSinkInitializableContext());

			SinkWriteContext context = new SinkWriteContext();

			context.setMessage(currentmessage);

			sink.writeMessage(context);
			
			return null;
	}

}
