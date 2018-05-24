package info.comparator;

import java.util.Comparator;

import info.comparableandcomparator.Books;

public class NameComparator implements Comparator<Empolyee> {

	@Override
	public int compare(Empolyee o1, Empolyee o2) {
		if (o1.getId() > o2.getId())
			return 1;
		else if (o1.getId() < o2.getId())
			return -1;
		return 0;
	}
}
