package com.mycompany.loggerframework.sink;

//IOC can be used to get sink implementations run time
public class SinkFactory {

	
	public static Sink getSink(SinkInitializationContext sinkInitializationContext) {
		
		if(sinkInitializationContext instanceof TextFileSinkInitializationContext) {
			
			Sink sink = new TextFileSink();
			
			((SinkInitializable)sink).initSink(sinkInitializationContext);

			return sink;
		}
		
		throw new RuntimeException(String.format("Could not find the sink configuration for the initialization context %s", sinkInitializationContext.getClass().getName()));
	}
}
