package info.comparableandcomparator;

import java.util.Comparator;

public class NameComparator  implements Comparator<Books>{

	@Override
	public int compare(Books o1, Books o2) {
		// TODO Auto-generated method stub
		return o1.getbName().compareTo(o2.getbName());
	}

}
