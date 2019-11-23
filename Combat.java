package pirateGame;

import java.util.Scanner;

public class Combat extends ship {
	private final double standardAccuracy= 6;//All cannons have 60% accuracy by default, this number is X/10
	private  int startingDistance= 50;//Starting distance between the two ships.
	private int escape=90;//Distance at which ships escape battle
	private int distance;//Current distance between ships
	private CombatShip enemyShip=new CombatShip();
	private boolean victory=false;//True if you win false if not.
	Scanner scan=new Scanner(System.in);
	
	private int crew;
	private int sails;
	private int hull;
	private int cannons;
	private int sailToughness;
	
	private int maxCrew;
	private int maxSails;
	private int maxHull;
	private int maxCannons;
	
	
	
	public Combat(String enemy) {
		Player player=new Player();
		//getCrew();
		crew=getCrew();
		sails=getSail();
		hull=getHull();
		cannons=getCannon();
		setPlayerShip(crew,sails,hull,cannons);
		
	//	Scanner scan=new Scanner(System.in);
		boolean run=true;//Controls primary combat loop. While true the game will continue combat. When false loop will be exited.
		
		switch(enemy) {// Enemy selection based on enemy String. 
		case "Cutter":
			
			enemyShip.makeCutter();
		break;
		case "Brig":
			//enemyShip enemyShipBrig=new enemyShip();
			enemyShip.makeBrig();
			break;
		case "Brigatine":
			//enemyShip enemyShipBrig=new enemyShip();
			enemyShip.makeBrigatine();
			break;
		case "Galleon":
			//enemyShip enemyShipBrig=new enemyShip();
			enemyShip.makeGalleon();
			break;
		case "TreasureGalleon":
			//enemyShip enemyShipBrig=new enemyShip();
			enemyShip.makeTreasureGalleon();
			break;
		default :
			throw new IllegalArgumentException("Invalid Enemy Type: " + enemy);
		}
		
		distance=startingDistance;//Set the current distance between player and enemy ship
		
		//System.out.println("Testing, Player Crew: "+ crew+" Sails: "+ sails+" Hull:"+hull+" Cannon:"+cannons+" Enemy Type:"+enemy);
		//System.out.println("Testing, Enemy Crew: "+ enemyShip.getEcrew()+" Sails: "+ enemyShip.getEsails()+" Hull:"+enemyShip.getEhull()+" Cannon:"+enemyShip.getEcannons()+" Enemy Type:"+enemy);
		
		
		//Combat Description for player Below
		System.out.println("Ship Ahoy Captain: "+player.getName()+" !");
		System.out.println("You Encounter a "+enemy+" On the High Seas");
		System.out.println("A "+ enemy+" is "+ enemyShip.getEdescription());
		System.out.println();
		Utilities.promptEnterKey();
		//Primary Combat Loop
		do {
			
			
			if(hull<=0) {//Check if player is sunk due to loss of hull
				System.out.println("Your Ship has been sunk");
				System.out.println("Game Over");
				Utilities.promptEnterKey();
				returnShip();
				//Insert code for handling ship sinking here.
				run=false;
				break;
			}
			if(crew<=0) {//Check if player is sunk due to loss of crew
				System.out.println("Your crew has been slaughtered");
				System.out.println("Game Over");
				Utilities.promptEnterKey();
				//Insert code for handling ship sinking here.
				returnShip();
				run=false;
				break;
			}
			if(sails<=0) {//Inform player that they cannot move
				System.out.println("Your Sails have been destroyed and you are drifting");
				
			}
			
			System.out.println();
			System.out.println();
			System.out.println("Ship Status ");
			displayPlayerShip();
			System.out.println();
			System.out.println("Enemy Ship Status ");
			enemyShip.display();
			
			System.out.println();
			System.out.println("What do you do?");
			
			//System.out.println(combatOptions());
			String option=combatOptions();
			switch(option) {// Enemy selection based on enemy String. 
			case "F":
				playerFireCannons(cannons);
				if(checkIfWin()) {
					System.out.println("You Win");
					victory=true;
					run=false;
					break;
				}
				break;
			case "C":
				playerCloseDistance();
				if(checkIfWin()) {
					System.out.println("You Win");
					victory=true;
					run=false;
					break;
				}
				break;
			case "R":
				boolean leave=playerRunAway();
				if(leave) {
					run=false;
				}
				break;
			
			default :
				throw new IllegalArgumentException("Invalid Option: " + option);
			}
		
		//	run=false;
			
			
		}while(run);
		
		//End Combat
		
		System.out.println("Combat Ends, Call loot here, update main ship stats to match damage and crew loss");
	//	scan.close();
	
		
		
	}
	public String combatOptions() {
		//Scanner scan=new Scanner(System.in);
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
	//	scan.close();
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
			
			check =Utilities.getRandomIntegerBetweenRange(1,10);
			if(check<=6) {
				hits++;
				
			}
			
		}
		//Enemy Ship takes damage
		System.out.println("You fire "+ cannons+" cannons and score "+hits+" hits on the enemy");
		System.out.println("The enemy ship's hull is reduced from "+enemyShip.getEhull() +" to " +(enemyShip.getEhull()-hits));
		
