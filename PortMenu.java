package pirateGame;

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
	
	
	public static void store(){
		int storeRead = 0;
		ship ship=new ship();
		
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
				case 1://buy 
					
					{									
					System.out.println("You are selecitng to buy,please enter item id");					
					System.out.println("1.food\n2.sail\n3.crew\n4.hull\n5.ammo\n6.water\n7.cannon");
						Scanner buyOption=new Scanner(System.in);
						int buyRead=buyOption.nextInt();											 
						
						
						switch(buyRead) {
						case 1:
							System.out.println("Do you want to buy food? true/false");
							boolean buyYesNo=buyOption.nextBoolean();
							if (buyYesNo==true) {	
							System.out.println("Enter quantity: ");
							int foodAdd=buyOption.nextInt();													
							
							ship.addFood(ship.getFood(), foodAdd);
							ship.setFood(foodAdd);
							System.out.println("food added in your bag");
							System.out.println("Now you have food: "+ship.getFood());
							}else if(buyYesNo==false) {
								System.out.println("Returned to store main menu");
								break;
							}								
							break;							
						case 2:			
							System.out.println("Do you want to buy sail? true/false");
							
						case 3: 
							//System.out.println("Do you want to buy crew? true/false");
							
						case 4:
							//System.out.println("Do you want to buy hull? true/false");
							
						case 5:
							//System.out.println("Do you want to buy ammo? true/false");
							
						case 6:
							//System.out.println("Do you want to buy water? true/false");
						
						}
					}
				
					//buy
				break;	


				case 2://sell
				{
					System.out.println("You are selecting to sell, please enter item id: ");
					System.out.println("1.food\n2.sail\n3.crew\n4.hull\n5.ammo\n6.water\n7.cannon");
					Scanner sellOption=new Scanner(System.in);
					int sellRead=sellOption.nextInt();
				
				
					switch(sellRead) {
					case 1:
						System.out.println("Do you want to sell food? true/false");
						boolean sellYesNo=sellOption.nextBoolean();
						if (sellYesNo==true) {	
						System.out.println("Enter quantity: ");
						int foodRemove=sellOption.nextInt();												
						
						int food = ship.getFood();
						ship.setFood(food);
						ship.removeFood(food, foodRemove);
						food=ship.getFood()-foodRemove;
						System.out.println("food is sold");
						System.out.println("Now you have food: "+food);
						}else if(sellYesNo==false) {
							System.out.println("Returned to store main menu");
							break;
						}						
					case 2:
					case 3:
					case 4:
						break;							
					}
					//sell
				break;
				}

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
						//repair, asks how much, returns price, asks y/n
					break;	


					case 2:
						//recruit, asks how many, returns price, asks y/n
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