
public class ship {

		private int water;
		private int waterMax;
		private int food;
		private int foodMax;
		private int crew;
		private int crewMax;
		private int sails;
		private int hull;
		private int cannon;
		private int cannonMax;
		private int ammo;
		private int ammoMax;
		private int treasury;
		private int sailToughness;

		
	public void setWater(int water) {
		this.water = water;
	}
	public int getWater() {
		return water;
	}
	public void setWaterMax(int waterMax) {
		this.waterMax = waterMax;
	}
	public int getWaterMax() {
		return waterMax;
	}
	
	public void setFood(int food) {
		this.food = food;
	}
	public int getFood() {
		return food;
	}
	public void setFoodMax(int foodMax) {
		this.foodMax = foodMax;
	}
	public int getFoodMax() {
		return foodMax;
	}
	
	public void setCrew(int crew) {
		this.crew = crew;
	}
	public int getCrew() {
		return crew;
	}
	
	public void setCrewMax(int crewMax) {
		this.crewMax = crewMax;
	}
	public int getCrewMax() {
		return crewMax;
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
	public void setCannonMax(int cannonMax) {
		this.cannonMax = cannonMax;
	}
	public int getCannonMax() {
		return cannonMax;
	}
	
	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}
	public int getAmmo() {
		return ammo;
	}
	public void setAmmoMax(int ammoMax) {
		this.ammoMax = ammoMax;
	}
	public int getAmmoMax() {
		return ammoMax;
	}
	
	public void setSailToughness(int sailToughness) {
		this.sailToughness = sailToughness;
	}
	public int getSailToughness() {
		return sailToughness;
	}
	
	public void setTreasury(int treasury) {
		this.treasury = treasury;
	}
	public int getTreasury() {
		return treasury;
	}
	
	// Use to remove amount of water needed
	// put in error if the amount of water removed would result in the food variable t drop below zero
	public int removeWater(int waterRemove) {
		water = water - waterRemove;
		
		// use try and catch 
		/*if (water <= 0) {
			System.out.println("Insuffieient amount of water! Action can not be perfrormed!");
		} */
		try {
			water <= 0;
		}
		catch (Exception e){
			System.out.println("Insuffieient amount of water! Action can not be perfrormed!");
		}
		return water;
	}
	// use to add water found in treasure or bought
	// put in code if the amount of water added would exceed the maximum amount
	//(set to max and discard the remaining amount)
	public int addWater(int waterAdd) {
		water = water + waterAdd;
		if (water > waterMax) {
			System.out.println("Water found exceeds the maximum amount. Discarding the overflow.");
			water = waterMax;
		}
		return water;
	}
	// use to remove amount of food needed for action
	public int removeFood(int foodRemove) {
		food = food - foodRemove;
		/*if (food <= 0) {
			System.out.println("Insuffieient amount of food! Action can not be performed!");
		} */
		try {
			food <= 0;
		}
		catch (Exception e){
			System.out.println("Insuffieient amount of food! Action can not be perfrormed!");
		}
		return food;
	}
	// use to add food found in treasure, looted, or bought
	public int addFood(int foodAdd) {
		food = food + foodAdd;
		if (water > foodMax) {
			System.out.println("Food found exceeds the maximum amount. Discarding the overflow.");
			water = foodMax;
		}
		return food;
	}
	
	public int removeCrew(int crewDeath) {
		crew = crew - crewDeath;
		/*if (crew <= 0) {
			System.out.println("All your crewmates have died");
			crew = 0;
		} */
		try {
			crew <= 0;
		}
		catch (Exception e){
			System.out.println("All your crewmates have died");
			crew = 0;
		}
		return crew;
	}
	public int addCrew(int crewRecruit) {
		crew = crew + crewRecruit;
		if (crew > crewMax) {
			System.out.println("Amount of crew exceeds the maximum capacity. Discarding the excess.");
			crew = crewMax;
		}
		return crew;
	}
	
	public int removeCannon(int cannonRemove) {
		cannon = cannon - cannonRemove;
		/*if (cannon <= 0) {
			System.out.println("All your cannons have been destroyed.");
			cannon = 0;
		} */
		try {
			cannon <= 0;
		}
		catch (Exception e){
			System.out.println("All your cannons have been destroyed.");
			cannon = 0;
		}
		return cannon;
	}
	public int addCannon(int cannonAdd) {
		cannon = cannon + cannonAdd;
		if (cannon > cannonMax) {
			System.out.println("Amount of cannons exceeds the maximum capacity. Discarding the excess.");
			cannon = cannonMax;
		}
		return cannon;
	}
	
	public int removeAmmo(int ammoRemove) {
		ammo = ammo - ammoRemove;
		/*if (ammo <= 0) {
			System.out.println("All your ammo has been used");
			ammo = 0;
		} */
		try {
			ammo <= 0;
		}
		catch (Exception e){
			System.out.println("All your ammo has been used");
			ammo = 0;
		}
		return ammo;
	}
	public int addAmmo(int ammoAdd) {
		ammo = ammo + ammoAdd;
		if (ammo > ammoMax) {
			System.out.println("Amount of ammo exceeds the maximum capacity. Discarding the excess.");
			ammo = ammoMax;
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

