package concurrency_project;

import java.util.concurrent.atomic.AtomicInteger;

public class bicounterwithatomicinteger {
	
	//AtomicInteger is useful for a simple operations.For multiple operation, use locks.
	//Atomic integer is one of the atomic class.
	//The most commonly used atomic variable classes in Java are AtomicInteger, AtomicLong, AtomicBoolean, and AtomicReference.
	//These classes represent an int, long, boolean and object reference respectively which can be atomically updated.
	private AtomicInteger i= new AtomicInteger() ;
	private AtomicInteger j= new AtomicInteger() ;
	
	public int getj() {
		
		return j.get();
	}

	 public void incrementj() {
		j.incrementAndGet();//it is thread safety.

}
	 
	 public void incrementi() {
			i.incrementAndGet();
		 }

	

}
