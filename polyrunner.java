package polymorphism;

public class polyrunner {

	public static void main(String[] args) {
		animal[]a= {new cat(),new dog()};
		for(animal g:a) {
			g.bark();// the override method of cat and dog bark is called instead of animal 
		}
	}

}
