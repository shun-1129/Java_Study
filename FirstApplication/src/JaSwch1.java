
public class JaSwch1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		for(int a = 1; a <= 5; a++) {
			System.out.print(a + ": ");
			switch(a) {
				case 1:
					System.out.println("a = 1");
					break;
				case 3:
					System.out.println("a = 3");
					break;
				case 5:
					System.out.println("a = 5");
					break;
				default:
					System.out.println("1, 3, 5 以外");
			}
		}
		
	}

}
