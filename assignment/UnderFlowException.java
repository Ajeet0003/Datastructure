package assignment;

public class UnderFlowException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Queue Empty";
	}
}