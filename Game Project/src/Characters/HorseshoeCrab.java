package Characters;

public class HorseshoeCrab extends Critter{

	public HorseshoeCrab(int xPos, int yPos, int health, int landSpd, int waterSpd, boolean xDir, boolean yDir,
			int oyserCol, int concreteCol, int compostCol) {
		super(xPos, yPos, health, landSpd, waterSpd, xDir, yDir, oyserCol, concreteCol, compostCol);
	}
	
	public void blueBlood(Critter aOyster, Critter aCrab){
		if(this.getHealth() >= 10){
			this.setHealth(this.getHealth()-10);
			aOyster.setHealth(aOyster.getHealth()+10);
			aCrab.setHealth(aCrab.getHealth()+10);
			if(aOyster.getHealth()>100){
				aOyster.setHealth(100);
			}
			if(aCrab.getHealth()>100){
				aCrab.setHealth(100);
			}
		}
	}

}
