import java.util.Scanner;

public class Ageln5
{
	public static void main( String[] args)
	{ 
		Scanner keyboard = new Scanner(System.in);
	
	
		String name;
		int age;
	
	
		System.out.println("What is your name?");
		name = keyboard.next();
	
		System.out.println("Hi, " + name + " How old are you?");
		age = keyboard.nextInt();
		
		System.out.println("Did you know that in 5 years you will be " + (age + 5) + " years old?");
		System.out.println("And five years ago you were " + ( age - 5 ) + "! Imagine that!");
		
		keyboard.close ();
	}
}
