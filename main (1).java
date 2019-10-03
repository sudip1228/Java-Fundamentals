package enum_project;

import java.util.Arrays;

enum Day{
	//enum full form is enumerations. enum is keyword.
					//enum can be declared inside or outside the class except inside the method.
	//you can also declare the main method inside the enum.
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;//these are called enum constants and they are objects as well.
	/* internally above enum Day is converted to
class Day
{
public static final Day SUNDAY = new Day();
public static final Day MONDAY = new Day();
so, Every enum constant represents an object of type enum.
}*/
}
public class main 
{ 		
    Day day; 
  
    // Constructor 
    public main(Day day) 
    { 
        this.day = day; 
    } 
  
    // Prints a line about Day using switch 
    public void dayIsLike() 
    { 
        switch (day) 
        { 
        case MONDAY: 
            System.out.println("Mondays are bad."); 
            break; 
        case FRIDAY: 
            System.out.println("Fridays are better."); 
            break; 
        case SATURDAY: 
        case SUNDAY: 
            System.out.println("Weekends are best."); 
            break; 
        default: 
            System.out.println("Midweek days are so-so."); 
            break; 
        } 
    
    }
	public static void main(String[] args) {
		Day d= Day.MONDAY;
		System.out.println(Day.FRIDAY.ordinal());
		Day o= Day.FRIDAY; //just a reminder.instance variable can access the instance method as well as static method.
		//Class name is used to access only static method.
		System.out.println(o.ordinal());
		System.out.println(d);
		String str= "MONDAY";
		main t= new main (Day.MONDAY); // or main m= new main(Day.valueOf(str));
		t.dayIsLike();
		
		System.out.println(Day.valueOf(str));
		Day [] f= Day.values();
		System.out.println(f.toString());//do not know why this gives unreadable output.
		System.out.println(Arrays.toString(Day.values()));//or System.out.println(Arrays.toString(f)) .if you do not write to Arrays.string method. it wont show compilation error but the output is in unreadable format.
		for( Day k:f) {
		System.out.println("values= "+k+"index at "+k.ordinal());//major methods of enum are ordinal,values and valueof.
	
		}
				//String []s= Day.values();---it shows compilation error because Day.Values (meaning enum constants) gives the objects.
		//objects cannot be assigned to String. 
		System.out.println();
		

	}

}
