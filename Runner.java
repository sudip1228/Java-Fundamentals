package inheritance_project;

public class Runner {

	public static void main(String[] args) {
		dog d= new dog();//instance of dog can access dog and animal both.also it can access static method of animal and dog.
		d.run();// run method of dog is called.use animal object to access the run method of animal.
		
		
		animal a= new animal();
		a.run();//instance of animal class can only access animal class not the dog class.
		
	

	}

}
