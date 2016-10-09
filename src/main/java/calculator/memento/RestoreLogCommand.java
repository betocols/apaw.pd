package calculator.memento;

import upm.jbb.IO;

public class RestoreLogCommand extends CalculatorLoggerCommand {
	private static String NAME = "Restore calculator state";
	
	public RestoreLogCommand(CalculatorLogger calculatorLogger, LogHandler<CalculatorLog> logHandler) {
		super(calculatorLogger, NAME, logHandler);
	}
	
	@Override
	public void execute() {
		String logName = (String) IO.getIO().select(this.getLogHandler().keys(), "Name of the log to be restored: ");
		CalculatorLog log = this.getLogHandler().getLog(logName);
		this.getCalculatorLogger().restoreLog(log);
	}
}
