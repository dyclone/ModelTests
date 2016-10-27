package Environment;

import Hazards.WaterWaste;

public class Habitat {
	final int width = 200;
	final int height = 100;
	int Health;
	int TrashCounter;
	int RecycleCounter;
	
	public Habitat(int width, int height, int Health, int TrashCounter, int RecycleCounter){
		this.Health = Health;
		this.TrashCounter = TrashCounter;
		this.RecycleCounter = RecycleCounter;			
	}
	
	public void setHealth(int aHealth){
		this.Health = Health;
	}
	public void setTrashCounter(int TC){
		this.TrashCounter = TC;
	}
	public void setRecycleCounter(int RC){
		this.RecycleCounter = RC;
	}
	
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public int getHealth(){
		return Health;
	}
	public int getTrashCounter(){
		return TrashCounter;
	}
	public int getRecycleCounter(){
		return RecycleCounter;
	}
	
	public void WasteHitter(WaterWaste someWW){
		if(this.getHeight() == someWW.getYWLoc()){
			this.setHealth(this.getHealth() - someWW.getDamage());
		}
	}
}
