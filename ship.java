
public class ship {

	//public static void main(String[] args) {
	// sunday after 7 and tuesday around 9
		
		private int water;
		private int food;
		private int crew;
		private int sails;
		private int hull;
		private int cannon;
		private int ammo;
		private int treasury;
		// int sword
		
	//public static void ship1() {
		
	//}
	public void setWater(int water) {
		this.water = water;
	}
	public int getWater() {
		return water;
	}
	
	public void setFood(int food) {
		this.food = food;
	}
	public int getFood() {
		return food;
	}
	
	public void setCrew(int crew) {
		this.crew = crew;
	}
	public int getCrew() {
		return crew;
	}
	
	public void setSail(int sails) {
		this.sails = sails;
	}
	public int getSail() {
		return sails;
	}
	
	public void setHull(int hull) {
		this.hull = hull;
	}
	public int getHull() {
		return hull;
	}
	
	public void setCannon(int cannon) {
		this.cannon = cannon;
	}
	public int getCannon() {
		return cannon;
	}
	
	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}
	public int getAmmo() {
		return ammo;
	}
	
	public int getTreasury() {
		return treasury;
	}
	
	// Use to remove amount of water needed
	// put in error if the amount of water removed would result in the food variable t drop below zero
	public int removeWater(int water, int waterRemove) {
		
		return water;
	}
	// use to add water found in treasure or bought
	// put in code if the amount of water added would exceed the maximum amount
	//(set to max and discard the remaining amount)
	public int addWater(int water, int waterAdd) {
		
		return water;
	}
	// use to remove amount of food needed for action
	public int removeFood(int food, int foodRemove) {
		
		return food;
	}
	// use to add food found in treasure, looted, or bought
	public int addFood(int food, int foodAdd) {
		
		return food;
	}
	
	public int removeCrew(int food, int foodRemove) {
		
		return food;
	}
	public int addCrew(int food, int foodrAdd) {
		
		return food;
	}
	// health of sails
	// no more than 30
	// fast ships have more health and slower sails have less health
	public int removeSails(int food, int foodRemove) {
		
		return food;
	}
	public int addSails(int food, int foodrAdd) {
		
		return food;
	}
	
	public int removeHull(int food, int foodRemove) {
		
		return food;
	}
	public int addHull(int food, int foodrAdd) {
		
		return food;
	}
	
	public int removeCannon(int food, int foodRemove) {
		
		return food;
	}
	public int addCannon(int food, int foodAdd) {
		
		return food;
	}
	
	public int removeAmmo(int food, int foodRemove) {
		
		return food;
	}
	public int addAmmo(int food, int foodrAdd) {
		
		return food;
	}

}
