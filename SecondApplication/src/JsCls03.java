
public class JsCls03 {

	public static void main(String[] args) {

		Zaiko3 dt = new Zaiko3();
		dt.Disp();
		
	}

}

class Zaiko3 {
	String name = "<noname>";
	int count = 0;
	
	void Disp() {
		System.out.println("名前 : " + name + " 個数 : " + count);
	}
}
