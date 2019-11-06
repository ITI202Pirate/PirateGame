import java.util.Scanner;

public class MainMenu
{

	public static void main(String[] args) 
	{
		
		int tracker = 0;
		
		while(tracker != 3)
		{
			System.out.println("Welcome to [game name]");
			System.out.println("");
			System.out.println("-------------------------");
			System.out.println("[1] - Start Game");
			System.out.println("[2] - Load Game");
			System.out.println("[3] - Exit");
			System.out.println("-------------------------");
			System.out.println("");
			System.out.println("Type in the number for which command you would like to execute");
			
			try
			{
				Scanner mainMenuInput = new Scanner(System.in);
				int mainMenuRead = mainMenuInput.nextInt();
			
				
				if(mainMenuRead == 1)
				{
					// insert new game 
					mainMenuRead = -1;
				}
			
				
				else if (mainMenuRead == 2)
				{
					// insert saved game
					mainMenuRead = -1;
				}
			
				
				else if (mainMenuRead == 3)
				{
				
					System.out.println("Are you sure you want to exit? (y/n)");
					Scanner inputExit = new Scanner(System.in);
					String exitRead = inputExit.nextLine();
				
					if(exitRead.equals("y"))
					{
						System.out.println("Thanks for playing!");
					}
				
					else if(exitRead.equals("n"))
					{
						mainMenuRead = 100;
					}
				
					else
					{
						System.out.println("That is an invalid input.");
						mainMenuRead = 100;
					}
					
				}
				
				
				else if (mainMenuRead == 100)	
				{
					//included so that the "invalid input" message doesn't show
				}
				
				
				else
				{	
					System.out.println("That is an invalid input.");
				}
				
				
				tracker = mainMenuRead;
			}
			
			
			catch(Exception e)
			{
				System.out.println("That is an invalid input.");
			}
			
		}
		
	}

}
