
public class Day03_Ensyu03 {

	public static void main(String[] args) {

		double num1 = 11.11;
		double num2 = 33.33;

		System.out.println(Average(num1, num2));

		int x = 1;
		int y = 100;

		System.out.println(Sum(x, y));

	}

	static double Average(double num1, double num2) {
		return (num1 + num2) / 2.0;
	}

	static int Sum(int x, int y) {
		int sum = 0;
		for(int i = x; i <= y; i++) {
			sum += i;
		}

		return sum;

	}

}
