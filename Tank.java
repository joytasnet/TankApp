import java.util.*;
public class Tank{
	int x=0;
	int y=0;
	public void moveUp(){
		System.out.println("上に移動");
		this.y += 1;
	}
	public void moveDown(){
		System.out.println("下に移動");
		this.y -= 1;
	}
	public void moveRight(){
		System.out.println("右に移動");
		this.x += 1;
	}
	public void moveLeft(){
		System.out.println("左に移動");
		this.x -= 1;
	}
	public void showPos(){
		System.out.printf("現在の座標(x:%d,y:%d)%n",this.x,this.y);
	}
}
