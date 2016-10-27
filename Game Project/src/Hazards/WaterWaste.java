package Hazards;

public class WaterWaste extends Hazards{

	public WaterWaste(int Speed, int damage, int xWLoc, int yWLoc) {
		super(Speed, damage, xWLoc, yWLoc);
	}

	public boolean Bottom(int y){
		if(yWLoc == y){
			return true;
		}
		else{ 
			return false;
		}
	}
	
	public void fall(){
		this.setYWLoc(this.getYWLoc() + this.getSpd());
	}
}
