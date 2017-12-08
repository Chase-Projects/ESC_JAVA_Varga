
import java.util.Scanner;

public class BMICalcBetter
{
	public static void main( String[] args)
	{ 
		Scanner keyboard = new Scanner(System.in);
	
	
	
		int feet, inches, pounds, BMI;
		
		
		System.out.print("How many feet tall are you? ");
		feet = keyboard.nextInt();
	
		System.out.print("How many inches? ");
		inches = keyboard.nextInt(); 
		
		System.out.print("How many pounds do you weigh? ");
		pounds = keyboard.nextInt(); 
		
		
		
		System.out.print("Your BMI is : " + ( pounds / (feet + inches) ) + " ");
		BMI= pounds / (feet + inches);
		
		if ( BMI < 18.5)
		{
			System.out.println("You are underweight");
		}
		else if ( BMI > 18.5 && BMI < 24.9 )
		{
			System.out.println("You are normal weight");
		}		
		else if ( BMI > 25.0 && BMI < 29.9)
		{
			System.out.println("You are overweight");
		}		
		else if ( BMI > 30.0)
		{
			System.out.println("You are obese");
		}
		
		
		keyboard.close();
		
	}		
}