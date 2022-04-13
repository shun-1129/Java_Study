
public class Day03_Ensyu01 {

	public static void main(String[] args) {
		
		int a = 100;
		String s = "sss";
		int x = 10;
		int y = 10;
		int z = 10;
		
		renketu(a, s);
		menseki(x, y);
		taiseki(x, y, z);

	}

	static void renketu(int a, String s) {
		
		System.out.println(a + s);
		
	}
	
	static void menseki(int a, int b) {
		
		int c = a * b;
		
		System.out.println(c + "mm^2");
		
	}
	
	static void taiseki(int a, int b, int c) {
		
		int d = a * b * c;
		
		System.out.println(d + "mm^3");
		
	}
	
}
