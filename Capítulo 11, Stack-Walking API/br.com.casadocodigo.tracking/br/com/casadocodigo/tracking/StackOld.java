package br.com.casadocodigo.tracking;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class StackOld {

	public static void logDebugTrace() {
		
		Logger logger = System.getLogger("CustomLogger");

		StackTraceElement[] stacks = new Throwable().getStackTrace();

		for(StackTraceElement element: stacks) {

		  String className = element.getClassName();
		  String methodName = element.getMethodName();
		  int lineNumber = element.getLineNumber();

		  logger.log(Level.TRACE, 
		  	    " linha " 
		  	  + element.getLineNumber() 
		  	  + " do método " 
		  	  +  element.getMethodName() 
		  	  + " na classe " 
		  	  + element.getClassName());
		}
	}
}