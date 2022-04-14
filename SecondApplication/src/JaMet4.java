
public class JaMet4 {

	public static void main(String[] args) {
		
		int idt = 111;
		double ddt = 22.33;

		disp();
		disp(idt);
		disp(ddt);
		disp(444,555);
		disp(idt, ddt);
		disp(ddt, idt);
		
	}
	
	static void disp() {
		System.out.println("Start");
	}
	
	static void disp(int n) {
		System.out.println("int = " + n);
	}
	
	static void disp(double n) {
		System.out.println("double = " + n);
	}
	
	static void disp(int n1, int n2) {
		System.out.println("int = " + n1 + " n2 = " + n2);
	}
	
	static void disp(int n1, double n2) {
		System.out.println("int = " + n1 + " double = " + n2);
	}
	
	static void disp(double n1, int n2) {
		System.out.println("double = " + n1 + " int = " + n2);
	}

}
