import java.util.*;
public class TankApp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String control;
		Tank tank = new Tank();
		do{
			System.out.print("タンク操作を入力(U(p),D(own),R(ight),L(eft),S(how),Q(uit)>>");
			control = scan.nextLine();
			tank.controller(control);
			if(control.equalsIgnoreCase("q") || control.equalsIgnoreCase("quit"))break;
		}while(true);
		System.out.println("終了");
	}
}

