package calculator.memento;

public interface Logger<T> {
	T createLog();
	void restoreLog(T log);
}
