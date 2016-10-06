package calculator;

public abstract class CalculatorCommand implements Command {
	private Calculator calculator;
	private String name;
	
	public CalculatorCommand(Calculator calculator, String name) {
		this.calculator = calculator;
		this.name = name; 
	}
	
	public Calculator getCalculator() {
		return calculator;
	}
	
	public String name() {
		return name;
	}
}
