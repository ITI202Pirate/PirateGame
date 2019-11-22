package pirateGame;
public class DifferentShips extends ship {

	public static void Caravel() {
		//ship caravel = new ship();
		shipType="Caravel";
		shipDescription="A light commercial vessel fit for general purpose cargo.";
		setWater(10);
		setWaterMax(20);
		
		setFood(10);
		setFoodMax(20);
		
		//setAmmo(10);
		//setAmmoMax(20);
		
		setCannon(5);
		setCannonMax(10);
		
		setCrew(10);
		setCrewMax(20);
		
		setHull(10);
		hullMax=10;
		setSail(25);
		sailsMax=25;
		
		setSailToughness(1);
	}
	
	public static void DutchClipper() {
		
		shipType="Dutch Clipper";
		shipDescription="A fast but spacious ship capable of sailing into the wind.";
		//ship clipper = new ship();
		setWater(20);
		setWaterMax(40);
		
		setFood(20);
		setFoodMax(40);
		
		//setAmmo(20);
		//setAmmoMax(40);
		
		setCannon(10);
		setCannonMax(20);
		
		setCrew(20);
		setCrewMax(40);
		
		setHull(20);
		hullMax=20;
		setSail(45);
		sailsMax=45;
		setSailToughness(2);
	}
	
	public static void Galleon() {
		shipType="Galleon";
		shipDescription="A sturdy ocean going vessel fit for carrying heavy goods and treasure.";
		//ship galleon = new ship();
		setWater(30);
		setWaterMax(60);
		
		setFood(30);
		setFoodMax(60);
		
		//setAmmo(30);
		//setAmmoMax(60);
		
		setCannon(15);
		setCannonMax(30);
		
		setCrew(30);
		setCrewMax(60);
		
		setHull(30);
		hullMax=30;
		setSail(20);
		sailsMax=20;
		setSailToughness(3);
	}
	
	public static void Brig() {
		shipType="Brig";
		shipDescription="A medium sized commercial vessel fit for general purpose cargo with a decent armament.";
		//ship brig = new ship();
		setWater(40);
		setWaterMax(80);
		
		setFood(40);
		setFoodMax(80);
		
		//setAmmo(40);
		//setAmmoMax(80);
		
		setCannon(20);
		setCannonMax(40);
		
		setCrew(40);
		setCrewMax(80);
		
		setHull(40);
		hullMax=40;
		setSail(30);
		sailsMax=30;
		setSailToughness(4);
	}

	public static void ShipOfTheLine() {
		shipType="Ship of the Line";
		shipDescription="A powerful battleship bristling with cannon and many sails.";
	//	ship ShipOfTheLine = new ship();
		setWater(50);
		setWaterMax(100);
		
		setFood(50);
		setFoodMax(100);
		
		//setAmmo(50);
		//setAmmoMax(100);
		
		setCannon(25);
		setCannonMax(50);
		
		setCrew(50);
		setCrewMax(100);
		
		setHull(50);
		hullMax=50;
		setSail(40);
		sailsMax=40;
		setSailToughness(5);
	}
	//       Small ships have a sailToughness of 1
	//Medium ships 2 and large ships 3
	/*
	 * Also you need to add a system for checking maximum values
	 * so they can't overload the ship with items
You can do different ship types
Also once treasure and loot are done there will be additional items that the ship can carry later that will need to be added
that will need to be avaiable for placing on the ship
You might want to make it into another class
that ship extends
Just 3 types
or more if you have time
	 */
}