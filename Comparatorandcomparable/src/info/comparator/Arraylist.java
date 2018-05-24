package info.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import info.comparable.Empolyee;

public class Arraylist {

	public static void main(String[] args) {
		// List<Empolyee> emp = null;
		// TODO Auto-generated method stub
		List<Empolyee> al;
		al = new ArrayList<>();
		al.add(new Empolyee("surendra", 1));
		al.add(new Empolyee("surendher", 4));
		al.add(new Empolyee("vishnu", 5));
		al.add(new Empolyee("alaparthi", 2));
		al.add(new Empolyee("hareesh", 3));

		System.out.println("before sorting");
		printList(al);

		System.out.println("after sorting");
		Collections.sort(al);
		printList(al);

		System.out.println("after sorting by name");
	Collections.sort(al, new NameComparator());
		printList(al);

	}

	public static void printList(List<Empolyee> emp) {
		for (Empolyee ee : emp) {
			System.out.println(ee.getId() + " --" + ee.getName());
		}
	}
}
