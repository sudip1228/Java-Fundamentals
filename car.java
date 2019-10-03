package interface_project;

public class car implements Vehicle {

	private int miles;
	private int door=4;//door is always 4 because the door is not included in constructor as a parameter.
	//however, the number of door can be changed by using the setter method if required.
	private String name="honda";//this does not affect.The name of the car changes with objects even you initialize name of the car.
	//this is because we have the included name of the car in constructor as a parameter.
	
	public car(int miles, String name) {
		//super();  --calls parent class constructor if any.
		this.miles = miles;
		//this.door = door;---not needed.
		this.name = name;
		//System.out.println("this car is unsold")--you can do this but not required in this case.
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMiles() {
		return miles;
	}

	public int getDoor() {
		return door;
	}

	public String getName() {
		return name;
	}

	@Override
	public void start() {
		System.out.println("car started");
		
	}

	@Override
	public void run() {
		System.out.println("car is running");
		
	}
	public void details() {
		System.out.println("name of the car is  "+getName()+".miles is "+getMiles()+".number of door is "+getDoor());
	}

}
