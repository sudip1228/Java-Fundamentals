package emailadmin;

import java.util.Scanner;

public class email {
	
private String firstname;
private String lastname;
private String  Email;
private String alternate_email;
private String department;
private int password;
private int mailboxcapacity;
public email(String firstname, String lastname) {
	
	this.firstname = firstname;
	this.lastname = lastname;
	System.out.println("email is: "+this.firstname+"."+this.lastname+"@"+departmentset()+"."+"microsoft.com");
	System.out.println("password: "+random_password(12));
	
}
public  String random_password(int length) {
	String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@#%!*^$=-_";
	char[] pass= new char[length];
	
	
		for (int i=0;i<length;i++) {
			
		
			int random=(int) (Math.random()*passwordset.length());
		
		pass[i]=passwordset.charAt(random);
		
	}
	return new String (pass);
}
public String departmentset() { //2
	System.out.println("enter department name from the list:");
	System.out.println("1:sales\n2:Developent\n3:Accounting\n4:none");
	Scanner in=new Scanner(System.in);
	int input=in.nextInt();
	switch(input) {
	case 1:
		department="sales";
		break;
	case 2:
		department="development";
		break;
	case 3:
		department="accounting";
		break;
	default:
		department="finance";
		break;
		
	}
	return department;
	
}
public String getFirstname() {
	return firstname;
}
public String getLastname() {
	return lastname;
}
public String getEmail() {
	return Email;
}
public int getMailboxcapacity() {
	return mailboxcapacity;
}
public void setPassword(int password) {
	this.password = password;
}
public void setMailboxcapacity(int mailboxcapacity) {
	this.mailboxcapacity = mailboxcapacity;
}
public void setAlternate_email(String alternate_email) {
	this.alternate_email = alternate_email;
}

}
