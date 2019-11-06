package pirateGame;

public class CombatShip {
	
	private static int ehull;
	private static int esail;
	private static  int esailToughness;
	private static  int ecrew;
	private static  int ecannon;
	private static String edescription;

	
	public static int getEhull() {
		return ehull;
	}
	public static void setEhull(int ehull) {
		CombatShip.ehull = ehull;
	}
	public static int getEsail() {
		return esail;
	}
	public static void setEsail(int esail) {
		CombatShip.esail = esail;
	}
	public static int getEsailToughness() {
		return esailToughness;
	}
	public static void setEsailToughness(int esailToughness) {
		CombatShip.esailToughness = esailToughness;
	}
	public static int getEcrew() {
		return ecrew;
	}
	public static void setEcrew(int ecrew) {
		CombatShip.ecrew = ecrew;
	}
	public static int getEcannon() {
		return ecannon;
	}
	public static void setEcannon(int ecannon) {
		CombatShip.ecannon = ecannon;
	}
	public static String getEdescription() {
		return edescription;
	}
	public static void setEdescription(String edescription) {
		CombatShip.edescription = edescription;
	}
	public static void makeCutter(){
		ehull=6;
		esail=10;
		esailToughness=1;
		ecrew=8;
		ecannon=6;
		edescription="A small and sleek vessel designed for coastal travel. It usually carries goods and mail. ";
		
		
	}
	public static void makeBrig(){
		ehull=10;
		esail=8;
		esailToughness=2;
		ecrew=8;
		ecannon=6;
		edescription="A medium sized cargo vessel capable of traveling to far away lands. It can hold animals, colonists and valuable goods. ";
		
		
	}
}


