package thread_project;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//learn how to return from threads.
class call implements Callable<String>{//<String>it means the class is of string and we return string.

	private String name;
	public call(String name) {
		this.name=name;
	}
	@Override
	public String call() throws Exception {//returning from thread. called automatically when a constructor is called.
		Thread.sleep(1000);
		return "hello "+name;
	}
	
}

public class callablerunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService e= Executors.newFixedThreadPool(1);
		Future <String> f=e.submit(new call("sudip"));//use submit if need to return the value.only useful for those class which implements Callable interface.
		String w=f.get();//Future is a promise that we will have a result in a later point in time. It waits if necessary for at most the given time for the computation to complete, and then retrieves its result, if available.
		System.out.println(w);//the below code is only executed when the future gets the result.if there is no result,then also the following code is executed.
		System.out.println("callable executed");
		System.out.println("\n main completed");
	}
	

}
