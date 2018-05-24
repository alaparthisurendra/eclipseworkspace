package info.comparableandcomparator;

import java.util.Comparator;

public class BookPriceComparator  implements Comparator<Books>{

	@Override
	public int compare(Books o1, Books o2) {
	
		if(o1.getbPrice()> o2.getbPrice())
			return 1;
		else
			if(o1.getbPrice() < o2.getbPrice())
				return -1;
		return 0;
}
}
