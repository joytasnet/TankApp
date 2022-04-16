import java.util.*;
public class NaganoApp{
	public static void main(String[] args){
		NaganoMain tank1 =new NaganoMain();
		do{
			System.out.print("タンク操作を入力 U(p),D(own),R(ight),L(eft),S(how),Q(uit)>");
			String str =new Scanner(System.in).next();
			char s =str.charAt(0);
			if(s =='U' ||s=='u'){
				tank1.moveUp();
			}else if(s =='D' || s=='d'){
				tank1.moveDown();
			}else if(s =='R' || s=='r'){
				tank1.moveRight();
			}else if(s =='L' || s=='l' ){
				tank1.moveLeft();
			}else if(s =='S' || s=='s'){
				tank1.showPos();
			}else if(s =='Q' || s=='q'){
				System.out.println("終了");
				return;
			}
		}while(true);
	}
}
