public class Tank{
	int x = 0;
	int y = 0;
	public void moveUp(){
		y++;
	}
	public void moveDown(){
		y--;
	}
	public void moveRight(){
		x++;
	}
	public void moveLeft(){
		x--;
	}
	public void showPos(){
		System.out.printf("現在座標(x:%d,y:%d)%n",x,y);
	}
}
