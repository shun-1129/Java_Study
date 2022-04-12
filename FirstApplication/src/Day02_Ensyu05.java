
public class Day02_Ensyu05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(sum > 1000) {
				System.out.println(i);
				break;
			}
		}

	}

}
