package concurrency_project;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class bicounterwithlocks {
//lock allows to access both synchronized methods at a time.However, if many threads are trying to access incrementj, only one is allowed.At the same time other another one thread can acces increment i.
	Lock fori=new ReentrantLock();
	Lock forj=new ReentrantLock();
	
	
	private int i=0;
	private int j=0;
	
	public int getj() {
		return j;
	}

	 public void incrementj() {//we are using locks so synchronized keyword is not needed.
		// fori.tryLock();..returns true if lock is found,otherwise returns flse.
		 
		 //i++ is not atomic operation.
		forj.lock(); //get lock for j
		j++;
		forj.unlock();//release lock for j.lock should be release so that the same lock can be used next time.
	 }
	 
	 public void incrementi() {
		fori.lock(); //get lock for i
			i++;
		fori.unlock();	//release lock for i
		 }

	
}
