package calculator.memento;

import calculator.Command;

public abstract class CalculatorLoggerCommand implements Command {
	private CalculatorLogger calculatorLogger;
	private LogHandler<CalculatorLog> logHandler;
	private String name;
	
	public CalculatorLoggerCommand(CalculatorLogger calculatorLogger, String name, LogHandler<CalculatorLog> logHandler) {
		this.calculatorLogger = calculatorLogger;
		this.name = name; 
		this.logHandler = logHandler;
	}
	
	public CalculatorLogger getCalculatorLogger() {
		return calculatorLogger;
	}
	
	@Override
	public String name() {
		return name;
	}
	
	public LogHandler<CalculatorLog> getLogHandler() {
		return logHandler;
	}
}
