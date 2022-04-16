import java.util.*;
public class NagatsuTankApp{
	public static void main(String[] args){
		Tank t = new Tank();
		Scanner scan = new Scanner(System.in);
		String command;
		while(true){
			System.out.println("タンク操作を入力");
			System.out.print("U(p),D(own),R(ight),L(eft),S(how),Q(uit)>>");
			command = scan.nextLine();
			if(command.equalsIgnoreCase("U") || command.equalsIgnoreCase("Up")){
				t.moveUp();
			}
			if(command.equalsIgnoreCase("D") || command.equalsIgnoreCase("Down")){
				t.moveDown();
			}
			if(command.equalsIgnoreCase("R") || command.equalsIgnoreCase("Right")){
				t.moveRight(); 
			}
			if(command.equalsIgnoreCase("L") || command.equalsIgnoreCase("Left")){
				t.moveLeft();
			}
			if(command.equalsIgnoreCase("S") || command.equalsIgnoreCase("Show")){
				t.showPos();
			}
			if(command.equalsIgnoreCase("Q") || command.equalsIgnoreCase("Quit")){
				break;
			}
		}
		System.out.println("終了");
	}
}
