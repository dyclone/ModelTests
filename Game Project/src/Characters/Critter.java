package Characters;
import Barrier.Barrier;
import Barrier.ConcreteWall;
import Barrier.Gavion;
import DropItems.ConcreteSlab;
import DropItems.DropItem;
import DropItems.OysterG;

public class Critter {
	 int xPos;
	 int yPos; 
	 int health;
	 int landSpd;
	 int waterSpd;
	 boolean xDir;
	 boolean yDir;
	 int oysterCol;
	 int concreteCol;
	 int compostCol;

	public Critter(int xPos, int yPos, int health, int landSpd, int waterSpd, boolean xDir, boolean yDir, int oysterCol, int concreteCol, int compostCol){
		this.xPos = xPos;
		this.yPos = yPos; 
		this.health = health;
		this.landSpd = landSpd;
		this.waterSpd = waterSpd;
		this.xDir = xDir;
		this.yDir = yDir;
		this.oysterCol = oysterCol;
		this.concreteCol = concreteCol;
		this.compostCol = compostCol;
	}
	
	public void setX(int newX){
		xPos = newX;
	}
	public void setY(int newY){
		yPos = newY;
	}
	public void setHealth(int newHealth){
		health = newHealth;
	}
	public void setLSpd(int newLSpd){
		landSpd = newLSpd;
	}
	public void setWSpd(int newWSpd){
		waterSpd = newWSpd;
	}
	public void setXDir(boolean newXDir){
		xDir = newXDir;
	}
	public void setYDir(boolean newYDir){
		yDir = newYDir;
	}
	public void setOysterCol(int newOCol){
		oysterCol = newOCol;
	}
	public void setConcreteCol(int newCCol){
		concreteCol = newCCol;
	}
	public void setCompostCol(int newComCol){
		compostCol = newComCol;
	}
	
	public int getX(){
		return this.xPos;
	}
	public int getY(){
		return this.yPos;
	}
	public int getHealth(){
		return this.health;
	}
	public int getLSpd(){
		return this.landSpd;
	}
	public int getWSpd(){
		return this.waterSpd;
	}
	public boolean getXDir(){
		return this.xDir;
	}
	public boolean getYDir(){
		return this.yDir;
	}
	public int getOysterCol(){
		return this.oysterCol;
	}
	public int getConcreteCol(){
		return this.concreteCol;
	}
	public int getCompostCol(){
		return this.compostCol;
	}
	
	public void attack(Enemy badguy){
		if(this.xDir == true && (this.xPos + 3) == badguy.xPos){
			   badguy.health = badguy.health - 50;
			}
		else if(this.xDir == false && (this.xPos - 3) == badguy.xPos){
			badguy.health = badguy.health - 50; 
		}
	}
	
	public void collect(DropItem aItem){
		if(this.xPos == OysterG.getX()){
			this.oysterCol += 1;
		}
		else if(this.xPos == ConcreteSlab.getX()){
			this.concreteCol += 1;
		}
	}
	
	public Barrier conctruct(){
		if(this.oysterCol >= Gavion.getCost()){
			this.oysterCol -= Gavion.getCost();
			return new Gavion(5, xPos, yPos, 5);
		}
		if(this.concreteCol >= ConcreteWall.getCost()){
			this.concreteCol -= ConcreteWall.getCost();
			return new ConcreteWall(3, xPos, yPos, 3);
		}
		else{
		return null; 
		} 
	}
	
	
	
	
}
