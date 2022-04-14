
public class Day03_Ensyu06 {

	static String time = "";
	static int HH = 0;
	static int MM = 0;
	static int SS = 0;

	public static void main(String[] args) {

		timeSet(10);
		timeDisp();
		
		timeSet(10, 20);
		timeDisp();
		
		timeSet(10, 20, 30);
		timeDisp();

	}
	
	static void timeSet(int x) {
		HH = x;
	}

	static void timeSet(int x, int y) {
		HH = x;
		MM = y;
	}
	
	static void timeSet(int x, int y, int z) {
		HH = x;
		MM = y;
		SS = z;
	}
	
	static void timeDisp() {
		System.out.println(HH + ":" + MM + ":" + SS);
	}
}
