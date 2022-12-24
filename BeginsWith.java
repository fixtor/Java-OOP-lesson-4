public class BeginsWith<T> implements IsGood<T> {
//в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил

	private T stringValue;

	public BeginsWith(T stringValue, T stringCompareTo) {
		this.stringValue = stringValue;
	}

	@Override
	public <T> boolean isGood(T item) {
		String[] splitThisString = this.stringValue.toString().split(" ");
		String splitString = (String) item;
		return splitThisString[0].equals(splitString.split(" ")[0]);
	}

	@Override
	public String toString() {
		return "BeginsWith{" +
				"stringValue=" + stringValue +
				'}';
	}
}
