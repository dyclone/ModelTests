package Characters;
import DropItems.ConcreteSlab;
import DropItems.DropItem;
import DropItems.OysterG;

public class Enemy extends Critter{
	int dropvalue;
	
	/**
	 * Constructor that produces an enemy that will try to damage and attack your critters inorder to stop you from completing your goal to save the estuary
	 * 
	 * @param xPos x position on enemy
	 * @param yPos y position on enemy
	 * @param health health of enemy 
	 * @param landSpd speed traveled on land for enemy 
	 * @param waterSpd speed traveled in water for enemy
	 * @param xDir what direction the enemy is looking (left or right)
	 * @param yDir what direction the enemy is looking (up or down)
	 * @param oyserCol amount of oysters the enemy has
	 * @param concreteCol amount of concrete the enemy has
	 * @param compostCol amount of compost the enemy has
	 * @param dropvalue what type of item will the enemy drop
	 */
	public Enemy(int xPos, int yPos, int health, int landSpd, int waterSpd, boolean xDir, boolean yDir, int oyserCol,
			int concreteCol, int compostCol, int dropvalue) {
		super(xPos, yPos, health, landSpd, waterSpd, xDir, yDir, oyserCol, concreteCol, compostCol);
		this.dropvalue = dropvalue;
	}

	public void setDValue(int newValue){
		this.dropvalue = newValue;
	}
	
	public int getDValue(){
		return this.dropvalue;
	}
	
	/**
	 * Method that drops a type of barrier when an enemy health is 0
	 * 
	 * @param badGuy a random enemy 
	 * @return returns a barrier if the drop value if 0 else don't do anything 
	 */
	public DropItem drop(){
		if(this.health == 0){
			if(this.dropvalue == 0){
				return new OysterG(this.xPos, this.yPos);
			}
			else{
				return new ConcreteSlab(this.xPos, this.yPos);
			}
		}
		return null;
		
	}
	
	

	
	
	
}
