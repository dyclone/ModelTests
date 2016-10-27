package Hazards;

import org.junit.experimental.theories.Theories;

public class Hazards {

	int Speed;
	int damage;
	int xWLoc;
	int yWLoc;

	/**
	 * The constructor makes a Hazard object that you will have to collect in order to project your estuary 
	 * 
	 * @param Speed how fast a hazard will move 
	 * @param damage how much damage it will do to either the estuary or critter 
	 * @param xWLoc x position of the hazard 
	 * @param yWLoc y position of the hazard
	 */
	public Hazards(int Speed, int damage, int xWLoc, int yWLoc){
		this.Speed = Speed;
		this.damage = damage;
		this.xWLoc = xWLoc;
		this.yWLoc = yWLoc;	
	}
	
	 public void setSpeed(int newSpd){
		   this.Speed = newSpd;
	 }
	 public void setDamage(int newDam){
		   this.damage = newDam;
	 }
	 public void setXWLoc(int newX){
			this.xWLoc = newX;
		}
	 public void setYWLoc(int newY){
			this.yWLoc = newY;
		}
	  
	 public int getSpd(){
		 return Speed;
	 }
	 public int getDamage(){
		 return damage;
	 }
	 public int getXWLoc(){
			return xWLoc;
		}
	 public int getYWLoc(){
			return yWLoc;
		}
	 
}
