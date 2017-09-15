package br.com.casadocodigo.logging.impl;

import java.lang.System.Logger;
import java.util.ResourceBundle;
import static java.text.MessageFormat.format;

public class CustomLogger implements Logger {

	private final int severity;

	public CustomLogger() {
		this.severity = Level.INFO.getSeverity();
	}

	public CustomLogger(Level level) {
		this.severity = level.getSeverity();
	}

	@Override
	public String getName() {
		return "CustomLogger";
	}
 
	@Override
	public boolean isLoggable(Level level) {
		return severity <= level.getSeverity();
	}
 
	@Override
	public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {
		if (!isLoggable(level)) {
			return;
		}
		System.out.printf("CustomLogger [%s]: %s - %s%n", level, msg, thrown);
	}
 
	@Override
	public void log(Level level, ResourceBundle bundle, String format, Object... params) {
		if (!isLoggable(level)) {
			return;
		}
		System.out.printf("CustomLogger [%s]: %s%n", level, format(format, params));
	}
}
