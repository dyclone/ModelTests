package Action;


import Characters.Critter;
import Characters.Group;

public class Action {

	private final static int MOVEMENT = 3;
	
	public static void moveRight(Critter c){
		c.setX(c.getX()+MOVEMENT);
	}
	
	public static void moveLeft(Critter c){
		c.setX(c.getX()-MOVEMENT);
	}
	
	public static void swimUp(Critter c){
		c.setY(c.getY()+MOVEMENT);
	}
	
	public static void swimDown(Critter c){
		c.setY(c.getY()-MOVEMENT);
	}
	
	//Do this after merge	
//	public static void jump(Critter c){
//		
//	}
	
	//Group already has this
//	public static void switchChar(Group g){
//		
//	}
	
	//Do this after merge	
//	public static void attack(){
//		
//	}
	
	//Do this after merge	
//	public static void special(){
//		
//	}
}
