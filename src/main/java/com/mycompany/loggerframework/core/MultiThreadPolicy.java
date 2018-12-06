package com.mycompany.loggerframework.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.mycompany.loggerframework.configuration.LoggerConfiguration;


public class MultiThreadPolicy  implements ThreadPolicy {
	ExecutorService service = Executors.newFixedThreadPool(10);
	
	private LoggerConfiguration loggerConfiguration;
	
	private Message message;
	


	public void executeUow() {
	 LoggerWriteTask<Void> task = new LoggerWriteTask<>(loggerConfiguration, message);

		service.submit(task);
	}
	
	

}
