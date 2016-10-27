package DropItems;


public class DropItem {
	static int x;
	static int y; 

	public DropItem(int x, int y){
		this.x = x;
		this.x = y; 
	}
	
	public void setX(int X){
		x = X;
	}
	public void setY(int Y){
		x = Y;
	}
	
	public static int getX(){
		return x;
	}
	public static int getY(){
		return y;
	}
}
