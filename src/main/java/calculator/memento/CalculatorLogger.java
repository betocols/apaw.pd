package calculator.memento;

import calculator.Calculator;

public class CalculatorLogger extends Calculator implements Logger<CalculatorLog> {	
	@Override
	public CalculatorLog createLog() {
		return new CalculatorLog(this.getTotal());
	}
	
	@Override
	public void restoreLog(CalculatorLog log) {
		this.setTotal(log.getTotal());
	}
}