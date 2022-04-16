public class Tank{
	int x = 0;
	int y = 0;

	public void controller(String control){
		if(control.equalsIgnoreCase("u") || control.equalsIgnoreCase("up")){
				moveUp();
		}else if(control.equalsIgnoreCase("d") || control.equalsIgnoreCase("down")){
				moveDown();
		}else if(control.equalsIgnoreCase("r") || control.equalsIgnoreCase("Right")){
				moveRight();
		}else if(control.equalsIgnoreCase("l") || control.equalsIgnoreCase("Left")){
				moveLeft();
		}else if(control.equalsIgnoreCase("s") || control.equalsIgnoreCase("show")){
				showPos();
		}
	}
	public void moveUp(){
		this.x++;
		System.out.println("上に移動！");
	}
	public void moveDown(){
		this.x--;
		System.out.println("下に移動！");
	}
	public void moveLeft(){
		this.y--;
		System.out.println("左に移動！");
	}
	public void moveRight(){
		this.y++;
		System.out.println("右に移動！");
	}
	public void showPos(){
		System.out.printf("現在座標(x:%d,y:%d)%n",this.x,this.y);
	}
}
