package loot;

public class Loot {


		private int spices;
		private int sugar;
		private double goldp;
		private int treasureChest;
		private int luxuries;
		private int goods;
		private int cannons;

		    public Loot(){
		     treasureChest = 0;
		     sugar = 0;
		     goldp = 10;
		     spices = 0;
		     luxuries = 0;
		    }


		    public int getChest(){
		        return treasureChest;
		    }

		    public double getGold(){
		        return goldp;
		    }
		    
		    public int getSugar() {
		    	return sugar;
		    }
		    
		    public int getCannon() {
		    	return cannons;
		    }

		    public int getGoods() {
		    	return goods;
		    }
		    
		    public int getSpice() {
		    	return spices;
		    }

		    public void updateSpice(int found) {
		    	if (spices - found >= 0) {
		    	spices = spices + found;
		    	System.out.println("Your new spice count is " + spices);
		    	}else if (spices - found < 0) {
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
		    
		    public void updateSugar(int found) {
		    	if (sugar - found >= 0) {
			    	sugar = sugar + found;
			    	System.out.println("Your new sugar count is " + sugar);
			    	}else if (sugar - found < 0) {
			    	System.out.println("You do not have enough sugar to make that transaction.");
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
		    
		    public void updateGold(int found) {
		    	if (goldp - found >= 0) {
			    	goldp = goldp + found;
			    	System.out.println("Your new gold piece(s) count is " + goldp);
			    	}else if (goldp - found < 0) {
			    	System.out.println("You do not have enough gold piece(s) to make that transaction.");
		    }
		    }

		    public void resetLoot(){
		        spices = 0;
		        goldp = 10;
		        sugar = 0;
		        luxuries = 0;
		        treasureChest = 0;
		        goods = 0;
		        cannons = 0;		        		        
		    }

		   public void Status() {
			   System.out.println("Here is your current inventory!");
			   System.out.println("You currently have " + goldp + " piece(s)!");
			   System.out.println("You currently have " + spices + " spice(s)!");
			   System.out.println("You currently have " + treasureChest + " treasure chest(s)!");
			   System.out.println("You currently have " + luxuries + " luxurious item(s)!");
			   System.out.println("You currently have " + goods + " assorted good(s)!");
			   System.out.println("You currently have " + sugar + " unit(s) of sugar!");
			   System.out.println("You currently have " + cannons + " cannonball(s) in reserve!");
			   }
}
