package emailadmin;

public class emailrunner {

	public static void main(String[] args) {
		


email em=new email("sudip","koirala");

em.setMailboxcapacity(500);
System.out.println("email capacity of "+em.getFirstname()+em.getLastname()+" is "+em.getMailboxcapacity()+"mb");
email su=new email("sushila","koirala");
su.setMailboxcapacity(200);
System.out.println("email capacity of "+su.getFirstname()+su.getLastname()+" is "+su.getMailboxcapacity()+"mb");
}
}