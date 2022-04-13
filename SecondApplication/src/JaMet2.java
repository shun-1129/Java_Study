import java.util.Scanner;

public class JaMet2 {

	public static void main(String[] args) {
		
		double ave;
		double a = 11.11;
		double b = 33.33;
		String ss;

		opening();
		ss = getstr();
		putstr(ss);
		ave = average(a, b);
		putstr("average = " + ave);

	}

	static void opening() {
		System.out.println("メソッドの動作を確認します");
	}

	static String getstr() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		return s;
	}

	static void putstr(String s) {
		System.out.println(s);
	}

	static double average(double x, double y) {
		return (x + y) / 2;
	}

}
