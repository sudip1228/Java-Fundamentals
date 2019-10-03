package generics;

public class genericrunner {

	public static void main(String[] args) {
	mylist<String> l= new mylist<>();
	l.add("e1");
	l.add("e2");
	String value= l.get(0);
		System.out.println(value);
			
	mylist<Integer> k= new mylist<>();
	k.add(Integer.valueOf(5));
	k.add(Integer.valueOf(7));	
	Integer i= k.get(0);
	System.out.println(i);
	}

}
