package pirateGame;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PortMenu extends ship
{

	public  PortMenu()
	{
		int portRead = 0;
		Scanner portInput = new Scanner(System.in);
		while(portRead != 4)
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
			
				
				if(portInput.hasNext()) {
				portRead = portInput.nextInt();
				}
				
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
					
					Combat d1=new Combat("Cutter");
					System.out.println("End Combat");
					//insert exploration options
				break;
				
				
				default:
					System.out.println("Default That is an invalid input.");
				break;	
				
				}
				
			}
			
			
			catch(InputMismatchException e)
			{
				System.out.println("Catch That is an invalid input. "+portRead);
			}
			
		}
		//portInput.close();

	}
	
	
	public static void store()
	{
		int storeRead = 0;
		Scanner storeInput = new Scanner(System.in);
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

			
			storeRead = storeInput.nextInt();
			try
			{

				

				switch(storeRead)
				{
				case 1:
					//buy
				{									
					System.out.println("You are selecitng to buy,please enter item id");					
					System.out.println("food \n ammo \n water");
						Scanner buyOption=new Scanner(System.in);
						String buyRead=buyOption.next();											 
						
						
						switch(buyRead) {
						case "food":
							System.out.println("Do you want to buy food? true/false");
							boolean buyYesNo=buyOption.nextBoolean();
							if (buyYesNo==true) {	
							System.out.println("Enter quantity: ");
							int foodAdd=buyOption.nextInt();													
							
							ship.addFood( foodAdd);
							//ship.setFood(foodAdd);
							System.out.println(foodAdd+" food added in your bag");
							System.out.println("Now you have food: "+ship.getFood());
							}else if(buyYesNo==false) {
								System.out.println("Returned to store main menu");
								break;
							}								
							break;							
							
						case "ammo":
							//System.out.println("Do you want to buy ammo? true/false");
							
						case "water":
							//System.out.println("Do you want to buy water? true/false");
						
						}
					}

					
				break;	


				case 2:
					//sell
				break;


				case 3:
					System.out.println("Leaving the store...");
				break;
				}
				
				
			}

			catch(InputMismatchException e)
			{
				System.out.println("That is an invalid input.");
				
			}
			finally {
				
				
			}
		
		}
		//storeInput.close();
		
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
						//repair, asks how much, returns price, asks y/n
						System.out.println("Would you like to repair your hull? true/false");
						
						Scanner repairInput=new Scanner(System.in);
						boolean repairHullRead=repairInput.nextBoolean();	
						
						if(repairHullRead == true)
						{
							System.out.println("It will cost 10 gold"); 
							System.out.println("Would you like to proceed? true/false");
							boolean buyHullRead=repairInput.nextBoolean();	
							
							if(buyHullRead == true)
							{
								//take away gold 
								//insufficient gold should not allow purchase
								ship.setHull(); //insert max value
								System.out.println("Your ship has been repaired");
							}
						}
						
						
					break;	


					case 2:
						//recruit, asks how many, returns price, asks y/n
						System.out.println("Would you like to repair your hull? true/false");
						
						Scanner crewInput=new Scanner(System.in);
						boolean crewRead=crewInput.nextBoolean();	
						
						if(crewRead == true)
						{
							System.out.println("It will cost 10 gold"); 
							System.out.println("Would you like to proceed? true/false");
							boolean buyCrewRead=crewInput.nextBoolean();	
							
							if(buyCrewRead == true)
							{
								//take away gold 
								//insufficient gold should not allow purchase
								ship.setCrew(); //insert max value
								System.out.println("Your crew has been replenished");
							}
						}
					break;


					case 3:
						System.out.println("Leaving the shipyard...");
					break;
				}
			}

			catch(InputMismatchException e)
			{
				System.out.println("That is an invalid input.");
			}
		
		}
		
	}

}
