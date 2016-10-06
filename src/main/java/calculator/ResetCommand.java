package calculator;

import upm.jbb.IO;

public class ResetCommand extends CalculatorCommand {
	private static String NAME = "Reset";
	
	public ResetCommand(Calculator calculator) {
		super(calculator, NAME);
	}
	
	@Override
	public void execute() {
		this.getCalculator().reset();
	}
}
