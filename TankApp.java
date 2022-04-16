import java.util.*;
public class TankApp{
	public static void main(String[] args){
		Tank tank = new Tank();
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("タンク操作を入力(U(p),D(own),R(ight),L(eft),S(how),Q(uit)>");
			String move = scan.next();
			if(move.equalsIgnoreCase("U")){
				tank.moveUp();
			}else if(move.equalsIgnoreCase("D")){
				tank.moveDown();
			}else if(move.equalsIgnoreCase("R")){
				tank.moveRight();
			}else if(move.equalsIgnoreCase("L")){
				tank.moveLeft();
			}else if(move.equalsIgnoreCase("S")){
				tank.showPos();
			}else return;
		}
	}
}
