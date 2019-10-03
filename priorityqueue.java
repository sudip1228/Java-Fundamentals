package queue_project;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


class stringlength implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		
		return Integer.compare(o1.length(), o2.length()); //comparing length in ascending order.
															//eg tiger has length=5 cat has length=3.so output will be cat,tiger.
	}
	
}


public class priorityqueue {

	public static void main(String[] args) {
		Queue<String> q= new PriorityQueue<String>(new stringlength());//output is displayed in order form.
		//All the elements are displayed as output no matter how many times it is repeated.
		
		/*q.add("sudip");
		q.add("yukesh");
		q.add("girish");
		q.add("anima");
		q.add("anima");
		*/
		q.addAll(List.of("lion","cat","zebra"));//this is displayed orderly.
		q.add("tiger");// this is added after.
		q.offer("monkey");//it adds.
		//Collections.sort(q); i do not know why this show compilation error.
		System.out.println("head: "+ q.element());
		System.out.println("head: "+q.peek());   //prints head
	
		System.out.println(q);
		Iterator<String> s= q.iterator();
 while(s.hasNext())
{
	System.out.println(s.next());
}
//q.remove();
q.poll();// it removes.
q.poll();
q.remove();
System.out.println("iteration after removing: ");

Iterator<String> t= q.iterator();
while(t.hasNext())
{
	System.out.println(t.next());
}

	}
	
	

}
