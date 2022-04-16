public class Tank{
	int x=0;
	int y=0;
	public void moveUp(){
		this.y+=1;
	}
	public void moveDown(){
		this.y-=1;
	}
	public void moveRight(){
		this.x+=1;
	}
	void moveLeft(){
		this.x-=1;
	}
	void showPos(){
		System.out.printf("(x:%d,y:%d)\n",x,y);
	}

}
