package pirateGame;

import java.util.Random;
import java.util.Scanner;

public class TreasureHunt {
	
	private String treasure;
	private int treasureCount;
	private double value;
	private  Boolean choice;
	private int foundGold;
	private double goldProb; // The chance to find more gold: 0.0 (barren) to 1.0 (100% chance)
	
	public TreasureHunt(String treassureName, int treasureCount, double valu) { // Arrayist crew
		
		this.treasure = treassureName;
		this.treasureCount = treasureCount;
		this.value = value; 
		this.foundGold = 0;
		this.goldProb = 0.25; // hardcoded for now
	}
	/*
	 * Begin searching for treasure on this land
	 */
	public int enterLand() {
		int choice = 0;
		this.foundGold = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Started searching for treasure on land!");
		while(choice != 2) {
			System.out.println("Please choose an option:");
			System.out.println("1) search for treasure");
			System.out.println("2) Return to ship");			
			choice = sc.nextInt();
			switch(choice) {
			
			case 1: 
				System.out.println("Started searching for treasure on land!");
				// call search for treasure method
				int _foundGold = this.searchForGold();
				if(_foundGold > 0) 
					System.out.println(String.format("Managed to find %d gold pieces!", _foundGold));
				else
					System.out.println("Didn't find any gold here. :(");
				this.foundGold += _foundGold;
				break;
			case 2:
				//exit
				break;
				
			default:
				System.out.println("Invaid option, please try again");
			}
		}
		System.out.println(String.format("Returning to ship with %d new gold pieces!", this.foundGold));
		return this.foundGold;
	}
	
	/*
	 * Search for gold: return a random amount of gold pieces found 
	 */
	private int searchForGold() {
		return (int) (Math.random() * (this.goldProb * 10));
	}
	public String getTreasuerName() {
		return treasure;
	}

	public void setTreassureName(String  treassureName) {
		this.treasure = treassureName;
	}

	public double getTreausereCount() {
		return treasureCount;
	}
	
	public void settreasureCount(int  treasureCount) {
		this.treasureCount = treasureCount;
	}

public double getValue() {
		
		return value;
	}
		
	public void setValue() {
		this.value = value;
	}
				
	}