package assignment;

public class OverFlowException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Queue Full";
	}
}