public class IsEven<T> implements IsGood<T> {
//ему дают целое число, он одобряет его, если оно чётное

	private T intNumber; //Тут Integer

	public IsEven(T intNumber) {
		this.intNumber = intNumber;
	}

	@Override
	public <T> boolean isGood(T item) {
		return (Integer) item % 2 == 0;
	}

	@Override
	public String toString() {
		return "IsEven{" +
				"intNumber=" + intNumber +
				'}';
	}
}
