
public class JsCls04 {

	public static void main(String[] args) {

		Zaiko4 dt = new Zaiko4();
		dt.Disp();
		
	}

}

class Zaiko4 {
	String name;
	int count;
	
	Zaiko4() {
		this.name = "<noname>";
		this.count = 0;
	}
	
	void Disp() {
		System.out.println("名前 : " + name + " 個数 : " + count);
	}
}
