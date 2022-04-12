
public class JaFor1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int sum = 0;
		int mul = 1;
		
		for(int i = 0; i  <= 5; i++) {
			sum += i;
			mul *= i;
		}

		System.out.println(sum);
		System.out.println(mul);
		
		for(int i = 40; i >= 20; i -= 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();

	}

}
