package com.mycompany.loggerframework.sink;

public interface SinkInitializable<T extends SinkInitializationContext> {
	
	public void initSink(T initializationContext);
}
