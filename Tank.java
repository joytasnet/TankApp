import java.util.*;
public class Tank{
	int x;
	int y;

	public void moveUp(){
		y+=1;
	}
	public void moveDown(){
		y-=1;
	}
	public void moveRight(){
		x+=1;
	}
	public void moveLeft(){
		x-=1;
	}
	public void showPos(){
		System.out.printf("x=%d,y=%d%n",x,y);
	}
}
