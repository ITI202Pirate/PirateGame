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
			System.out.println("[2] - Ship");
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
					
				break;
				
				
				case 2:
					
				break;	
				
				
				case 3:
					System.out.println("Exiting the port.");
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

}
