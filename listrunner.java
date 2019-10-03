package list_project;

import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class listrunner {
	
	public static void main(String[] args) {
		list jk= new list();
	    List<Integer> i=List.of(5,3,4);
		List<Integer> j= new LinkedList<Integer>(i);
		System.out.println(j);
		List<String> l= new ArrayList<String>();
		List<String> li= new Vector<String>();
		l.add("mango");
		l.add("apple");
		//l.remove(0);
		l.add("orange");
		//l.clear();
		System.out.println(l.size());
		l.set(2, "mellon");
		System.out.println(l.contains("mango"));
		System.out.println(l);
		System.out.println(l.isEmpty());
		Collections.sort(l);
	
		
		//l.sort(); - -this gives compilation error
		Iterator<String> s= l.iterator();
	
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
	}
//you can also use "for" loop to iterate in list.Also you can use foreach lamda expression to loop.
	
	//example
	  // initializing ArrayList 
   /* List<Integer> numbers = Arrays.asList(1, 2, 3,  
                                   4, 5, 6, 7, 8); 

       //lambda 
    numbers.forEach(number->System.out.println(number)); 
*/
}
