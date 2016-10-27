package Barrier;

public class Barrier {
		 static int durability;
		 static int x;
		 static int y;
		 static int cost;
		 
		 /** 
		  * Returns a barrier object that will block waves at the end of the game
		  * 
		  * @param durability how tough the barrier will be against waves
		  * @param x the x position of the barrier
		  * @param y the y position of the barrier 
		  * @param cost how many pieces it will take to construct
		  */
		 
		 public Barrier(int durability, int x, int y, int cost){
			 this.durability = durability;
			 this.x = x;
			 this.y = y;
			 this.cost = cost;
		 }
		 
		 public static void setDur(int newDur){
			    durability = newDur;
		 }
		 public static void setX(int newX){
				x = newX;
			}
		 public static void setY(int newY){
				y = newY;
			}
		 public static void setCost(int newCost){
			   cost = newCost;
		 }
		 
		 public static int getDur(){
			 return durability;
		 }
		 public static int getX(){
				return x;
			}
		 public static int getY(){
				return y;
			}
		 public static int getCost(){
			 return cost;
		 }
		

}
