package info.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {

    List<Empolyee>al=new ArrayList<>();
    al.add(new Empolyee("surendra",1));
    al.add(new Empolyee("surendher",4));
    al.add(new Empolyee("vishnu",5));
    al.add(new Empolyee("alaparthi",2));
    al.add(new Empolyee("hareesh",3));
    Collections.sort(al, new Comparator<Empolyee>() {

		@Override
		public int compare(Empolyee o1, Empolyee o2) {
			
			if (o1.getId() > o2.getId())
				return -1;

			else if (o1.getId() < o2.getId())
				return 1;
			return 0;
		}
	});
    printList(al);
    
	}
    public static void printList(List<Empolyee> emp)
    {
    	for (Empolyee empolyee : emp) {
    		System.out.println(empolyee.getId()+" "+ empolyee.getName());
			
		}
    }
    

	}


