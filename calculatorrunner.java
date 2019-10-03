package calculator_project;

import java.util.Scanner;

public class calculatorrunner {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		double answer=0.0;
		char operator;
		
		try {
		Scanner in= new Scanner(System.in);
		System.out.println("enter first num: ");
		num1=in.nextInt();
		
		System.out.println("enter 2nd num: ");
		num2=in.nextInt();
		
		System.out.println("select one operator from below: \n *,-,/,+ ");
		operator= in.next().charAt(0);
		//operator= in.nextLine();--you can also use this to take input of operaors.
		
		
		switch(operator)
		{
		case '+':			//''--this single quote means character. + is regarded as character.
			answer=num1+num2;
			break;
		case '-':
			answer= num1-num2;
			break;
			
		case '*':
			answer=num1*num2;
			break;
			
		case'/':
			answer=num1/num2;
			break;
		default:
			System.out.println("invalid opertor ");
			tryagain(); 
			in.close();
		}
		
		System.out.println( num1+" "+operator+ num2+" = "+ answer );
	}catch( Exception e)
	{
		System.out.println("entered number is invalid: ");
		tryagain();
	}
	

}
	public static void tryagain()// this method method be static to call from main
	{
		main(null);
	}

}
