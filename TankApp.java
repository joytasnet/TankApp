import java.util.*;
public class TankApp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Tank t1 = new Tank();
		while(true){
			System.out.print("タンク操作を入力(U(p),D(own),R(ight),L(eft),S(how),Q(uit)>>");
			String ans = scan.nextLine();
			if(ans.startsWith("u") || ans.startsWith("U")){
				t1.moveUp();
			}else if(ans.startsWith("d") || ans.startsWith("D")){
				t1.moveDown();
			}else if(ans.startsWith("r") || ans.startsWith("R")){
				t1.moveRight();
			}else if(ans.startsWith("l") || ans.startsWith("L")){
				t1.moveLeft();
			}else if(ans.startsWith("s") || ans.startsWith("S")){
				t1.showPos();
			}else if(ans.startsWith("q") || ans.startsWith("Q")){
				System.out.println("終了");
				return;
			}
		}
	}
}
