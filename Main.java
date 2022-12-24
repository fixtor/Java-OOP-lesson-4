import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Integer someNumber = 20; // проверочное поле для IsGOOD
		String someString = "Hello Hello"; // проверочное поле для IsGOOD
		String stringCompareTo = "Hello Hello? world"; // проверочное поле для IsGOOD строка для сравнения

		IsGood<Integer> evenIsGood = new IsEven<>(someNumber); // IsEven — ему дают целое число, он одобряет его, если оно чётное
		IsGood<Integer> isPositiveIsGood = new IsPositive<>(someNumber); //IsPositive — ему дают целое число, он одобряет его, если оно положительное
		IsGood<String> beginWithIsGood = new BeginsWith<>(someString, stringCompareTo); //BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил
		IsGood<String> beginWithA = new BeginsWithA<>(someString); //BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A

		System.out.println(isPositiveIsGood.isGood(someNumber)); // Проверка на положительное
		System.out.println(evenIsGood.isGood(someNumber)); // Чет не чет
		System.out.println(beginWithA.isGood(someString)); // начало на А
		System.out.println(beginWithIsGood.isGood(stringCompareTo)); //Начало на слово

		List<Integer> integerList = new ArrayList<>(); //  список Integer
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		integerList.add(-1);
		integerList.add(-2);
		integerList.add(-3);
		integerList.add(-4);

		List<String> stringList = new ArrayList<>(); //список String
		stringList.add("as hh");
		stringList.add("As hh");
		stringList.add("df hh");
		stringList.add("Af hh");
		stringList.add("Qzhh hh");
		stringList.add("AQz hhh");

		System.out.println(filter(integerList, evenIsGood)); //Вызов фильтра для Integer чёт-нечёт
		System.out.println(filter(integerList, isPositiveIsGood)); //Вызов фильтра для Integer положительный
		System.out.println(filter(stringList, beginWithA)); //Вызов фильтра для Integer
	}

	public static <T> Iterable<T> filter(Iterable<T> collection1, IsGood<T> approver) {
		List<T> iterableList = new ArrayList<T>();
		for (T item : collection1) {
			if (item instanceof Integer || item instanceof String) {
				if (approver.isGood(item)) iterableList.add(item);
			}
		}
		return iterableList;
	}
}