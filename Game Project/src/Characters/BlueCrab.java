package Characters;

public class BlueCrab extends Critter{

	boolean Invincible;
	
	public BlueCrab(int xPos, int yPos, int health, int landSpd, int waterSpd, boolean xDir, boolean yDir, int oyserCol,
			int concreteCol, int compostCol, boolean Inv) {
		super(xPos, yPos, health, landSpd, waterSpd, xDir, yDir, oyserCol, concreteCol, compostCol);
			this.Invincible = false;
	}
	
	public void setInvincible(boolean Invi){
		this.Invincible = Invi;
	}
	
	public boolean getInvincible(){
		return this.Invincible;
	}

	public void foam(){
		this.setInvincible(true);
	}
}
