package info.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import info.comparator.NameComparator;

public class SortListOfBooks {

	public static void main(String[] args) {
		
		List<Books> books = getBooks();
		displayBooks(books);
		System.out.println("---------------");
		
		System.out.println("after sorting the books");
		Collections.sort(books);
		displayBooks(books);
		System.out.println("---------------");
		
		System.out.println("after sorting the books by BookPrice");
		Collections.sort(books, new BookPriceComparator());
		displayBooks(books);
		System.out.println("---------------");
		
		
		/*System.out.println("after sorting the books by bookName");
		Collections.sort(books, new NameComparator());
		displayBooks(books);*/
		
	}
	
	private static void displayBooks(List<Books> books) {
		
		Iterator<Books> iterator = books.iterator();
		while(iterator.hasNext())
		{
			Books book = iterator.next();
			System.out.println(book);
		}
	}

	public static List<Books> getBooks()
	{
		ArrayList<Books> arrayList;
		
		arrayList= new ArrayList<Books>();
		
		arrayList.add(new Books(3,"datastructures","indian",500));
		arrayList.add(new Books(4,"c","robert",70));
		arrayList.add(new Books(5,"sql","oracle",150));
		arrayList.add(new Books(1,"java","jamesgosling",100));
		arrayList.add(new Books(2,"c++","letusC",50));
		return arrayList;
		
	}

	

}
