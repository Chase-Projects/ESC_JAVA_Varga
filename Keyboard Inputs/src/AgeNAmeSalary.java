import java.util.Scanner;

public class AgeNAmeSalary 
{
	public static void main( String[] args)
	{ 
		Scanner keyboard = new Scanner(System.in);
		
		
		String name;
		int age, salary;
		
		 System.out.println("Howdy. What is your name?");
		 name=keyboard.next();
		
		 System.out.println("Hi " + name + "! How old are you?");
		 age=keyboard.nextInt();
		
		 System.out.println("So you are " + age + "? I guess thats not too old " + name + ".");
		 System.out.println("how much do you make per hour?");
		 salary=keyboard.nextInt();
		 
		 System.out.println("Wow, " + salary + "i s a lot for you age");
		
		keyboard.close ();

	
	
	
	
	
	
	}
}