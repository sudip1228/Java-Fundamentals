package librarymanagementsystem;

import java.util.Scanner;

public class library_runner {
	

	public static void main(String[] args) {
		
System.out.println("enter 0 to start the system ");
Scanner  in=new Scanner(System.in);
int choice=in.nextInt();
while(choice==0) {
	
	System.out.println("enter 1 for student details:\nenter 2 for subjects ");

	int num=in.nextInt();
	if (num==1) {
		System.out.println("enter first name: ");
		
		library lib=new library();
		String fn=in.nextLine();
		String f=in.nextLine();
		lib.firstname=f;
		
		System.out.println("enter last name: ");
		String ln=in.nextLine();
		lib.lastname=ln;
		
		System.out.println("enter sem name: ");
		int sem=in.nextInt();
		lib.sem=sem;
		
		System.out.println("enter id: ");
		int id=in.nextInt();
		lib.id=id;
		//lib.setter(lib.firstname, lib.lastname, lib.sem, lib.id);  i think it is optional to pass parameter.
		lib.get();
		
		in.close();
	}
	else if(num==2) {
		librarysubjects sub=new librarysubjects();
		System.out.println("enter 1 for math subject:\nenter 2 for science subject ");
		int value=in.nextInt();
		if(value==1)
		{
		sub.math();
		}
		else if(value==2) {
		sub.science();
		}
		
	}
}

	}

}
