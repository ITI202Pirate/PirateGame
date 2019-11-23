package pirateGame;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sailing extends ship {
	
	//private int enterLand;

	public Sailing() {
		Player player=new Player();
		Utilities.promptEnterKey();
		
		
	int mainMenuRead = 0;
		
		while(mainMenuRead != 4)
		{
			System.out.println("Your ship leaves port");
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println("-------------------------");
			System.out.println("[1] - Hunt out in the Open Seas");
			System.out.println("[2] - Search for Treasure");
			System.out.println("[3] - Return to port");
			System.out.println("-------------------------");
			System.out.println("");
			System.out.println("Type in the number for which command you would like to give your crew");
			
			try
			{
				Scanner mainMenuInput = new Scanner(System.in);
				mainMenuRead = mainMenuInput.nextInt();
			
				switch(mainMenuRead)
				{
					case 1:
						
						// Combat section of game
						//After victory is completel call the loot class
						System.out.println("Your Vessel heads out on the open seas to seek prey. ");
						Utilities.promptEnterKey();
						int search=Utilities.getRandomIntegerBetweenRange(1, 10);
						if(search<=4) {//small ship
							Combat s1=new Combat("Cutter");
						
							if(hull  <= 0 || crew <= 0 ) {
								System.out.println("GAME OVER"); 
								Utilities.promptEnterKey();
								java.lang.System.exit(0);
							}
							
							//loot system goes here
							
							
							
						}else if(5<=search&&search<=7) {//medium ship
							Combat s1=new Combat("Brig");
							if(hull  <= 0 || crew <= 0 ) {
								System.out.println("GAME OVER"); 
								Utilities.promptEnterKey();
								java.lang.System.exit(0);
							}
						}else if(8<=search&&search<=9) {//large ship
							Combat s1=new Combat("Brigatine");
							if(hull  <= 0 || crew <= 0 ) {
								System.out.println("GAME OVER"); 
								Utilities.promptEnterKey();
								java.lang.System.exit(0);
							}
						}else {//massive ship
							Combat s1=new Combat("TreasureGalleon");
							
							
							if(hull  <= 0 || crew <= 0 ) {
								System.out.println("GAME OVER"); 
								Utilities.promptEnterKey();
								java.lang.System.exit(0);
							}
						}
						
						
						
					break;
				
					
					case 2:
						// Treasure hunt section, uses John's code
					System.out.println("Lets begin the treasure hunt!.");
					
					TreasureHunt T = new TreasureHunt("Treasure", 5, 3 );
					
					int money=T.enterLand();
					
					//int newdoubloons = Player.setDoubloons();
					player.setDoubloons(player.getDoubloons()+money);
					
					
					
					
						break;	
				
					
					case 3:
					//Return to port
						System.out.println("You have chosen to return to Port"); 
						PortMenu mainPort=new PortMenu();
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
	
	/*public void promptEnterKey(){
		   System.out.println("Press \"ENTER\" to continue...");
		   Scanner scanner = new Scanner(System.in);
		   scanner.nextLine();
		}*/
}