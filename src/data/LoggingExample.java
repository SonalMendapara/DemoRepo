package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {

		// add log4j.jar to the project - via build path
		// copy log4j.properties directly inside the src folder
		// create the object of Logger class in code
		
		Logger print = Logger.getLogger("devpinoyLogger"); // devpinoyLogger - come from log4j.properties file
		print.debug("hello"); // same as system.out.println("hello");
		//system.out.println("hello");
		
		print.debug("we are writing in to a log file"); //system.out.println("we are writing in to a log file");
		print.debug("starting the test case xyz test");
		print.debug("starting the test case xyz test1");
	
	}

}
