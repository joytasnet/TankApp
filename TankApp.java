import java.util.*;
public class TankApp{
	public static void main(String[] args){
		Tank tank = new Tank();

		Scanner scanner = new Scanner(System.in);
		do{
			System.out.print("タンク操作を入力(U(p),D(own),R(ight),L(eft),S(how),Q(uit)>>");
			String choice = scanner.next();

			if(choice.equalsIgnoreCase("u")||choice.equalsIgnoreCase("up")){
				tank.moveUp();
			}

			if(choice.equalsIgnoreCase("d")||choice.equalsIgnoreCase("down")){
				tank.moveDown();
			}

			if(choice.equalsIgnoreCase("r")||choice.equalsIgnoreCase("right")){
				tank.moveRight();
			}

			if(choice.equalsIgnoreCase("l")||choice.equalsIgnoreCase("left")){
				tank.moveLeft();
			}

			if(choice.equalsIgnoreCase("s")||choice.equalsIgnoreCase("show")){
				tank.showPos();
			}

			if(choice.equalsIgnoreCase("q")||choice.equalsIgnoreCase("quit")){
				System.out.println("終了");
				break;
			}
		}while(true);
	}
}
