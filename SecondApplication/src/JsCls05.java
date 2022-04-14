
public class JsCls05 {

	public static void main(String[] args) {

		Zaiko5 dt1 = new Zaiko5();
		Zaiko5 dt2 = new Zaiko5("DVD", 30);
		dt1.Disp();
		dt2.Disp();
		
	}

}

class Zaiko5 {
	String name;
	int count;

	Zaiko5() {
		this.name = "<noname>";
		this.count = 0;
	}
	
	Zaiko5(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	void Disp() {
		System.out.println("名前 : " + name + " 個数 : " + count);
	}
}
