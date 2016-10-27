package Environment;


public class Water {

	int x;
	int y;
	int contaminateLvl;
	
	public Water(int x, int y, int contaminateLvl){
		this.x = x;
		this.y = y;
		this.contaminateLvl = contaminateLvl;
	}
	
	public void setx(int newX){
		 this.x = newX;
	 }
	public void sety(int newY){
		 this.y = newY;
	 }
	public void setCLvl(int newCLvl){
		 this.contaminateLvl = newCLvl;
	 }
	
	public int getx(){
		 return x;
	 }
	public int gety(){
		 return y;
	 }
	public int getContaminateLvl(){
		 return contaminateLvl;
	 }
	
	public boolean CThreshHold(){
		if(getContaminateLvl() == 5){
			return true;
		}
		else return false;
	}
}
