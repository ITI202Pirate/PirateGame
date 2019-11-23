package pirateGame;

public class Loot extends ship {


		private int water;
		private int food;
		private double doubloons;
		private int treasureChest;
		private int luxuries;
		private int goods;
		private int cannons;
		private int drop;

		    public Loot(){
		     treasureChest = 0;
		     food = 0;
		     doubloons = 500;
		     water = 0;
		     luxuries = 0;
		     goods = 0;
		     cannons = 0;
		    }

		    public static int getRandomIntegerBetweenRange(int min, int max){
		        //enter min and max values, so 5,10 means you get something between 5-10.
		        int x = (int)(Math.random()*((max-min)+1))+min;
		        return x;
		    }

		    public int getChest(){
		        return treasureChest;
		    }

		    public double getDoubloons(){
		        return doubloons;
		    }
		    
		    public int getFood() {
		    	return food;
		    }
		    
		    public int getCannons() {
		    	return cannons;
		    }

		    public int getGoods() {
		    	return goods;
		    }
		    
		    public int getWater() {
		    	return water;
		    }

		    public void updateWater(int found) {
		    	if (water - found >= 0) {
		    	water = water + found;
		    	System.out.println("Your new spice count is " + water);
		    	}else if (water - found < 0) {
		    	System.out.println("You do not have enough spice(s) to make that transaction.");
		    }
		    }
		    
		    public void updateLuxuries(int found) {
		    	if (luxuries - found >= 0) {
		    	luxuries = luxuries + found;
		    	System.out.println("Your new luxuries count is " + luxuries);
		    	}else if (luxuries - found < 0) {
		    	System.out.println("You do not have enough luxuries to make that transaction.");
		    }
		    }
		    
		    public void updateGoods(int found) {
		    	if (goods - found >= 0) {
			    	goods = goods + found;
			    	System.out.println("Your new good(s) count is " + goods);
			    	}else if (goods - found < 0) {
			    	System.out.println("You do not have enough good(s) to make that transaction.");
		    }
		    }
		    
		    
		    public void updateCannons(int found) {
		    	if (cannons - found >= 0) {
			    	cannons = cannons + found;
			    	System.out.println("Your new cannon(s) in reserve count is " + cannons);
			    	}else if (cannons - found < 0) {
			    	System.out.println("You do not have enough cannon(s) in reserve to make that interaction.");
		    }
		    }
		    
		    public void updateFood(int found) {
		    	if (food - found >= 0) {
			    	food = food + found;
			    	System.out.println("Your new food count is " + food);
			    	}else if (food - found < 0) {
			    	System.out.println("You do not have enough food to make that transaction.");
		    }
		    }
		    
		    public void updateChest(int found) {
		    	if (treasureChest - found >= 0) {
			    	treasureChest = treasureChest + found;
			    	System.out.println("Your new treasure chest(s) count is " + treasureChest);
			    	}else if (treasureChest - found < 0) {
			    	System.out.println("You do not have enough treasure chest(s) to make that transaction.");
		    }
		  }
		    
		    public void updateDoubloons(int found) {
		    	if (doubloons - found >= 0) {
			    	doubloons = doubloons + found;
			    	System.out.println("Your new gold piece(s) count is " + doubloons);
			    	}else if (doubloons - found < 0) {
			    	System.out.println("You do not have enough gold piece(s) to make that transaction.");
		    }
		    }

		    public void resetLoot(){
		        water = 0;
		        doubloons = 10;
		        food = 0;
		        luxuries = 0;
		        treasureChest = 0;
		        goods = 0;
		        cannons = 0;		        		        
		    }

		   public void Status() {
			   System.out.println("Here is your current inventory!");
			   System.out.println("You currently have " + doubloons + " doubloon(s)!");
			   System.out.println("You currently have " + water + "unit(s) of water!");
			   System.out.println("You currently have " + treasureChest + " treasure chest(s)!");
			   System.out.println("You currently have " + luxuries + " luxurious item(s)!");
			   System.out.println("You currently have " + goods + " assorted good(s)!");
			   System.out.println("You currently have " + food + " unit(s) of food!");
			   System.out.println("You currently have " + cannons + " cannonball(s) in reserve!");
			   }
		   
