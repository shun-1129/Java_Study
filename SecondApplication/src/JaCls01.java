
class JaCls01 {

	public static void main(String[] args) {

		Zaiko dt = new Zaiko();
		dt.name = "HDD1428";
		dt.count = 30;
		dt.Disp();

	}

}

class Zaiko {

	String name;
	int count;
	
	void Disp() {
		System.out.println("名前 : " + name + " 個数 : " + count);
	}

}