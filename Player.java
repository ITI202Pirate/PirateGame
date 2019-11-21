package pirateGame;

import java.util.Random;

public class Player{
	
	static String name;
	static int doubloons;
	static int SwordSkill;
	
	public String getName() {
		return name;}
	
	public void setName(String name) {
		this.name = name;}	
	
	Random rand = new Random();//creation of random number generator to later determine player Sword skill
	
	int rng1 = rand.nextInt(10);//declaration and initialization of RNG that has an upper limit of ten. 

	
	
	public int getSwordSkill() {
		return rng1;}
	
	public void setSwordSkill() {
		this.SwordSkill = rng1;}

	
	
	public int getDoubloons() {
		return doubloons;}
	
	public void setDoubloons(int doubloons) {
		this.doubloons = doubloons;
	}
}