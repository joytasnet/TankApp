import java.util.*;
public class MatsuokaTankApp{
	public static void main(String[] args){
		Tank tank=new Tank();
		while(true){
			System.out.print("タンク操作を入力(U(p),D(own),R(ight),L(eft),S(how),Q(uit)>>");
			Scanner scan=new Scanner(System.in);
			String operation=scan.nextLine();
			if(operation.equalsIgnoreCase("up")||operation.equalsIgnoreCase("u")){
				tank.moveUp();
			}
			if(operation.equalsIgnoreCase("down")||operation.equalsIgnoreCase("d")){
				tank.moveDown();
			}
			if(operation.equalsIgnoreCase("right")||operation.equalsIgnoreCase("r")){
				tank.moveRight();
			}
			if(operation.equalsIgnoreCase("left")||operation.equalsIgnoreCase("l")){
				tank.moveLeft();
			}
			if(operation.equalsIgnoreCase("show")||operation.equalsIgnoreCase("s")){
				tank.showPos();
			}
			if(operation.equalsIgnoreCase("quit")||operation.equalsIgnoreCase("q")){
				System.out.println("終了");
				break;
			}

		}
	}
}
