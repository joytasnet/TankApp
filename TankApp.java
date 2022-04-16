import java.util.*;
public class TankApp{
	public static void main(String[] args){
		Tank tank=new Tank();
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.print("タンク操作を入力(U(p),D(own),R(ight),L(eft),S(how),Q(uit)>>");
			String word=scan.nextLine();
			if(word.startsWith("u")||word.startsWith("U")){
				tank.moveUp();
			}else if(word.startsWith("d")||word.startsWith("D")){
				tank.moveDown();
			}else if(word.startsWith("r")||word.startsWith("R")){
				tank.moveRight();
			}else if(word.startsWith("l")||word.startsWith("L")){
				tank.moveLeft();
			}else if(word.startsWith("s")||word.startsWith("S")){
				tank.showPos();
			}else if(word.startsWith("q")||word.startsWith("Q")){
				System.out.println("終了");
				return;
			}
		}
	}
}
