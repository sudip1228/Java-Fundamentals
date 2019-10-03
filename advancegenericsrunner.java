package generics;

import java.util.ArrayList;
import java.util.List;

public class advancegenericsrunner {//note: the class is not generic.only the method is generic.
	
	/*static<String > String somethin(String value) {//just a example.this code compiles.
		//String a="sudip";..not allowed
		return  value;
	}
	
*/
	
	static<X > X something(X value)//generic method.<X>.This sign indicates what type of method it is or what kind of 
	{
								
		return value;
		
	}
	static<X extends List> void duplicate(X list)// all the lists can call this generic method without creating object in main method.
	{
		
		list.addAll(list);
		
	}
	static double sum(List<? extends Number>numbers) {//lists which extends Number class can call this generic method.(?) is called a wildcard.extend wildcard is called upperbounded wildcard.super is called lowerbounded wild card.
		double sum= 0.0;			//wildcard is used to indicate what kind of arguments can be passed to a method.
		for(Number n:numbers) {
			sum+= n.doubleValue();//use += not =+.They are different=+ prints the value of last index. 
		}
		return sum;
	}
	
	static void sumvalue(List<? super Number>numbers) {//helps to add sub types of numbers.only Integer or superclass of Integer can be passed as argument.
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1L);
		numbers.add(1.0f);
	}
	
	public static void main(String[] args) {
		List empty= new ArrayList<Number>();//Here arguments can be Integer or superclass of Integer(which is Number).However if we pass list of type Double then we will get compilation error. 
							//It is because only the Integer field or its superclass can be passed . Double is not the superclass of Integer.
		sumvalue(empty);
		System.out.println(empty);
		
		
		System.out.println(sum(List.of(1,2,3,4,5)));//here float,double and long, all are subclass of Number.So, this list can be passed.
		System.out.println(sum(List.of(1.1,2.2,3.2)));
		System.out.println(sum(List.of(1L,2L)));
		
		ArrayList<Integer> numbers= new ArrayList<>(List.of(1,2,3));
		duplicate(numbers);//calling duplicate method.
		System.out.println(numbers);
		
		
		
		String value1=something(new String()); 
		Integer value2= something(Integer.valueOf(5));
		ArrayList list1=something(new ArrayList());
															
		advancegenerics<Long> l= new advancegenerics<>();
		l.add(2L);
		l.add(3L);
		Long value= l.get(0);
			System.out.println(value);
				
			advancegenerics<Integer> k= new advancegenerics<>();
		k.add(Integer.valueOf(5));
		k.add(Integer.valueOf(7));	
		Integer i= k.get(0);
		System.out.println(i);

	}

}
