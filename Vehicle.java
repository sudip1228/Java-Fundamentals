package interface_project;

interface Vehicle {

	//final miles;--not permitted 
	
	//int mile;-- not allowed to put member or instance variables.
		
	//public abstract void start();--it is allowed to put abstract but not necessary.
	
	public void start();
	public void run();//no need to put abstract keyword because this method is already abstract behind the scene.
	
}
