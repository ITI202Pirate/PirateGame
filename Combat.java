package pirateGame;

import java.util.Scanner;

public class Combat {
	private final double standardAccuracy= 6;//All cannons have 60% accuracy by default, this number is X/10
	private  int startingDistance= 30;//Starting distance between the two ships.
	private int escape=70;//Distance at which ships escape battle
	int distance;//Current distance between ships
	
	public Combat(int crew, int sails, int hull, int cannons, String enemy) {
		Scanner scan=new Scanner(System.in);
		boolean run=true;//Controls primary combat loop. While true the game will continue combat. When false loop will be exited.
		
		switch(enemy) {// Enemy selection based on enemy String. 
		case "Cutter":
			CombatShip.makeCutter();
		break;
		case "Brig":
			CombatShip.makeBrig();
			break;
		
		default :
			throw new IllegalArgumentException("Invalid Enemy Type: " + enemy);
		}
		
		distance=startingDistance;//Set the current distance between player and enemy ship
		
		System.out.println("Testing, Player Crew: "+ crew+" Sails: "+ sails+" Hull:"+hull+" Cannon:"+cannons+" Enemy Type:"+enemy);
		System.out.println("Testing, Enemy Crew: "+ CombatShip.getEcrew()+" Sails: "+ CombatShip.getEsail()+" Hull:"+CombatShip.getEhull()+" Cannon:"+CombatShip.getEcannon()+" Enemy Type:"+enemy);
		
		
		//Combat Description for player Below
		
		System.out.println("You Encounter a "+enemy+" On the High Seas");
		System.out.println("A "+ enemy+" is "+ CombatShip.getEdescription());
		
		//Primary Combat Loop
		do {
			
			if(hull<=0) {//Check if player is sunk due to loss of hull
				System.out.println("Your Ship has been sunk");
				System.out.println("Exiting");
				//Insert code for handling ship sinking here.
				break;
			}
			if(crew<=0) {//Check if player is sunk due to loss of crew
				System.out.println("Your crew has been slaughtered");
				System.out.println("Exiting");
				//Insert code for handling ship sinking here.
				break;
			}
			if(sails<=0) {//Inform player that they cannot move
				System.out.println("Your Sails have been destroyed and your are drifting");
				
			}
			
			
			System.out.println("What do you do?");
			System.out.println("Ship Status. Crew: "+ crew+" Sails: "+ sails+" Hull:"+hull+" Cannon:"+cannons+" Enemy Type:"+enemy +" Distance: " +distance);
			
			System.out.println("What do you do?");
			
			//System.out.println(combatOptions());
			String option=combatOptions();
			switch(option) {// Enemy selection based on enemy String. 
			case "F":
				playerFireCannons(cannons);
				break;
			case "C":
				playerCloseDistance();
				break;
			case "R":
				playerRunAway();
				break;
			
			default :
				throw new IllegalArgumentException("Invalid Option: " + option);
			}
		
			run=false;
			
			
		}while(run);
		
		
		
	}
	public String combatOptions() {
		Scanner scan=new Scanner(System.in);
		String option;
		do {
		System.out.println("Type Option in");
		System.out.println("[F]ire Cannons");
		System.out.println("[C]lose Distance");
		//System.out.println("[M]end Sails");
		System.out.println("[R]un Away");
		
		option=scan.next();
		
		if (option.length()==1) {
			break;
		}else if(!option.contains("F")&&!option.contains("C")&&!option.contains("R")) {
			System.out.println("Enter only 1 letter from the above options, Try again");
			
		}else {
			System.out.println("Enter only 1 letter, Try again");
			
		}
		
		}while(true);
		
		return option;
	}
	public void playerFireCannons(int cannons) {
		int hits=0;
		int check;
		int count=0;
		//int probablility;
		System.out.println("Your ship turns to fire a broadside at the enemy");
		
		while(count<=cannons) {
			count++;
			
			check =(int) getRandomIntegerBetweenRange(1,10);
			if(check<=6) {
				hits++;
				
			}
			
		}
		//Enemy Ship takes damage
		System.out.println("You fire "+ cannons+" cannons and score "+hits+" hits on the enemy");
		System.out.println("The enemy ship's hull is reduced from "+CombatShip.getEhull() +" to " +(CombatShip.getEhull()-hits));
		
		CombatShip.setEhull(CombatShip.getEhull()-hits);
		
		//Enemy ship takes it own turn
		enemyShipAction();
		
	}
	
	public void playerCloseDistance() {
		System.out.println("You turn the ship towards the enemy vessel and chase it.");
	}
	
	public void playerRunAway() {
		System.out.println("You turn the wheel and your ship moves away from the enemy.");
		
		
	}
	public static double getRandomIntegerBetweenRange(double min, double max){
		//enter min and max values, so 5,10 means you get something between 5-10.
	    double x = (int)(Math.random()*((max-min)+1))+min;
	    return x;
	}
	
	public void enemyShipAction() {
		
	}

}