		enemyShip.setEhull(enemyShip.getEhull()-hits);
		
		//Enemy ship takes it own turn
		enemyShipAction();
		
	}
	
	public void playerCloseDistance() {
		System.out.println("You turn the ship towards the enemy vessel and chase it.");
		if( distance<=sails) {//if distance is less than the spaces a player would move, set to zero and go to boarding mode
			distance=0;
			System.out.println(" You ram the enemy ship! Prepare to board!");
			Utilities.promptEnterKey();
			System.out.println("Your men charge over the railing and viciously attack the enemy.");
			Utilities.promptEnterKey();
			int death=Utilities.getRandomIntegerBetweenRange(1, crew);
			crew=crew-death;
			System.out.println("In the fighting you slay "+(Math.min(enemyShip.getEcrew(),Player.SwordSkill))+" of the enemy");
			System.out.println(death+" Memebers of your crew in fall battle");
			enemyShip.setEcrew(0);
			
			Utilities.promptEnterKey();
			//Player.SwordSkill
			//Boarding class coding here.
		}else {
			
		
		distance=distance-sails;
		System.out.println("You move: "+sails+" units closer, you are now "+distance +" away from the enemy ship");
		
		
		enemyShipAction();
		}
	}
	
	public boolean playerRunAway() {
		System.out.println("You turn the wheel and your ship moves away from the enemy.");
		
		
			distance=distance+sails;
			if( distance>=escape) {
				System.out.println("You turn successfully escape the enemy ship");
				return true;
			}
			
			
		enemyShipAction();
		return false;
	}
	/*public static double getRandomIntegerBetweenRange(double min, double max){
		//enter min and max values, so 5,10 means you get something between 5-10.
	    double x = (int)(Math.random()*((max-min)+1))+min;
	    return x;
	}
	*/
	public void enemyShipAction() {//Controls enemy ship attacks, maybe AI if I have time to make decision tree
		Attacks a=new NavalAttacks();
		int rand=Utilities.getRandomIntegerBetweenRange(1, 10);
		if(distance>40||rand<3) {
	int hits=	a.cannonAttack(enemyShip);
		
		hull=hull-hits;
		System.out.println("Remaining Hull:"+hull);
		}else if(distance<=40&&distance>20&&rand>=3) {
			int hits=a.chainshotAttack(enemyShip);
			
			sails=sails-hits;
			System.out.println("Remaining Sails:"+sails);
		}else if(distance<=20&&rand>=3) {
			int hits=a.grapeshotAttack(enemyShip);
			
			crew=crew-hits;
			System.out.println("Remaining crew:"+crew);
		}else {
			System.out.println(" The enemy attempts to bring its guns to bear, but cannot target your ship");
		}
		
		Utilities.promptEnterKey();
		
		
	}
	public boolean checkIfWin() {
		if (enemyShip.getEcrew()<=0) {
			System.out.println(" The Enemy Crew is dead");
			return true;
		}
		
		if(enemyShip.getEhull()<=0) {
			System.out.println("The Enemy Ship Sinks");
			return true;
		}
		
		return false;
	}
	/**
	 * Displays Player stats
	 */
	public  void displayPlayerShip() {
		System.out.println("Your Hull:"+hull+"/"+maxHull);
		System.out.println("Your Sails:"+sails+"/"+maxSails);
		System.out.println("Your Crew:"+crew+"/"+maxCrew);
		System.out.println("Your Cannons:"+cannons+"/"+maxCannons);
	//	System.out.println("Enemy Hull:"+ehull);
	}
	
	
	public  void setPlayerShip(int crew, int sails, int hull, int cannons){
		this.hull=hull;
		maxHull=hull;
		
		this.sails=sails;
		maxSails=sails;
		sailToughness=2;
		
		this.crew=crew;
		maxCrew=crew;
		
		this.cannons=cannons;
		maxCannons=cannons;
		//description="A medium sized cargo vessel capable of traveling to far away lands. It can hold animals, colonists and valuable goods. ";
		
		
	}
	public void returnShip() {
		setHull(this.hull);
		setSail(this.sails);
		setCrew(this.crew);
	//	setCannons();
	}
/*	public boolean checkIfLose() {
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
			System.out.println("Your Sails have been destroyed and you are drifting");
			
		}
		
		return false;
	}*/

}
