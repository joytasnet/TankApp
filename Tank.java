public class Tank{
	int x = 0;
	int y = 0;
	public void moveUp(){
		System.out.println("上に移動!");
		this.y++;
	}
	public void moveDown(){
		System.out.println("下に移動!");
		this.y--;
	}
	public void moveRight(){
		System.out.println("右に移動!");
		this.x++;
	}
	public void moveLeft(){
		System.out.println("左に移動!");
		this.x--;
	}
	public void showPos(){
		System.out.printf("現在座標(x:%d,y:%d)%n",this.x,this.y);
	}
}
