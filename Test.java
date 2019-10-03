package enum_project;
class a{
	int j=5;
	int b=6;
	public a()
	{
		System.out.println(this.toString());//this does not work same as enum constructor but it complies.
	}
}

enum Color
{
	 RED, GREEN, BLUE; 
	  
    // enum constructor called separately for each 
    // constant 
    private Color() 
    { 
        System.out.println("Constructor called for : " + 
        this.toString()); 
    } 
  
    // Only concrete (not abstract) methods allowed 
    public void colorInfo() 
    { 
        System.out.println("Universal Color"); 
    } 
}


public class Test {

	public static void main(String[] args) {
		// Driver method 
	
	        Color c1 = Color.RED; 
	        System.out.println(c1); 
	        c1.colorInfo(); 
	    /* 1)enum can contain constructor and it is executed separately for each enum constant at the time of enum class loading.
	        2) We can’t create enum objects explicitly and hence we can’t invoke enum constructor directly.
3) enum can contain concrete methods only i.e. no any abstract method.
4) First line inside enum should be list of constants and then other things like methods, variables and constructor.
5) According to Java naming conventions, it is recommended that we name constant with all capital letters
6)Every enum constant is always implicitly public static final. Since it is static, we can access it by using enum Name.
 Since it is final, we can’t create child enums.
7)We can declare main() method inside enum. Hence we can invoke enum directly from the Command Prompt.

Enum and Inheritance :

1)All enums implicitly extend java.lang.Enum class. As a class can only extend one parent in Java, so an enum cannot extend anything else.
2) toString() method is overridden in java.lang.Enum class,which returns enum constant name.
3) enum can implement many interfaces.

values(), ordinal() and valueOf() methods :

These methods are present inside java.lang.Enum.
1) values() method can be used to return all values present inside enum.
2) Order is important in enums.By using ordinal() method, each enum constant index can be found, just like array index.
3) valueOf() method returns the enum constant of the specified string value, if exists.
*/
	}

}
