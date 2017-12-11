import java.util.Random;
import java.util.Scanner;

public class HilowLimited
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		int x = 1 + r.nextInt(100), guess, times;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Im thinking of a random numer 1-100 try to guess it ");
		System.out.println( "> ");
		guess = keyboard.nextInt();
		times = 1;
		
		while(times < 7)
		{
			
		if( x == guess )
		{
			System.out.println( "Woah, you got my number!");
			times ++ ;
			times ++ ;
			times ++ ;
			times ++ ;
			times ++ ;
		}
		else
		{
		if (x < guess )
		{
			System.out.println( "Thats too high, try to guess again.");
			times ++ ;
			guess = keyboard.nextInt();
		}
		if (x > guess )
		{
			System.out.println( " Thats too low, try to guess again. " );
			times ++ ;
			guess = keyboard.nextInt();
		}
		}
		}
		System.out.println( "You've run out of tries " );
	
	}
	
	
}

