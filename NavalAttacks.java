package pirateGame;

public class NavalAttacks implements EnemyAttacks {
	
	@Override
	public int cannonAttack(CombatShip enemy) {
		System.out.println("The enemy ships fires cannonballs at you");
	//	int hullDamage;
		int hits=0;
		int check;
		int count=0;
		
		//int probablility;
		//System.out.println("Your ship turns to fire a broadside at the enemy");
		
		while(count<=enemy.getEcannons()) {
			count++;
			
			check =(int) getRandomIntegerBetweenRange(1,10);
			if(check<=6) {
				hits++;
				
			}
			
		}
		
		
		// TODO Auto-generated method stub
		return hits;
	}

	@Override
	public int grapeshotAttack(CombatShip enemy) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int chainshotAttack(CombatShip enemy) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int boardingAttack(CombatShip enemy) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int boardingDuel(CombatShip enemy) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static double getRandomIntegerBetweenRange(double min, double max){
		//enter min and max values, so 5,10 means you get something between 5-10.
	    double x = (int)(Math.random()*((max-min)+1))+min;
	    return x;
	}
	

	
}
