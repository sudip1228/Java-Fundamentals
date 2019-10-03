package concurrency_project;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyonwritearraylistrunner {

	public static void main(String[] args) {
		//copywritearraylist is same as arraylist but it has concurrency benefits.
		//it is costly but the access or reading speed of the data is very high.If there are very few updates or writes and very high amount of reading of data, then, it is useful. 
		//updates are slow because it copies or creates the whole array whenever modification is done.it synchronizes only the write operations which makes the writing slow.
		List<String> l= new CopyOnWriteArrayList<>();
		l.add("ant");
		l.add("bat");
		l.add("cat");
		
		for ( String s:l) {
			System.out.println(s);
		}

	}

}
