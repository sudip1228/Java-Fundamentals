package concurrency_project;

import java.util.ArrayList;
import java.util.List;

public class bicounter {
	
private int i=0;
private int j=0;
//only one thread is allowed to enter either(or any one) of the synchronized method.other threads have to wait.It impacts performance.
public int getj() {
	

	return i;
}

 synchronized public void incrementj() {
	j++;
 }
 
 synchronized public void incrementi() {
		i++;
	 }

}
