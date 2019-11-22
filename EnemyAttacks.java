package pirateGame;

public interface EnemyAttacks {
	//attacks in naval combat
	int cannonAttack(CombatShip enemy); 
	int grapeshotAttack(CombatShip enemy);
	int chainshotAttack(CombatShip enemy);
	
	//attacks in boarding
	
	int boardingAttack(CombatShip enemy);
	int boardingDuel(CombatShip enemy);
}
