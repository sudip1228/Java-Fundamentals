package concurrency_project;

public class counter {
public volatile int i=0;//volatile keyword is used for thread safety.

public int getI() {
	return i;
}

 synchronized public void increment() {
	i++;//update of i might be lost if called by multiple thread.so, it is not thread safety.synchronized method can only be accessed by one thread at a time and other threads have to wait which makes a thread safety.
	//15
	//get  i 15 15..first thread(t1)=15,second thread(t2)=15
	//increment 16 t1=16 t2=16
	//set i  t1=16 t2=16.here the same code is run by two threads but the output is 16.Actually it should be 17 because the same code is run twice.so, we use synchronized method to make the thread safer.
}
}
