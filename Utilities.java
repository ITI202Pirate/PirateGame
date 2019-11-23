package pirateGame;

import java.util.Scanner;

public class Utilities {
	public static void promptEnterKey(){
		   System.out.println("Press \"ENTER\" to continue...");
		   Scanner scanner = new Scanner(System.in);
		   scanner.nextLine();
		  
		}
	public static int getRandomIntegerBetweenRange(int min, int max){
		//enter min and max values, so 5,10 means you get something between 5-10.
	    int x = (int)(Math.random()*((max-min)+1))+min;
	    return x;
	}
}
