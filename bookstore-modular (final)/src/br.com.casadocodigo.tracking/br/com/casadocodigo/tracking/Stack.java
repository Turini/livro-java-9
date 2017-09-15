package br.com.casadocodigo.tracking;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.lang.StackWalker.Option;

import java.util.stream.*;

public class Stack {

	public static void logDebugTrace() {
		
		Logger logger = System.getLogger("CustomLogger");

		StackWalker.getInstance(Option.RETAIN_CLASS_REFERENCE)
		.walk(stream -> stream.filter(frame -> !Stack.class.equals(frame.getDeclaringClass()))
		.peek(element -> 
			logger.log(Level.TRACE, 
	  	    " linha " 
	  	  + element.getLineNumber() 
	  	  + " do método " 
	  	  +  element.getMethodName() 
	  	  + " na classe " 
	  	  + element.getClassName()
	  	))
	  	.collect(Collectors.toList()));
	}
}