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
		private int sailToughness;
		// int sword ???
		
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
	
	public void setTreasury(int treasury) {
		this.treasury = treasury;
	}
	public int getTreasury() {
		return treasury;
	}
	
	// Use to remove amount of water needed
	// put in error if the amount of water removed would result in the food variable t drop below zero
	public int removeWater(int water, int waterRemove) {
		this.water = water - waterRemove;
		if (this.water <= 0) {
			System.out.println("Insuffieient amount of water! Action can ny be perfrormed!");
		} 
		return water;
	}
	// use to add water found in treasure or bought
	// put in code if the amount of water added would exceed the maximum amount
	//(set to max and discard the remaining amount)
	public int addWater(int water, int waterAdd, int waterMax) {
		this.water = water + waterAdd;
		if (this.water > waterMax) {
			System.out.println("Water found exceeds the maximum amount. Discarding the overflow.");
			this.water = waterMax;
		}
		return water;
	}
	// use to remove amount of food needed for action
	public int removeFood(int food, int foodRemove) {
		this.food = food - foodRemove;
		if (this.food <= 0) {
			System.out.println("Insuffieient amount of food! Action can ny be perfrormed!");
		} 
		return food;
	}
	// use to add food found in treasure, looted, or bought
	public int addFood(int food, int foodAdd, int foodMax) {
		this.food = food + foodAdd;
		if (this.water > foodMax) {
			System.out.println("Food found exceeds the maximum amount. Discarding the overflow.");
			this.water = foodMax;
		}
		return food;
	}
	
	public int removeCrew(int crew, int crewDeath) {
		
		return crew;
	}
	public int addCrew(int crew, int crewRecruit) {
		
		return crew;
	}
	// health of sails
	// no more than 30
	// fast ships have more health and slower sails have less health
	
	// DONT NEED THIS PART
	/*public int removeSails(int sails, int sailsToughness) {
		
		return sails;
	}
	public int addSails(int sails, int sailsAdd) {
		
		return sails;
	}
	
	public int removeHull(int hull, int hullRemove) {
		
		return hull;
	}
	public int addHull(int hull, int hullAdd) {
		
		return hull;
	}*/
	
	public int removeCannon(int cannon, int cannonRemove) {
		
		return cannon;
	}
	public int addCannon(int cannon, int cannonAdd) {
		
		return cannon;
	}
	
	public int removeAmmo(int ammo, int ammoRemove) {
		
		return ammo;
	}
	public int addAmmo(int ammo, int ammoAdd) {
		
		return ammo;
	}
	
	public int removeTreasury(int treasury, int treasuryRemove) {
		
		return treasury;
	}
	public int addTreasury(int treasury, int treasuryAdd) {
		
		return treasury;
	}

}
