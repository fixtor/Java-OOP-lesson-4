public class IsPositive<T> implements IsGood<T> {
	//ему дают целое число, он одобряет его, если оно положительное
	private T intNumber;

	public IsPositive(T intNumber) {
		this.intNumber = intNumber;
	}


	@Override
	public <T> boolean isGood(T item) {

		return (Integer) item > 0;
	}

	@Override
	public String toString() {
		return "IsPositive{" +
				"intNumber=" + intNumber +
				'}';
	}
}
