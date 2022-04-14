
public class JaCls07 {

	public static void main(String[] args) {
		
		System.out.println("----------------------インスタンス生成前の操作");
		MyCls01.clsVar = 33;
		MyCls01.clsMeth();
		
		System.out.println("----------------------インスタンスメンバの操作");
		MyCls01 a = new MyCls01();
		MyCls01 b = new MyCls01();
		a.insVar = 10;
		b.insVar = 20;
		
		a.insMeth();
		b.insMeth();
		
		System.out.println("----------------------クラスメンバの操作");
		a.clsVar = 99;
		System.out.println(a.clsVar);
		System.out.println(b.clsVar);
		System.out.println(MyCls01.clsVar);
		
	}
	
}

class MyCls01 {
	int insVar = 0;
	static int clsVar = 0;

	public void insMeth() {
		System.out.println("insMeth : insVar = " + insVar);
	}
	public static void clsMeth() {
		System.out.println("clsMeth : clsVar = " + clsVar);
	}
}
