
public class Day02_Ensyu02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		for(int i = 1; i <= 100; i++) {
			if(i >= 80) {
				if(i % 2 == 0) {
					System.out.println("+★" + i);
				} else {
					System.out.println("+△" + i);
				}
			} else {
				if(i % 2 == 0) {
					System.out.println("★" + i);
				} else {
					System.out.println("△" + i);
				}
			}
		}

	}

}
