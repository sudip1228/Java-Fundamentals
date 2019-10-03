package comparator_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class descending implements Comparator<stu>
{

	@Override
	public int compare(stu stu1, stu stu2) { //automatically called when the empty or default constructor is called.
		
		return Integer.compare(stu2.getId(), stu1.getId());
	}
	
}


public class compare {

	public static void main(String[] args) {
		
		stu m= new stu(8,"jagmohan");
		System.out.println(m);		//neither getter or setter is used to print this output (m).In other word,
									//setter and getter method are not useful for this output and alone constructor is enough.
				//	new stu(6,"mohan");  -----    it does not show compilation error.
		m.setId(13);
		System.out.println(m);// new id is set but the name is same.
		m.setName("dinesh");
		System.out.println(m);//name is also changed.
		System.out.println(m.getId()); //getter is used to encapsulate the class fields and it is safer way to access properties of the class.
		System.out.println(m.getName());
		/*System.out.println(m.id);---if the id was public in class stu, this line of code would not have shown any compilation error.
		But ,the good practice is to encapsulate your data` with correct access modifier and setter and getter method.*/
		
	stu s= new stu(6,"mohan");
	List<stu> students= List.of(new stu(1, "sudip"),new stu(3, "sushila"),new stu(2, "melisha"),s);
				//list such as arraylist,linkedlist,vector is used when you need to modify(add,remove) the list.
	List<stu> all= new ArrayList<>(students);
	
System.out.println(students);
						//integer and string already implements comparable interface.
Collections.sort(all);			//only the objects or class which implements comparable interface can be put inside the brackets.
	
							//so now implement comparable interface for stu class.
	System.out.println("ascending order"+all); //comparable interface is used.
	
	Collections.sort(all, new descending());
	System.out.println("descending order; "+ all); //comparator is used.
	all.sort(new descending());//you can also use this instead of Collections.sort(all, new descending());
	System.out.println("descending order; "+ all); //comparator is used.
	}
//Collections.sort(all);...calling comparable
	//Collections.sort(all, new descending());...calling comparator.
}
