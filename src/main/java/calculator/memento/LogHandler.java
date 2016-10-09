package calculator.memento;

import java.util.SortedMap;
import java.util.TreeMap;

public class LogHandler<T> {
    private SortedMap<String, T> list = new TreeMap<String, T>();
    
    public void addLog(String key, T log) {
        this.list.put(this.list.size() + ":" + key, log);
    }

    public T getLog(String key) {
        return this.list.get(key);
    }

    public String[] keys() {
        return this.list.keySet().toArray(new String[0]);
    }
}
