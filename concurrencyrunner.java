package concurrency_project;

public class concurrencyrunner {

	public static void main(String[] args) {
	counter c=new counter();
	c.increment();
	c.increment();
	c.increment();
	System.out.println(c.getI());
	
	}

}
