
import java.util.Scanner;

public class SpaceBoxing
{
	public static void main( String[] args)
	{ 
		Scanner keyboard = new Scanner(System.in);
	
	
		int weight;
		String planet;
	
		
		
		System.out.print("Please enter your current earth weight ");
		weight = keyboard.nextInt();
	
		System.out.print(" ");
		System.out.println("I have Information on the following plantets");
		System.out.println("  1.Venus  2.Mars     3.Jupiter ");
		System.out.println("  4.saturn 3.Uranus   6.Neptune");
		System.out.println(" ");
		
		System.out.print("  ");
		System.out.println(" Which planet are you visiting? ");
		planet = keyboard.next();
		
		
		if (planet.equals ("Venus"))
		{
			System.out.println("Your weight on Venus is " + ( weight * 0.78 ) + "pounds on that planet.");
		}
		else if (planet.equals("Mars"))
		{
			System.out.println("Your weight on Venus is " + ( weight * 0.39 ) + "pounds on that planet.");
		}		
		else if (planet.equals("Jupiter"))
		{
			System.out.println("Your weight on Venus is " + ( weight * 2.65 ) + "pounds on that planet.");
		}		
		else if (planet.equals("Saturn"))
		{
			System.out.println("Your weight on Venus is " + ( weight * 1.17 ) + "pounds on that planet.");
		}		
		else if (planet.equals("Neptune"))
		{
			System.out.println("Your weight on Venus is " + ( weight * 1.05 ) + "pounds on that planet.");
		}		
		else if (planet.equals("Uranus"))
		{
			System.out.println("Your weight on Venus is " + ( weight * 1.23 ) + "pounds on that planet.");
		}		
		
		
		keyboard.close();
		
	}		
}