package calculator.memento;

import calculator.*;
import upm.jbb.IO;

public final class MainMemento {
    private CommandManager commandManager;

    private MainMemento() {

        LogHandler<CalculatorLog> logHandler = new LogHandler<CalculatorLog>();
        CalculatorLogger calculatorLogger = new CalculatorLogger();
    	
	    this.commandManager = new CommandManager();
	    this.commandManager.add(new AddCommand(calculatorLogger));
	    this.commandManager.add(new SubstractCommand(calculatorLogger));
        this.commandManager.add(new ResetCommand(calculatorLogger));
        this.commandManager.add(new PrintCommand(calculatorLogger));
	    this.commandManager.add(new CreateLogCommand(calculatorLogger, logHandler));
	    this.commandManager.add(new RestoreLogCommand(calculatorLogger, logHandler));
    }
    
    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }
    
    public static void main(String[] args) {
    	IO.getIO().addView(new MainMemento());
    }
}