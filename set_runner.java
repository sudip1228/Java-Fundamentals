package set_project;

import java.util.*;

public class set_runner {

	public static void main(String[] args) {
		//Set<String> m=Set.of("honda","audi","bmw","mercedes");
//Set<String> s= new HashSet<String>(m);
		Set<String> s= new HashSet<String>();//output is unique and not repeated.
	System.out.println("hash set is in random order: ");
		s.add("carrot");
		s.add("cucumber");
		s.add("raddis");
System.out.println(s);

System.out.println("linked hash map is in insertion order: ");

Set <String> m= new LinkedHashSet<String>();
m.add("guava");
m.add("mango");
m.add("apple");
m.add("apple");
//Collections.sort(m);  shows compliation error.but the same thin thing in list doesnot show compilation error.
System.out.println(m);

System.out.println("Tree map is in order form: ");

Set <String> k= new TreeSet<String>();  //tree always implements navigable interface along with the respective interface.
											//eg treemap implements navigablemap and map interface.
k.add("melon");								//eg treeset implements navigableset and set interface.
k.add("berry");
k.add("strawberry");
System.out.println(k);
System.out.println("hash set is: ");
for (String l:s) {
	System.out.println(l);
}
System.out.println("linked hash set is: ");
Iterator<String> itr= m.iterator();
while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
System.out.println("Treset is: ");
for(String b:k) {
	System.out.println(b);
}
	}

}
