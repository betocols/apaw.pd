package calculator;

import upm.jbb.IO;

public class PrintCommand extends CalculatorCommand {
	private static String NAME = "printCommand";
	
	public PrintCommand(Calculator calculator) {
		super(calculator, NAME);
	}
	
	@Override
	public void execute() {
		IO.getIO().print(this.getCalculator().getTotal() + "\n");
	}
}
