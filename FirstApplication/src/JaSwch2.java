
public class JaSwch2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		for(int a = 1;  a <= 5; a++) {
			System.out.print(a);
			
			switch(a) {
				case 1:
					System.out.print("青い");
				case 2:
					System.out.println("空");
					break;
				case 3:
					System.out.print("白い");
				case 4:
					System.out.println("曇");
					break;
				default:
					System.out.println("該当なし");
			}
		}
		
	}

}
