
public class DataXY2 extends DataX2 {
	private int y;

	public int getY() {
		return y;
	}

	public void setXY(int x,int y) {
		setX(x);
		this.y = y;
	}
	
	public void disp_xy() {
		System.out.println("x = " + getX() + " y = " + y);
	}
}
