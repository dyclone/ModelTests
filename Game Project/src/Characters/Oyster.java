package Characters;

import Hazards.Bubbles;

public class Oyster extends Critter{

	public Oyster(int xPos, int yPos, int health, int landSpd, int waterSpd, boolean xDir, boolean yDir, int oyserCol,
			int concreteCol, int compostCol) {
		super(xPos, yPos, health, landSpd, waterSpd, xDir, yDir, oyserCol, concreteCol, compostCol);
	}

	public Bubbles Bubble(){ 
		return new Bubbles(3, 1, this.xPos, this.yPos);
	}
}
