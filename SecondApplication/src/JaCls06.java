
public class JaCls06 {

	public static void main(String[] args) {

		Zaiko6[] dt1 = new Zaiko6[3];
		Zaiko6[] dt2 = {
				new Zaiko6("ITEM-A", 10),
				new Zaiko6("ITEM-B", 20),
				new Zaiko6("ITEM-C", 30)
		};

		dt1[0] = new Zaiko6();
		dt1[1] = new Zaiko6("HDD1428", 5);
		dt1[2] = new Zaiko6("DVD2233", 6);

		for(int i = 0; i< dt1.length; i++) {
			dt1[i].Disp();
		}
		
		for(int i = 0; i < dt2.length; i++) {
			dt2[i].Disp();
		}
		
	}

}

class Zaiko6 {
	String name;
	int count;

	Zaiko6() {
		this.name = "<noname>";
		this.count = 0;
	}
	
	Zaiko6(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	void Disp() {
		System.out.println("名前 : " + name + " 個数 : " + count);
	}
}
