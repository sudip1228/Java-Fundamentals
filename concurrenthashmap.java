package concurrency_project;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class concurrenthashmap {
	
	public static void main(String[]args) {
	
		ConcurrentMap<Character,LongAdder>m=new ConcurrentHashMap<>();
		String str="ABCD ABCD ABCD";
		
		//char [] c= str.toCharArray(); for(char ch:c){}..same as below.
		//we use long adder to do atomic operation for thread safety.
		//when a different threads can access same method without any problem,it is called thread safety.
	
		for(char ch:str.toCharArray()) {
			
			m.computeIfAbsent(ch, c->new LongAdder()).increment();//you can use this because of concurrent operations.following code is not required.
			//it is a shortcut.it does atomic operation.
			//concurrenthashmap uses different locks for different regions.
			
			/*
			LongAdder l= m.get(ch);...these codes are same as above.
			if(l==null) {
			l= new LongAdder();
			}
			l.increment();
			m.put(ch, l);
		*/
			}
		System.out.println(m);
		}
	}
	
	


