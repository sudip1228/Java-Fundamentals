package interface_project;

import java.util.Scanner;

public class interfacerunner {

	public static void main(String[] args) {
		Vehicle audi= new car(5,"audi");
		audi.run();//this is called polymorphism because 'audi' object calls run method of car instead of Vehicle.
		//polymorphism is allowed in interface.audi can only access the overrided methods in car class but it is not allowed
//to access unique method of car class.
		
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter miles ");
		int miles=s.nextInt();
		System.out.println("enter type of honda car ");
		String nam= s.nextLine();
		String name= s.nextLine();
		car honda= new car(miles,name);
		s.close();
		honda.details();
		
		honda.details();//this instance or object can access any method.
		honda.setName("honda accord");
		honda.setDoor(2);
		honda.details();
		car mitsubishu=new car(2000,"mitshubishi");
		mitsubishu.details();
		
		
		//String[] objects= {new car(3000,"bmw"), new car(5000,"mercedes")};--cant convert from car obect to string.not allowed
		Object[] objects= {new car(3000,"bmw"), new car(5000,"mercedes")};//allowed
		car[] object= {new car(3000,"bmw"), new car(5000,"mercedes")};//allowed
		
	}
}