		   public void dropLoot(int size) {
			   if (size == 1) {
				   	   drop = getRandomIntegerBetweenRange(50,100);
				   	   System.out.println("You got " + drop + " doubloons!");
					   doubloons = doubloons + drop;
				   	   drop = getRandomIntegerBetweenRange(10,20);
				   	   System.out.println("You got " + drop + " unit(s) of water!");
					   water = water + drop;
					   drop = getRandomIntegerBetweenRange(10,20);
					   System.out.println("You got " + drop + " doubloons!");
					   food = food + drop;
					   drop = getRandomIntegerBetweenRange(5,10);
					   cannons = cannons + drop;
					   System.out.println("Your new doubloon count is " + doubloons);
					   System.out.println("Your new water count is " + water);
					   System.out.println("Your new food count is " + food);
					   System.out.println("Your new cannon count is " + cannons);
			   }
			   else if (size == 2) {
				   drop = getRandomIntegerBetweenRange(100,200);
			   	   System.out.println("You got " + drop + " doubloons!");
				   doubloons = doubloons + drop;
			   	   drop = getRandomIntegerBetweenRange(20,40);
			   	   System.out.println("You got " + drop + " unit(s) of water!");
				   water = water + drop;
				   drop = getRandomIntegerBetweenRange(20,40);
				   System.out.println("You got " + drop + " doubloons!");
				   food = food + drop;
				   drop = getRandomIntegerBetweenRange(10,20);
				   cannons = cannons + drop;
				   System.out.println("Your new doubloon count is " + doubloons);
				   System.out.println("Your new water count is " + water);
				   System.out.println("Your new food count is " + food);
				   System.out.println("Your new cannon count is " + cannons);
			   }
			   else if (size == 3) {
				   drop = getRandomIntegerBetweenRange(200,300);
			   	   System.out.println("You got " + drop + " doubloons!");
				   doubloons = doubloons + drop;
			   	   drop = getRandomIntegerBetweenRange(30,60);
			   	   System.out.println("You got " + drop + " unit(s) of water!");
				   water = water + drop;
				   drop = getRandomIntegerBetweenRange(30,60);
				   System.out.println("You got " + drop + " doubloons!");
				   food = food + drop;
				   drop = getRandomIntegerBetweenRange(15,30);
				   cannons = cannons + drop;
				   System.out.println("Your new doubloon count is " + doubloons);
				   System.out.println("Your new water count is " + water);
				   System.out.println("Your new food count is " + food);
				   System.out.println("Your new cannon count is " + cannons);
			   }
			   else if (size == 4 ) {
				   drop = getRandomIntegerBetweenRange(300,400);
			   	   System.out.println("You got " + drop + " doubloons!");
				   doubloons = doubloons + drop;
			   	   drop = getRandomIntegerBetweenRange(40,80);
			   	   System.out.println("You got " + drop + " unit(s) of water!");
				   water = water + drop;
				   drop = getRandomIntegerBetweenRange(40,80);
				   System.out.println("You got " + drop + " doubloons!");
				   food = food + drop;
				   drop = getRandomIntegerBetweenRange(20,40);
				   cannons = cannons + drop;
				   System.out.println("Your new doubloon count is " + doubloons);
				   System.out.println("Your new water count is " + water);
				   System.out.println("Your new food count is " + food);
				   System.out.println("Your new cannon count is " + cannons);
			   }
			   else if (size == 5) {
				   drop = getRandomIntegerBetweenRange(400,500);
			   	   System.out.println("You got " + drop + " doubloons!");
				   doubloons = doubloons + drop;
			   	   drop = getRandomIntegerBetweenRange(50,100);
			   	   System.out.println("You got " + drop + " unit(s) of water!");
				   water = water + drop;
				   drop = getRandomIntegerBetweenRange(50,100);
				   System.out.println("You got " + drop + " doubloons!");
				   food = food + drop;
				   drop = getRandomIntegerBetweenRange(20,40);
				   cannons = cannons + drop;
				   System.out.println("Your new doubloon count is " + doubloons);
				   System.out.println("Your new water count is " + water);
				   System.out.println("Your new food count is " + food);
				   System.out.println("Your new cannon count is " + cannons);
				   		
			   }
		   }
}
