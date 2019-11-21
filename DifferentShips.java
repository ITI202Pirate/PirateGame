
public class DifferentShips {

	public static void Caravel() {
		ship caravel = new ship();
		caravel.setWater(10);
		caravel.setWaterMax(20);
		
		caravel.setFood(10);
		caravel.setFoodMax(20);
		
		caravel.setAmmo(10);
		caravel.setAmmoMax(20);
		
		caravel.setCannon(5);
		caravel.setCannonMax(10);
		
		caravel.setCrew(10);
		caravel.setCrewMax(20);
		
		caravel.setHull(10);
		caravel.setSail(10);
		
		caravel.setSailToughness(1);
	}
	
	public static void DutchClipper() {
		ship clipper = new ship();
		clipper.setWater(20);
		clipper.setWaterMax(40);
		
		clipper.setFood(20);
		clipper.setFoodMax(40);
		
		clipper.setAmmo(20);
		clipper.setAmmoMax(40);
		
		clipper.setCannon(10);
		clipper.setCannonMax(20);
		
		clipper.setCrew(20);
		clipper.setCrewMax(40);
		
		clipper.setHull(20);
		clipper.setSail(20);
		
		clipper.setSailToughness(2);
	}
	
	public static void Galleon() {
		ship galleon = new ship();
		galleon.setWater(30);
		galleon.setWaterMax(60);
		
		galleon.setFood(30);
		galleon.setFoodMax(60);
		
		galleon.setAmmo(30);
		galleon.setAmmoMax(60);
		
		galleon.setCannon(15);
		galleon.setCannonMax(30);
		
		galleon.setCrew(30);
		galleon.setCrewMax(60);
		
		galleon.setHull(30);
		galleon.setSail(30);
		
		galleon.setSailToughness(3);
	}
	
	public static void Brig() {
		ship brig = new ship();
		brig.setWater(40);
		brig.setWaterMax(80);
		
		brig.setFood(40);
		brig.setFoodMax(80);
		
		brig.setAmmo(40);
		brig.setAmmoMax(80);
		
		brig.setCannon(20);
		brig.setCannonMax(40);
		
		brig.setCrew(40);
		brig.setCrewMax(80);
		
		brig.setHull(40);
		brig.setSail(40);
		
		brig.setSailToughness(4);
	}

	public static void Battleship() {
		ship battleship = new ship();
		battleship.setWater(50);
		battleship.setWaterMax(100);
		
		battleship.setFood(50);
		battleship.setFoodMax(100);
		
		battleship.setAmmo(50);
		battleship.setAmmoMax(100);
		
		battleship.setCannon(25);
		battleship.setCannonMax(50);
		
		battleship.setCrew(50);
		battleship.setCrewMax(100);
		
		battleship.setHull(50);
		battleship.setSail(50);
		
		battleship.setSailToughness(5);
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
