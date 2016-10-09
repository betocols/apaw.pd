package calculator.memento;

import upm.jbb.IO;

public class CreateLogCommand extends CalculatorLoggerCommand {
	private static String NAME = "Save Calculator State";

	
	public CreateLogCommand(CalculatorLogger calculatorLogger, LogHandler<CalculatorLog> logHandler) {
		super(calculatorLogger, NAME, logHandler);
	}
	
	@Override
	public void execute() {
		String logName = IO.getIO().readString("Name of the log to be saved: ");
		CalculatorLog log = this.getCalculatorLogger().createLog();
		this.getLogHandler().addLog(logName, log);;
	}
}
