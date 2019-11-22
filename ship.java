package pirateGame;
abstract class  ship {

	static int water;
	static int waterMax;
	static int food;
	static int foodMax;
	static int crew;
	static int crewMax;
	static int sails;
	static int sailsMax;
	static int hull;
	static int hullMax;
	static int cannon;
	static int cannonMax;
	static int ammo;
	static int ammoMax;
	static int treasury;
	static int sailToughness;
	static String shipType;
	static String shipDescription;

	
public static void setWater(int nwater) {
	water = nwater;
}
public  int getWater() {
	return water;
}
public static void setWaterMax(int nwaterMax) {
	waterMax = nwaterMax;
}
public  int getWaterMax() {
	return waterMax;
}

public static void setFood(int nfood) {
	food = nfood;
}
public  int getFood() {
	return food;
}
public static void setFoodMax(int nfoodMax) {
	foodMax = nfoodMax;
}
public  int getFoodMax() {
	return foodMax;
}

public static void setCrew(int ncrew) {
	crew = ncrew;
}
public  int getCrew() {
	return crew;
}

public static void setCrewMax(int ncrewMax) {
	crewMax = ncrewMax;
}
public  int getCrewMax() {
	return crewMax;
}

public static void setSail(int nsails) {
	sails = nsails;
}
public  int getSail() {
	return sails;
}

public static void setHull(int nhull) {
	hull = nhull;
}
public int getHull() {
	return hull;
}

public static void setCannon(int ncannon) {
	cannon = ncannon;
}
public int getCannon() {
	return cannon;
}
public static void setCannonMax(int ncannonMax) {
	cannonMax = ncannonMax;
}
public int getCannonMax() {
	return cannonMax;
}

/*public  static void setAmmo(int ammo) {
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
*/
public static void setSailToughness(int nsailToughness) {
	sailToughness = nsailToughness;
}
public int getSailToughness() {
	return sailToughness;
}
//public static void setShipType() {
	
//}


/*public static void setTreasury(int ntreasury) {
	treasury = ntreasury;
}
public int getTreasury() {
	return treasury;
}
*/
// Use to remove amount of water needed
// put in error if the amount of water removed would result in the food variable t drop below zero
public static int removeWater(int waterRemove) {
	water = water - waterRemove;
	
	// use try and catch 
	/*if (water <= 0) {
		System.out.println("Insuffieient amount of water! Action can not be perfrormed!");
	} */
	try {
		if (water <= 0) {
			throw new Exception();
		}
	}
	catch (Exception e){
		System.out.println("Insuffieient amount of water! Action can not be perfrormed!");
	}
	return water;
}
// use to add water found in treasure or bought
// put in code if the amount of water added would exceed the maximum amount
//(set to max and discard the remaining amount)
public static int addWater(int waterAdd) {
	water = water + waterAdd;
	if (water > waterMax) {
		System.out.println("Water found exceeds the maximum amount. Discarding the overflow.");
		water = waterMax;
	}
	return water;
}
// use to remove amount of food needed for action
public static int removeFood(int foodRemove) {
	food = food - foodRemove;
	/*if (food <= 0) {
		System.out.println("Insuffieient amount of food! Action can not be performed!");
	} */
	try {
		if (food <= 0) {
			throw new Exception();
		}
	}
	catch (Exception e){
		System.out.println("Insuffieient amount of food! Action can not be perfrormed!");
	}
	return food;
}
// use to add food found in treasure, looted, or bought
public static int addFood(int foodAdd) {
	food = food + foodAdd;
	if (water > foodMax) {
		System.out.println("Food found exceeds the maximum amount. Discarding the overflow.");
		water = foodMax;
	}
	return food;
}

public static int removeCrew(int crewDeath) {
	crew = crew - crewDeath;
	/*if (crew <= 0) {
		System.out.println("All your crewmates have died");
		crew = 0;
	} */
	try {
		if (crew <= 0) {
			throw new Exception();
		}
	}
	catch (Exception e){
		System.out.println("All your crewmates have died");
		crew = 0;
	}
	return crew;
}
public static int addCrew(int crewRecruit) {
	crew = crew + crewRecruit;
	if (crew > crewMax) {
		System.out.println("Amount of crew exceeds the maximum capacity. Discarding the excess.");
		crew = crewMax;
	}
	return crew;
}

public  static int removeCannon(int cannonRemove) {
	cannon = cannon - cannonRemove;
	/*if (cannon <= 0) {
		System.out.println("All your cannons have been destroyed.");
		cannon = 0;
	} */
	try {
		if (cannon <= 0) {
			throw new Exception();
		}
	}
	catch (Exception e){
		System.out.println("All your cannons have been destroyed.");
		cannon = 0;
	}
	return cannon;
}
public static int addCannon(int cannonAdd) {
	cannon = cannon + cannonAdd;
	if (cannon > cannonMax) {
		System.out.println("Amount of cannons exceeds the maximum capacity. Discarding the excess.");
		cannon = cannonMax;
	}
	return cannon;
}

/*public static int removeAmmo(int ammoRemove) {
	ammo = ammo - ammoRemove;
	/*if (ammo <= 0) {
		System.out.println("All your ammo has been used");
		ammo = 0;
	} */
//	try {
		//if (ammo <= 0) {
			//throw new Exception();
		//}
	//}
//	catch (Exception e){
		//System.out.println("All your ammo has been used");
		//ammo = 0;
	//}
	//return ammo;
//}
//public static int addAmmo(int ammoAdd) {
	//ammo = ammo + ammoAdd;
	//if (ammo > ammoMax) {
		//System.out.println("Amount of ammo exceeds the maximum capacity. Discarding the excess.");
		//ammo = ammoMax;
	//}
	//return ammo;
//} 
/*
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
}*/

public static void shipDetails() {
	//String details="Your ship is a";
	System.out.println("Your Ship is a "+ shipType+" ");
	System.out.println(shipDescription);
	System.out.println("Ship Status");
	System.out.println("Hull: "+hull+"/"+hullMax);
	System.out.println("Sails: "+sails+"/"+sailsMax);
	System.out.println("Crew: "+crew+"/"+crewMax);
	System.out.println("Cannons: "+cannon+"/"+cannonMax);
	System.out.println("Food: "+food+"/"+foodMax);
	System.out.println("Water: "+water+"/"+waterMax);
}

}