package enum_project;

enum season{
			WINTER(1),SPRING(2),SUMMER(6),FALL(10);//need to create constructor if you assign value to enum constants.
													//Here, all the enum constants are calling the constructor. So, we have to create constructor.
	private int value;
	
	private season(int value)
	{
		this.value=value;
	}

	public int getValue() {
		return value;
	}

	
}

public class Enumrunner {

	public static void main(String[] args) {
	
		season a= season.SPRING;
			System.out.println(a.ordinal());// the ordinal and values are not same. No matter what is the ordinal of SPRING,its value remains same.
			System.out.println(a.getValue());
	}

}
