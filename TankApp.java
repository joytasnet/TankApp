import java.util.*;
public class TankApp{
	public static void main(String[] args){
		Tank tank1 = new Tank();
		while(true){
			System.out.print("タンク操作を入力(U(p),D(own),R(ight),L(eft),S(how),Q(uit)>>");
			String act = new Scanner(System.in).nextLine();
			if(act.equalsIgnoreCase("u")||act.equalsIgnoreCase("up")){
				tank1.moveUp();
			}else if(act.equalsIgnoreCase("d")||act.equalsIgnoreCase("down")){
				tank1.moveDown();
			}else if(act.equalsIgnoreCase("r")||act.equalsIgnoreCase("right")){
				tank1.moveRight();
			}else if(act.equalsIgnoreCase("l")||act.equalsIgnoreCase("left")){
				tank1.moveLeft();
			}else if(act.equalsIgnoreCase("s")||act.equalsIgnoreCase("show")){
				tank1.showPos();
			}else if(act.equalsIgnoreCase("q")||act.equalsIgnoreCase("quit")){
				System.out.println("終了します");
				return;
			}
		}
	}
}
