package pirateGame;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PortMenu extends ship 
{

	public  PortMenu()
	{
		
		int food = getFood();
		
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
					shipyard();
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
	

	
	
	Player player = new Player();
	
	
	
	
	
	public void store()
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
					System.out.println("1.food\n2.ammo\n3.water\n4.cannon");
						Scanner buyOption=new Scanner(System.in);
						int buyRead=buyOption.nextInt();											 
						
						
						switch(buyRead) {
						case 1:
							int foodPrice=10;
							
							System.out.println("Now you have "+player.getDoubloons()+ " doubloons, each food will cost "+foodPrice+ " doubloons");
							System.out.println("Do you want to buy food? true/false");
							
							boolean buyYesNo1=buyOption.nextBoolean();
							
							while (player.getDoubloons()>foodPrice) {
								
								if (buyYesNo1==true) {							
							System.out.println("Enter quantity: "); //if have enough money get quantity then calculate totalcost
							int food=getFood();
							int foodAdd=buyOption.nextInt();													
							int newfood=foodAdd+food;
							setFood(newfood);
							
							int totalCost=foodPrice*foodAdd;
								
							if (totalCost<=player.getDoubloons()) {
							System.out.println(foodAdd+" food added in your bag");
							System.out.println("Now you have food: "+newfood+" Remaining doubloons: "+(player.getDoubloons()-totalCost));
							player.setDoubloons(player.getDoubloons()-totalCost);
							}else {
								System.out.println("You don't have enough money, returned to store main menu");
								break;
							}
							
							} else if(buyYesNo1==false) {
								System.out.println("Returned to store main menu");
								break;
							}			break;				
							}
							break;							
						
						
							
						case 2:
							int ammoPrice=10;
							System.out.println("Now you have "+player.getDoubloons()+ " doubloons, each ammo will cost "+ammoPrice+ " doubloons");
							System.out.println("Do you want to buy ammo? true/false");
							
							boolean buyYesNo4=buyOption.nextBoolean();
							
							while (player.getDoubloons()>ammoPrice) {
							if (buyYesNo4==true) {		
							
							System.out.println("Enter quantity: ");  
							int ammo=getAmmo();
							int ammoAdd=buyOption.nextInt();													
							int newammo=ammoAdd+ammo;
							setAmmo(newammo);
							int totalCost=ammoPrice*ammoAdd;
							
							if (totalCost<=player.getDoubloons()) {
							System.out.println(ammoAdd+" ammo added in your bag");
							System.out.println("Now you have ammo: "+newammo+" Remaining doubloons: "+(player.getDoubloons()-totalCost));
							player.setDoubloons(player.getDoubloons()-totalCost);
							}else {
								System.out.println("You don't have enough money, returned to store main menu");
								break;
							}
							
							}else if(buyYesNo4==false) {
								System.out.println("Returned to store main menu");
								break;
							}break;	
							
							}						
							break;		
						
						case 3:
							int waterPrice=10;
							
							System.out.println("Now you have "+player.getDoubloons()+ " doubloons, each water will cost "+waterPrice+ " doubloons");
							System.out.println("Do you want to buy water? true/false");
							boolean buyYesNo5=buyOption.nextBoolean();
							
							while (player.getDoubloons()>waterPrice) {
							
								if (buyYesNo5==true) {		
							System.out.println("Enter quantity: ");
							int water=getHull();
							int waterAdd=buyOption.nextInt();													
							int newwater=waterAdd+water;
							setWater(newwater);
							int totalCost=waterPrice*waterAdd;
							
							if (totalCost<=player.getDoubloons()) {
							System.out.println(waterAdd+" water added in your bag");
							System.out.println("Now you have water: "+newwater+" Remaining doubloons: "+(player.getDoubloons()-totalCost));
							player.setDoubloons(player.getDoubloons()-totalCost);
							}else {
								System.out.println("You don't have enough money, returned to store main menu");
								break;							
							}
							
							}else if(buyYesNo5==false) {
								System.out.println("Returned to store main menu");
								break;
							}		break;
							
							}						
							break;		
						
						case 4:
							int cannonPrice=10;
							
							System.out.println("Now you have "+player.getDoubloons()+ " doubloons, each cannon will cost "+cannonPrice+ " doubloons");
							System.out.println("Do you want to buy cannon? true/false");
							boolean buyYesNo6=buyOption.nextBoolean();
							
							while (player.getDoubloons()>cannonPrice) {
							if (buyYesNo6==true) {		
							System.out.println("Enter quantity: ");
							
							int cannon=getHull();
							int cannonAdd=buyOption.nextInt();													
							int newcannon=cannonAdd+cannon;
							setCannon(newcannon);
							int totalCost=cannonPrice*cannonAdd;
							
							if (totalCost<=player.getDoubloons()) {
							System.out.println(cannonAdd+" cannon added in your bag");
							System.out.println("Now you have cannon: "+newcannon+" Remaining doubloons: "+(player.getDoubloons()-totalCost));
							player.setDoubloons(player.getDoubloons()-totalCost);
							}else {
								System.out.println("You don't have enough money, returned to store main menu");
								break;
							}
							
							}else if(buyYesNo6==false) {
								System.out.println("Returned to store main menu");
								break;
							}								
							break;		
						
					}break;
					}
				}
				break;	


				case 2:
				{
					System.out.println("You are selecting to sell, please enter item id: ");
					System.out.println("1.food\n2.ammo\n3.water\n4.cannon");
					Scanner sellOption=new Scanner(System.in);
					int sellRead=sellOption.nextInt();
				
				
					switch(sellRead) {
					case 1:
						int foodSellPrice=6;
						int food=getFood();					
						System.out.println("Now you have doubloons: "+player.getDoubloons()+". Each food you sold will gain "+foodSellPrice+" doubloons");						
						System.out.println("Now you have food: "+food);
						System.out.println("Do you want to sell food? true/false");
						
						boolean sellYesNo=sellOption.nextBoolean();
						while (sellYesNo==true) {
							
							
							System.out.println("The quantity of food you want to sell, please enter: ");
							int foodRemove=sellOption.nextInt();
						if(foodRemove>food) {
							System.out.println("It seems that you don't have so much food on your bag. Please re-enter it");							
						}else {
																												
						int newFood=food-foodRemove;
						int totalEarn=foodSellPrice*foodRemove;
						player.setDoubloons(totalEarn+player.getDoubloons());
						System.out.println(foodRemove+" food has been sold");
						System.out.println("Now you have food: "+newFood+" Remaining doubllons: "+player.getDoubloons());
						setFood(newFood);	
						break;
						}} if(sellYesNo==false) {
							System.out.println("Returned to store main menu");
							break;
						}				break;
					
					case 2:
						int ammoSellPrice=6;
						int ammo=getAmmo();
						System.out.println("Now you have doubloons: "+player.getDoubloons()+". Each ammo you sold will gain "+ammoSellPrice+" doubloons");
						
						System.out.println("Now you have ammo: "+ammo);
						System.out.println("Do you want to sell ammo? true/false");
						boolean sellYesNo4=sellOption.nextBoolean();
						while (sellYesNo4==true) {
							
							
							System.out.println("The quantity of ammo you want to sell, please enter: ");
							int ammoRemove=sellOption.nextInt();
						if(ammoRemove>ammo) {
							System.out.println("It seems that you don't have so much ammo on your bag. Please re-enter it");							
						}else {
																												
						int newammo=ammo-ammoRemove;
						int totalEarn=ammoSellPrice*ammoRemove;
						player.setDoubloons(totalEarn+player.getDoubloons());
						System.out.println(ammoRemove+" ammo has been sold");
						System.out.println("Now you have ammo: "+newammo+" Remaining doubllons: "+player.getDoubloons());
						setAmmo(newammo);	
						break;
						}} if(sellYesNo4==false) {
							System.out.println("Returned to store main menu");
							break;
						}				
						break;							
					
					
					case 3:
						int waterSellPrice=6;
						int water=getWater();
						System.out.println("Now you have doubloons: "+player.getDoubloons()+". Each water you sold will gain "+waterSellPrice+" doubloons");
						
						System.out.println("Now you have water: "+water);
						System.out.println("Do you want to sell water? true/false");
						boolean sellYesNo5=sellOption.nextBoolean();
						while (sellYesNo5==true) {
							
							
							System.out.println("The quantity of water you want to sell, please enter: ");
							int waterRemove=sellOption.nextInt();
						if(waterRemove>water) {
							System.out.println("It seems that you don't have so much water on your bag. Please re-enter it");							
						}else {
																												
						int newwater=water-waterRemove;
						int totalEarn=waterSellPrice*waterRemove;
						player.setDoubloons(totalEarn+player.getDoubloons());
						
						System.out.println(waterRemove+" water has been sold");
						System.out.println("Now you have water: "+newwater+" Remaining doubllons: "+player.getDoubloons());
						setWater(newwater);	
						break;
						}} if(sellYesNo5==false) {
							System.out.println("Returned to store main menu");
							break;
						}			
						break;	
						
					case 4:
						int cannonSellPrice=6;
						int cannon=getCannon();
						System.out.println("Now you have doubloons: "+player.getDoubloons()+". Each cannon you sold will gain "+cannonSellPrice+" doubloons");
						
						System.out.println("Now you have cannon: "+cannon);
						System.out.println("Do you want to sell cannon? true/false");
						boolean sellYesNo6=sellOption.nextBoolean();
						while (sellYesNo6==true) {
							
							
							System.out.println("The quantity of cannon you want to sell, please enter: ");
							int cannonRemove=sellOption.nextInt();
						if(cannonRemove>cannon) {
							System.out.println("It seems that you don't have so much cannon on your bag. Please re-enter it");							
						}else {
																												
						int newcannon=cannon-cannonRemove;
						int totalEarn=cannonSellPrice*cannonRemove;
						player.setDoubloons(totalEarn+player.getDoubloons());
						
						System.out.println(cannonRemove+" cannon has been sold");
						System.out.println("Now you have cannon: "+newcannon+" Remaining doubllons: "+player.getDoubloons());
						setCannon(newcannon);	
						break;
						}} if(sellYesNo6==false) {
							System.out.println("Returned to store main menu");
							break;
						}	break;
					}
					}
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
	
	
	
	
	
	
	
	
	public void shipyard()
	{
		
		int yardRead = 0;
		
		while(yardRead != 3)
		{
			
			System.out.println("Welcome to shipyard");
			System.out.println("");
			System.out.println("-------------------------");
			System.out.println("[1] - Repair Hull");
			System.out.println("[2] - Repair Sail");
			System.out.println("[3] - Recruit Crewmembers");
			System.out.println("[4] - Leave");
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
							System.out.println("It will cost 10 doubloons"); 
							System.out.println("You have " + player.getDoubloons() + " doubloons");
							System.out.println("Would you like to proceed? true/false");
							boolean buyHullRead=repairInput.nextBoolean();	
							
							if(buyHullRead == true)
							{
								int hullAmount = 10; //cost
								int hullRepair = 1; //units repaired
								
								//take away gold 
								if(player.getDoubloons() < hullAmount)
								{
									System.out.println("You have insufficient funds");
									System.out.println("Ship was not repaired");
								}
								//insufficient gold should not allow purchase
								else
								{
								player.setDoubloons(player.getDoubloons() - hullAmount);	
								setHull(getHull() + hullRepair); //insert max value
								System.out.println("Your ship has been repaired");
								}
							}
						}
						
						
					break;	

					case 2:
						//repair, asks how much, returns price, asks y/n
						System.out.println("Would you like to repair your sail? true/false");
						
						Scanner repairSailInput=new Scanner(System.in);
						boolean repairSailRead=repairSailInput.nextBoolean();	
						
						if(repairSailRead == true)
						{
							System.out.println("It will cost 10 doubloons"); 
							System.out.println("You have " + player.getDoubloons() + " doubloons");
							System.out.println("Would you like to proceed? true/false");
							boolean buySailRead=repairSailInput.nextBoolean();	
							
							if(buySailRead == true)
							{
								int sailAmount = 10; //cost
								int sailRepair = 1; //units repaired
								
								//take away gold 
								if(player.getDoubloons() < sailAmount)
								{
									System.out.println("You have insufficient funds");
									System.out.println("Sail was not repaired");
								}
								//insufficient gold should not allow purchase
								else
								{
								player.setDoubloons(player.getDoubloons() - sailAmount);	
								setSail(getSail() + sailRepair); //insert max value
								System.out.println("Your sail has been repaired");
								}
							}
						}
						
						
					break;	
					
					
					case 3:
						//recruit, asks how many, returns price, asks y/n
						System.out.println("Would you like to recruit members? true/false");
						
						Scanner crewInput=new Scanner(System.in);
						boolean crewRead=crewInput.nextBoolean();	
						
						if(crewRead == true)
						{
							System.out.println("It will cost 10 doubloons"); 
							System.out.println("You have " + player.getDoubloons() + " doubloons");
							System.out.println("Would you like to proceed? true/false");
							boolean buyCrewRead=crewInput.nextBoolean();	
							
							if(buyCrewRead == true)
							{
								int crewAmount = 10; //cost
								int crewRecruit = 1; //units recruit
								//take away gold 
								//insufficient gold should not allow purchase
								if(player.getDoubloons() < crewAmount)
								{
									System.out.println("You have insufficient funds");
									System.out.println("Your crew was not replenished");
								}
								//insufficient gold should not allow purchase
								else
								{
								player.setDoubloons(player.getDoubloons() - crewAmount);	
								setCrew(getCrew() + crewRecruit); 
								System.out.println("Your crew has been replenished");
								
								}
								
								
							}
						}
					break;
					
					
					


					case 4:
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