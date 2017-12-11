
import java.util.Random;
import java.util.Scanner;

public class KeepGuessingCount 
{
	public static void main( String[] args )
	{
	Scanner keyboard = new Scanner(System.in);
	Random r = new Random();
	int number = 1 + r.nextInt(10), guess, times;
	
	System.out.println("Im thinking of a number 1-100. try to guess it");
	
	
	guess = keyboard.nextInt();
	times = 1;
	
	while( guess != number)
	{
		System.out.println("Wrong number please try again");
		System.out.print("Your next guess is:");
		guess = keyboard.nextInt();
		times ++ ;
	}
	
	System.out.println("Congrats Thats it!!");
	System.out.println("You've got it in " + times + " steps");
	
	keyboard.close();

	}	

}