package abstract_project;

abstract class student {
	

	public void details() {
		roll();
		firstname();
		lastname();
		
	}
	abstract void roll();
	abstract void firstname();
	abstract void lastname();
	
	void attendance()
	{
		System.out.println("abscent");
	}
	
}
