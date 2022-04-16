import java.util.*;
public class TankApp{
	public static void main(String[] args){
		Tank tank1 = new Tank();
		while(true){
			System.out.print("タンク操作を入力(U(p),D(own),R(ight),L(eft),S(how),Q(uit)>>");
			String s = new Scanner(System.in).nextLine();
			if(s.equalsIgnoreCase("Up") || s.equalsIgnoreCase("U")){
				tank1.moveUp();
			}else if(s.equalsIgnoreCase("Down")|| s.equalsIgnoreCase("D")){
				tank1.moveDown();
			}else if(s.equalsIgnoreCase("Right")|| s.equalsIgnoreCase("R")){
				tank1.moveRight();
			}else if(s.equalsIgnoreCase("Left")|| s.equalsIgnoreCase("L")){
				tank1.moveLeft();
			}else if(s.equalsIgnoreCase("Show")|| s.equalsIgnoreCase("S")){
				tank1.showPos();
			}else if(s.equalsIgnoreCase("Quit")|| s.equalsIgnoreCase("Q")){
				System.out.println("終了");
				break;
			}
		}			
	}
}
