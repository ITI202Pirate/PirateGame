
public class ship {

	//public static void main(String[] args) {
		
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
			System.out.println("Insuffieient amount of water! Action can not be perfrormed!");
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
			System.out.println("Insuffieient amount of food! Action can not be performed!");
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
		this.crew = crew - crewDeath;
		if (this.crew <= 0) {
			System.out.println("All your crewmates have died");
			this.crew = 0;
		} 
		return crew;
	}
	public int addCrew(int crew, int crewRecruit, int crewMax) {
		this.crew = crew + crewRecruit;
		if (this.crew > crewMax) {
			System.out.println("Amount of crew exceeds the maximum capacity. Discarding the excess.");
			this.crew = crewMax;
		}
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
		this.cannon = cannon - cannonRemove;
		if (this.cannon <= 0) {
			System.out.println("All your cannons have been destroyed.");
			this.cannon = 0;
		} 
		return cannon;
	}
	public int addCannon(int cannon, int cannonAdd, int cannonMax) {
		this.cannon = cannon + cannonAdd;
		if (this.cannon > cannonMax) {
			System.out.println("Amount of cannons exceeds the maximum capacity. Discarding the excess.");
			this.cannon = cannonMax;
		}
		return cannon;
	}
	
	public int removeAmmo(int ammo, int ammoRemove) {
		this.ammo = ammo - ammoRemove;
		if (this.ammo <= 0) {
			System.out.println("All your ammo has been used");
			this.ammo = 0;
		} 
		return ammo;
	}
	public int addAmmo(int ammo, int ammoAdd, int ammoMax) {
		this.ammo = ammo + ammoAdd;
		if (this.ammo > ammoMax) {
			System.out.println("Amount of ammo exceeds the maximum capacity. Discarding the excess.");
			this.ammo = ammoMax;
		}
		return ammo;
	}
	
	public int removeTreasury(int treasury, int treasuryRemove) {
		this.treasury = treasury - treasuryRemove;
		if (this.treasury <= 0) {
			System.out.println("Treasury does not have enough money for " + treasuryRemove + " to be withdrawn.");
		} 
		return treasury;
	}
	public int addTreasury(int treasury, int treasuryAdd) {
		this.treasury = treasury + treasuryAdd;
		return treasury;
	}

}
