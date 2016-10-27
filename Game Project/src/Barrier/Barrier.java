package Barrier;

public class Barrier {
		  int durability;
		  int x;
		  int y;
		  int cost;
		 
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
		 
		 public  void setDur(int newDur){
			    durability = newDur;
		 }
		 public  void setX(int newX){
				x = newX;
			}
		 public  void setY(int newY){
				y = newY;
			}
		 public  void setCost(int newCost){
			   cost = newCost;
		 }
		 
		 public  int getDur(){
			 return durability;
		 }
		 public  int getX(){
				return x;
			}
		 public  int getY(){
				return y;
			}
		 public  int getCost(){
			 return cost;
		 }
		

}
