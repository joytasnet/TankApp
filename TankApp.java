import java.util.*;
public class TankApp{
	public static void main(String[] args){
		Tank tank=new Tank();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("タンク操作を入力(U(p),D(own),R(ight),L(eft),S(how),Q(uit)>>");
			String select=sc.next().substring(0,1).toUpperCase();
			switch(select){
				case "U":
					tank.moveUp();
				break;
				case "D":
					tank.moveDown();
				break;
				case "R":
					tank.moveRight();
				break;
				case "L":
					tank.moveLeft();
				break;
				case "S":
					tank.showPos();
				break;
				default:
					System.out.println("終了");
					return;
			}
		}
	}
}
