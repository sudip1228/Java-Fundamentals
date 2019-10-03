package librarymanagementsystem;

public class library {
public String firstname;
public String lastname;
public int sem;
public int id;

/*public void setter() {
	this.firstname=firstname;
	this.lastname=lastname;
	this.sem=sem;
	this.id=id;	
}
*/ //you can also use this method if you decided not to pass parameter.

public void setter(String firstname, String lastname, int sem,int id) {
	this.firstname=firstname;
	this.lastname=lastname;
	this.sem=sem;
	this.id=id;
	
	
}
public void get()
{
	System.out.println("first name is "+firstname);
	System.out.println("last name is "+lastname);
	System.out.println("semester is  "+sem);
	System.out.println("id is "+id);
}
}
