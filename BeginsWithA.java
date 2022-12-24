public class BeginsWithA<T> implements IsGood<T> {
	//ему дают строку, он одобряет её, если она начинается с буквы A

	private T stringValue;

	public BeginsWithA(T stringValue) {
		this.stringValue = stringValue;
	}

	@Override
	public <T> boolean isGood(T item) {
		char[] toCharArray = ((String) item).toCharArray();
		return toCharArray[0] == 'A';
	}

	@Override
	public String toString() {
		return "BeginsWithA{" +
				"stringValue=" + stringValue +
				'}';
	}
}
