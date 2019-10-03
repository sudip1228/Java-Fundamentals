package functional_programing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class functionrunner {

	public static void main(String[] args) {
		
		List<String> l= List.of("apple","guava","banana","mango");
		l.stream().filter(element->element.endsWith("go"))
		.forEach(element->System.out.println("element-"+element));//(->) this sign is called lamda expression. 
		//this code does not loop but convert the elements into stream.
		
		String []kl= new String[2];
		kl[0]="sudip";
		kl[1]="mohan";
		for(int i=0; i<kl.length;i++) {
			System.out.println("array is "+kl[i]);
		//System.out.println(kl);..this wont print a readable output.
		}
		intermediate();
		terminal_operation();
		
		/*for(String f:l)//functional programming eliminates this lengthy code.
		{
			
			if(f.endsWith("go"))
			{
				System.out.println(f);
			
			}
		
		}
		*/
		List<Integer> i= List.of(2,6,3,1);
	i.stream().filter(e->e %2==1).forEach(e->System.out.println(e));//prints odd numbers.
	//i.stream().filter(e->e %2==1).forEach((e)->System.out.println(e));//same code as above.jus (e) is differene.we can do that.
	int sum=i.stream().reduce(0,
			(n1,n2)->n1+n2);//prints sum of numbers.Reduces all elements to one output.n1 and n2 are called parameters.0 is starting value.
	System.out.println(sum);
	
	int sum_odd=i.stream().filter(e->e%2==1).reduce(0,(n1,n2)->n1+n2);//filter odd numbers to sum.
	
	System.out.println(sum_odd);

	//inline feature in eclipse reduces the duplicate codes or unnecessary codes.
	//functional programing avoids mutations and dont worry about how to do it.It just worry about what to do.
	//lamda expression is nothing but short cut method.
	//reduce,collect,max,min foreach-terminal operation. intermediate operation are distinct,filter,sort,map.stream are two types terminal and intermediate operations.
	functionalinterface();
	method_references();
}
	public static void intermediate() {
		
		List<Integer> i= List.of(2,6,3,1,6,2);
		IntStream.range(1,11).forEach(p->System.out.println("range is "+p));//1 is inclusive and 11 is exclusive.
		IntStream.range(1,11).map(e->e+e).forEach(p->System.out.println("square of range is "+p));
		i.stream().sorted().forEach(e->System.out.println("sorted= "+e));//only one terminal operation is allowed.
		i.stream().distinct().forEach(e->System.out.println("distinct= "+e));
		i.stream().distinct().sorted().forEach(e->System.out.println("distinct and sorted= "+e));//multiple intermediate operation is allowed.
		i.stream().distinct().map(e->e*e).forEach(f->System.out.println("distinct and mapped(square)= "+f));
		i.stream().distinct().sorted().map(e->e*e).forEach(f->System.out.println("distinct,sorted and mapped(square)= "+f));
		
		
		
		List.of("apple","guava","banana","mango").stream().map(s->s.toLowerCase()).forEach(p->System.out.println(p));
		List.of("apple","guava","banana","mango").stream().map(s->s.length()).forEach(p->System.out.println(p));
		
		
		

		
	}
	
	public static void terminal_operation() {
		
		
		 int k=List.of(2,6,3,1,6,2).stream().max((n1,n2)->Integer.compare(n1, n2)).get();//it is working same as a comparator.gives maximum number.
		 System.out.println("max is " +k);
		 //Optional<Integer> b=List.of(2,6,3,1,6,2).stream().max((n1,n2)->Integer.compare(n1, n2));
		//System.out.println("max is "+b.get());  ....same as above.using optional here.
		 
		 Optional<Integer> h=List.of(7,5,1,3).stream().filter(e->e%2==0).max((n1,n2)->Integer.compare(n1, n2));//optional is used.
		 System.out.println("max is "+h);  //optional is used so that the null is not printed as a output.
		System.out.println(h.isPresent());
		System.out.println(h.isEmpty());
		System.out.println("orelse "+h.orElse(7));
		
		int d=List.of(2,6,3,1,6,2).stream().filter(e->e%2==0).max((n1,n2)->Integer.compare(n1, n2)).orElse(0);//returns 0 if no even numbers.
		System.out.println(d);
		List<Integer> a=List.of(2,6,3,1,6,2).stream().filter(e->e%2==1).collect(Collectors.toList());//prints a output as a list.
		System.out.println("list of odd num is "+ a);
		List<Integer>p= List.of(2,6,3,1,6,2).stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println("list of even num is "+p);
		List<Integer> f=IntStream.range(1,11).map(e->e*e).boxed().collect(Collectors.toList());
		System.out.println("list of square is "+f);
		
	
	
	List<String> mn= Arrays.asList("sudip","johnson","sushila");
		System.out.println(mn);
		//reduce is terminal operation.
	}
	
	public static void functionalinterface() {
		consumer c= new consumer();//optional way to do it.
		List.of(2,6,3,1,6,2).stream().filter(n->n%2==1).forEach(e->System.out.println("functional "+e));
		List.of(2,6,3,1,6,2).stream().filter(new predicate()).forEach(new consumer());
		List.of(2,6,3,1,6,2).stream().filter(n->n%2==1).forEach(c);//same thing as above
		List.of(2,6,3,1,6,2).stream().filter(n->n%2==1).map(new map()).forEach(new consumer());
		
		//predicate interface is used behind the screen to execute filter(n->n%2==1);uses unimplemented test method which returns boolean. 
		//consumer interface is used behind the screen to execute foreach(sysout(e));uses unimplemented accept method.
		//function interface is used behind the screen to execute map.uses unimplemented Integer apply  method.
		//predicate,consumer,function interface all have only one unimplemented method.So,implement it.
	}
	
	public static void display(Integer in) {
		System.out.println(in);
	}
	
	public static boolean iseven(Integer i)
	{
		return i%2==0;
	}
	public static void method_references() {
		List.of("apple","guava","banana","mango").stream().map(s->s.length()).forEach(s-> System.out.println("length is "+s));
		
		List.of("apple","guava","banana","mango").stream().map(s->s.length()).forEach(System.out::println);//this is called method reference.It is a shortcut.it makes the code more readable.
						//left side of colon is class and right side is method.
		
		List.of("apple","guava","banana","mango").stream().map(s->s.length()).forEach(functionrunner::display);//same as above.left is class and right is method.
		List.of("apple","guava","banana","mango").stream().map(s->s.length()).forEach(s->functionrunner.display(s));//samething as above
		List.of("apple","guava","banana","mango").stream().map(String::length).forEach(functionrunner::display);//instance method can also be used.here length is instance method of string.
		
		Integer max=List.of(2,6,3,1,6,2).stream().filter(e->e%2==0).max((n1,n2)->Integer.compare(n1, n2)).orElse(0);
		Integer ma=List.of(2,6,3,1,6,2).stream().filter(functionrunner::iseven).max(Integer::compare).orElse(0);
		System.out.println("method reference "+ ma);
	}
	
	
}

class predicate implements Predicate<Integer>{//class<Integer> because our list is integer.If list was string, then write <String>.

	@Override
	public boolean test(Integer t) {
		
		return t%2==0;// returns true if the condition is true.
	}
	
}


class consumer implements Consumer<Integer>{//called automatically when empty constructor is called.

	@Override
	public void accept(Integer t) {
	
		System.out.println("consumer " +t);
		
	}
	
}

class map implements Function<Integer,Integer>//called automatically when empty constructor is called.
{

	@Override
	public Integer apply(Integer t) {
		
		return t*t;
	}
	
}







