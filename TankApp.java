import java.util.*;
public class TankApp{
	public static void main(String[] args){
		Tank tank = new Tank();
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("タンク操作を入力(U(p),D(own),R(ight),L(eft),S(how),Q(uit)>");
			String move = scan.next();
			if(move.equalsIgnoreCase("U")||move.equalsIgnoreCase("up")){
				tank.moveUp();
			}else if(move.equalsIgnoreCase("D")||move.eqaulsIgnoreCase("down")){
				tank.moveDown();
			}else if(move.equalsIgnoreCase("R")||move.equalsIgnoreCase("right")){
				tank.moveRight();
			}else if(move.equalsIgnoreCase("L")||move.equalsIgnoreCase("left")){
				tank.moveLeft();
			}else if(move.equalsIgnoreCase("S")||move.equalsIgnoreCase("show")){
				tank.showPos();
			}else return;
		}
	}
}
