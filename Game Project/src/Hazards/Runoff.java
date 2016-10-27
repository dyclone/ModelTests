package Hazards;

import Environment.Water;

public class Runoff extends Hazards{

	public Runoff(int Speed, int damage, int xWLoc, int yWLoc) {
		super(Speed, damage, xWLoc, yWLoc);
	}
	
	public void flow(){
		this.setXWLoc(this.getXWLoc() + this.getSpd());
	}
	
	public boolean contamine(Water aWater){
		if(this.getXWLoc() == aWater.getx()){
			return true;
		}
		else{
			return false;
		}
	}
}
