
public class ElseAndIf 
{

		public static void main( String[] args) 
		{
			int people= 30;
			int cars=40;
			int buses = 15;
			
			if ( cars > people )
			{
				System.out.println("We should take the cars");
			}
			else if ( cars < people )
			{
				System.out.println("We should not take the cars");
			}
			else
			{
				System.out.println("We cant decide");
			}
			
			if ( buses > cars )
			{
				System.out.print("Thats too many buses.");
			}
			else if ( buses < cars )
			{
				System.out.println("Maybe we should take the buses");	
			}
			else
			{
				System.out.println("We cant decide");
			}
			
			if ( people > buses )
			{
				System.out.println("All right, lets just take the buses");
			}
			else
			{
				System.out.println("Fine, lets stay home then");
			}

		//The if first checks if a command is true then goes to the function it was told to
			//If it is not true it checks 
			
	}
}
