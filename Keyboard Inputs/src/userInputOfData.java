import java.util.Scanner;

public class userInputOfData
{
	public static void main( String[] args)
	{ 
		Scanner keyboard = new Scanner(System.in);
		
		String name, namelast, login;
		int grade;
		double ID, gpa;
		
		 System.out.println("Please enter the following information so I can sell it for a  profit");
		 
		 System.out.print("First name:");
		 name=keyboard.next();

		 System.out.print("Last name:");
		 namelast=keyboard.next();
		 
		 System.out.print("Grade (9-12):");
		 grade=keyboard.nextInt();
		 
		 System.out.print("Student ID:");
		 ID=keyboard.nextDouble();
		 
		 System.out.print("Login:");
		 login=keyboard.next();
		 
		 System.out.print("GPA (0.0-4.0):");
		 gpa=keyboard.nextDouble();
		
		 System.out.println(" ");
		 System.out.println(" Your Information");
		 System.out.println("Login: " + login + " ");
		 System.out.println("ID: " + ID + " ");
		 System.out.println("Name: " + namelast + "," + name + " ");
		 System.out.println("GPA: " + gpa + " ");
		 System.out.println("Grade " + grade + " ");

		 
		 
		 keyboard.close ();
	
	
	}
}