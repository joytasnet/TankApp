public class Tank{
	int x = 0;
	int y = 0;
	public void moveUp(){
		this.y +=1;
	}
	public void moveDown(){
		this.y -=1;
	}
	public void moveRight(){
		this.x +=1;
	}
	public void moveLeft(){
		this.x -=1;
	}
	public void showPos(){
		System.out.printf("現在座標(x:%d,y:%d)%n",this.x,this.y);
	}
}
