package PirateGame;

import java.util.Random;

public class Player{
	
	private String name;
	
	public String getName() {
		return name;}
	
	public void setName() {
		this.name = name;}	
	
	Random rand = new Random();//creation of random number generator to later determine player Sword skill
	
	int rng1 = rand.nextInt(10);//declaration and initialization of RNG that has an upper limit of ten. 

	private int SwordSkill;
	
	public int getSwordSkill() {
		return rng1;}
	
	public void setSwordSkill() {
		this.SwordSkill = rng1;}

	private int doubloons;
	
	public int getDoublons() {
		return doubloons;}
	
	public void setDoubloons() {
		this.doubloons = doubloons;
	}
}
