package pirateGame;

public class CombatShip {
	
	private  int ehull;
	private  int esails;
	private   int esailsToughness;
	private   int ecrew;
	private   int ecannons;
	private  String edescription;
	private  int maxEhull;
	private  int maxEsails;
	private   int maxesailsToughness;
	private   int maxEcrew;
	private   int maxEcannons;
	
	public  int getEhull() {
		return ehull;
	}
	public void setEhull(int ehull) {
		this.ehull = ehull;
	}
	public  int getEsails() {
		return esails;
	}
	public  void setEsails(int esails) {
		this.esails = esails;
	}
	public  int getEsailsToughness() {
		return esailsToughness;
	}
	public  void setEsailsToughness(int esailsToughness) {
		this.esailsToughness = esailsToughness;
	}
	public  int getEcrew() {
		return ecrew;
	}
	public  void setEcrew(int ecrew) {
		this.ecrew = ecrew;
	}
	public  int getEcannons() {
		return ecannons;
	}
	public  void setEcannons(int ecannons) {
		this.ecannons = ecannons;
	}
	public String getEdescription() {
		return edescription;
	}
	public void setEdescription(String edescription) {
		this.edescription = edescription;
	}
	/**
	 * 
	 */
	public  void display() {
		System.out.println("Your Hull:"+ehull+"/"+maxEhull);
		System.out.println("Your Sails:"+esails+"/"+maxEsails);
		System.out.println("Your Crew:"+ecrew+"/"+maxEcrew);
		System.out.println("Your Cannons:"+ecannons+"/"+maxEcannons);
	//	System.out.println("Enemy Hull:"+ehull);
	}
	public  void makeCutter(){
		ehull=12;
		maxEhull=ehull;
		
		esails=10;
		maxEsails=esails;
		esailsToughness=1;
		
		ecrew=8;
		maxEcrew=ecrew;
		
		ecannons=6;
		maxEcannons=ecannons;
		
		edescription="A small and sleek vessel designed for coastal travel. It usually carries goods and mail. ";
		
		
	}
	public  void makeBrig(){
		ehull=20;
		maxEhull=ehull;
		
		esails=8;
		maxEsails=esails;
		esailsToughness=2;
		
		ecrew=8;
		maxEcrew=ecrew;
		
		ecannons=6;
		maxEcannons=ecannons;
		edescription="A medium sized cargo vessel capable of traveling to far away lands. It can hold animals, colonists and valuable goods. ";
		
		
	}
}


