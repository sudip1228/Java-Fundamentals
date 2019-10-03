package librarymanagementsystem;

public class librarysubjects {
	public void math() {
		System.out.println("");
		String [] subjects= {"algebra","arithmetic","geometry"};
		System.out.println("math subjects are; ");
		for(String sub:subjects) {
			System.out.println(sub);
		}
	}

public void science() {
	System.out.println("");
	String [] subjects= {"chemestry","physics","biology"};
	System.out.println("science subjects are: ");
	for(String sub:subjects) {
		System.out.println(sub);
	}
}
}