package info.comparableandcomparatorbyarray;

public class Person {
	String name;
	int age;

	Person() {
		name = "new born baby";
		age = 0;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s, age=%s]", name, age);
	}

}
