import java.util.Scanner;

public class PortMenu
{

	public static void main(String[] args) 
	{
		int portRead = 0;
		
		while(portRead != 3)
		{
			
			System.out.println("Welcome to the port");
			System.out.println("");
			System.out.println("-------------------------");
			System.out.println("[1] - Store");
			System.out.println("[2] - Shipyard");
			System.out.println("[3] - Leave Port");
			System.out.println("-------------------------");
			System.out.println("");
			System.out.println("Type in the number for which command you would like to execute");
			
			try 
			{
			
				Scanner portInput = new Scanner(System.in);
				portRead = portInput.nextInt();
				
				switch(portRead)
				{
				
				case 1:
					store();
				break;
				
				
				case 2:
					ship();
				break;	
				
				
				case 3:
					System.out.println("Exiting the port...");
					//insert exploration options
				break;
				
				
				default:
					System.out.println("That is an invalid input.");
				break;	
				
				}
				
			}
			
			catch(Exception e)
			{
				System.out.println("That is an invalid input.");
			}
			
		}

	}
	
	
	public static void store()
	{
		int storeRead = 0;
		
		while(storeRead != 3)
		{
			
		System.out.println("Welcome to store");
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("[1] - Buy");
		System.out.println("[2] - Sell");
		System.out.println("[3] - Leave");
		System.out.println("-------------------------");
		System.out.println("");
		System.out.println("Type in the number for which command you would like to execute");
		
		try
		{
			
			Scanner storeInput = new Scanner(System.in);
			storeRead = storeInput.nextInt();
			
			switch(storeRead)
			{
			case 1:
				//buy
			break;	
			
			
			case 2:
				//sell
			break;
				
				
			case 3:
				System.out.println("Leaving the store...");
			break;
			}
		}
		
		catch(Exception e)
		{
			System.out.println("That is an invalid input.");
		}
		
		}
		
	}
	
	
	public static void ship()
	{
		
		int yardRead = 0;
		
		while(yardRead != 3)
		{
			
		System.out.println("Welcome to shipyard");
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("[1] - Repair");
		System.out.println("[2] - Recruit Crewmembers");
		System.out.println("[3] - Leave");
		System.out.println("-------------------------");
		System.out.println("");
		System.out.println("Type in the number for which command you would like to execute");
		
		try
		{
			Scanner yardInput = new Scanner(System.in);
			yardRead = yardInput.nextInt();
			
			switch(yardRead)
			{
				case 1:
					//repair
				break;	
				
				
				case 2:
					//recruit
				break;
					
					
				case 3:
					System.out.println("Leaving the shipyard...");
				break;
			}
		}
		
		catch(Exception e)
		{
			System.out.println("That is an invalid input.");
		}
		
		}
		
	}

}
