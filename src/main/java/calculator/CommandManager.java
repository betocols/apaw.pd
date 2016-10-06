package calculator;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private Map<String, Command> commands = new HashMap<>();

    public void add(Command command) {
        this.commands.put(command.name(), command);
    }

    public void execute(String key) {
        this.commands.get(key).execute();
    }

    public String[] keys() {
        return this.commands.keySet().toArray(new String[0]);
    }
}
