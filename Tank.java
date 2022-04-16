public class Tank{
	int x = 0;
	int y = 0;
	public void moveUp(){
		y++;
		System.out.println("上に移動!");
	}
	public void moveDown(){
		y--;
		System.out.println("下に移動!");
	}
	public void moveRight(){
		x++;
		System.out.println("右に移動!");
	}
	public void moveLeft() {
		x--;
		System.out.println("左に移動!");
	}
	public void showPos(){
		System.out.printf("現在座標(x:%d,y:%d)%n",x,y);
	}
}
