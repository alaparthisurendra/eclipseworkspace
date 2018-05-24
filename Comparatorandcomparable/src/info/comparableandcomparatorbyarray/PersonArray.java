package info.comparableandcomparatorbyarray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonArray {

	public static void main(String[] args) {
		Person[] person = { new Person("surendra", 1), new Person("alaparthi", 2), new Person("mahesh", 4) };

		List<Person> list;

		list = Arrays.asList(person);

		System.out.println("normal:" + list);

		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				return p1.age - p2.age;
			}
		});

		System.out.println("comparator by age:" + list);

		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println("comparator by name:" + list);

	}

}
