import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		Tank tank = new Tank();
		String command = "";
		do{
			System.out.print("タンク操作を入力(U(p),D(own),R(ight),L(eft),S(how),Q(uit)>>");
			command = new Scanner(System.in).nextLine();
			if((command.substring(0,1)).equalsIgnoreCase("U")){
				tank.moveUp();
			}
			if((command.substring(0,1)).equalsIgnoreCase("D")){
				tank.moveDown();
			}
			if((command.substring(0,1)).equalsIgnoreCase("R")){
				tank.moveRight();
			}
			if((command.substring(0,1)).equalsIgnoreCase("L")){
				tank.moveLeft();
			}
			if((command.substring(0,1)).equalsIgnoreCase("S")){
				tank.showPos();
			}
		}while(!(command.substring(0,1)).equalsIgnoreCase("Q"));
		System.out.println("終了");
	}
/*	static void command_judge(String command){
		if((command.substring(0)).equalsIgnoreCase("U")){
			tank.moveUp();
		}
		if((command.substring(0)).equalsIgnoreCase("D")){
			tank.moveDown();
		}
		if((command.substring(0)).equalsIgnoreCase("R")){
			tank.moveRight();
		}
		if((command.substring(0)).equalsIgnoreCase("L")){
			tank.moveLeft();
		}
		if((command.substring(0)).equalsIgnoreCase("S")){
			tank.showPos();
		}
	}*/
}
