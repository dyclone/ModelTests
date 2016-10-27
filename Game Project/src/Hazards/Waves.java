package Hazards;

import Barrier.Barrier;

public class Waves extends Hazards{

	public Waves(int Speed, int damage, int xWLoc, int yWLoc) {
		super(Speed, damage, xWLoc, yWLoc);
	}
	
	public boolean hitBarrier(Barrier aBarrier){
		if(xWLoc == aBarrier.getX()){
			return true;
		}
		else{
			return false;
		}
	}
}
