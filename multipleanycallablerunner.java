package thread_project;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class multipleanycallablerunner {
//waits only for one fastest task.
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService e= Executors.newFixedThreadPool(3);//if you run one thread.it gives you only one type of output every time.If you run 3 threads, it gives you 3 kinds  of different output. 
		List<call> l=List.of(new call("sushila"),new call("melisha"),new call("sharmananda"));
		String f=e.invokeAny(l);//this code waits and collects a output of a single string.
	
			System.out.println(f);
		
		e.shutdown();

	
	}

	}


