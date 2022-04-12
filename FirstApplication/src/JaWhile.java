
public class JaWhile {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i = 1;
		int sum = 0;
		
		while(i <= 5) {
			sum += i;
			i++;
		}
		
		System.out.println("sum = " + sum);
		
		i = 1;
		while(i < 10000) {
			System.out.print(i + " ");
			i *= 2;
		}
		System.out.println();
		
	}

}
