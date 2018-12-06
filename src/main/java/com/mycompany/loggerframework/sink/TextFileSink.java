package com.mycompany.loggerframework.sink;

import java.io.File;
import java.io.PrintWriter;

public class TextFileSink implements Sink,
		SinkInitializable<TextFileSinkInitializationContext> {

	private  PrintWriter printWriter;
	
	@Override
	public void writeMessage(SinkWriteContext sinkWriteContext) {
		printWriter.format(sinkWriteContext.getMessage().getContent());
	}

	@Override
	public void initSink(TextFileSinkInitializationContext initializationContext) {

		try {
			File textFileName = new File(initializationContext.getDirectory(),
					initializationContext.getFileName());

			if (!textFileName.exists()) {

				textFileName.createNewFile();
			}
			
			printWriter = new PrintWriter(textFileName) ;
		
		} catch (Exception e) {
			throw new RuntimeException("Initialization of file failed"
					+ e.getMessage());
		}
	}

}
