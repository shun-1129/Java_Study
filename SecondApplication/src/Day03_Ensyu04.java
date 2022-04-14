import java.util.Scanner;

public class Day03_Ensyu04 {

	public static void main(String[] args) {

		double num0 = disp("数値を入力してください : ");
		System.out.println("入力 : " + num0);

	}
	
	static double disp(String str) {
		System.out.println(str);

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		double data = 0.0;
		try {
			return Double.parseDouble(s);
		} catch(NumberFormatException e) {
			return 0.0;
		}
	}

}
