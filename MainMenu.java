package pirateGame;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu
{

	public static void main(String[] args) 
	{
		
		int mainMenuRead = 0;
		
		while(mainMenuRead != 3)
		{
			System.out.println("Welcome to Pirate Voyage");
			System.out.println("");
			System.out.println("-------------------------");
			System.out.println("[1] - Start Game");
		//	System.out.println("[2] - Load Game");
			System.out.println("[2] - Exit");
			System.out.println("-------------------------");
			System.out.println("");
			System.out.println("Type in the number for which command you would like to execute");
			
			try
			{
				Scanner mainMenuInput = new Scanner(System.in);
				mainMenuRead = mainMenuInput.nextInt();
			
				switch(mainMenuRead)
				{
					case 1:
						
						// insert new game 
						System.out.println("Enter Player Name");
						
						
						Player player=new Player();
						try {
							String name=mainMenuInput.next();
						player.setName(name);
						}catch(InputMismatchException e) {
							
						}
						System.out.println("Welcome, Captain: "+player.getName());
						
						player.setSwordSkill();
						player.setDoubloons(500);
						
					//	System.out.println(player.getSwordSkill());
						ship playerShip= new ship();
					//	player.shipNewGame();
						
						//System.out.println(playerShip.getCannon());
						PortMenu mainPort=new PortMenu();
						
					break;
				
					
					//case 2:
						// insert save
					//break;	
				
					
					case 2:
					
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
							System.out.println("Invalid Input, Returning to game");
							
						}
						
					break;
					
					
					default:
						System.out.println("Please Try again and enter a integer between 1-2.");
					break;
						
				}
					
			}
			
			
			catch(InputMismatchException e)
			{
				System.out.println("Please Try again and enter a integer between 1-2.");
			}
			
		}
	try {
		System.in.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}

}
