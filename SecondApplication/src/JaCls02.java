
public class JaCls02 {

	public static void main(String[] args) {

		Zaiko2 zaiko1 = new Zaiko2();
		Zaiko2 zaiko2 = new Zaiko2();

		zaiko1.setName("HDD1428");
		zaiko1.setCount(30);
		zaiko2.setName("DVD2233");
		zaiko2.setCount(-5);
		
		zaiko1.Disp();
		zaiko2.Disp();
		
	}

}

class Zaiko2 {
	private String name;
	private int count;
	
	void setName(String name) {
		this.name = name;
	}
	
	void setCount(int count) {
		if(count < 0) {
			this.count = 0;
		} else {
			this.count = count;
		}
	}
	
	void Disp() {
		System.out.println("名前 : " + this.name + " 個数 : " + this.count);
	}
}
