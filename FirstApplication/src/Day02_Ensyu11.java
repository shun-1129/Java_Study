
public class Day02_Ensyu11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int count = 1;
		int sum = 0;
		
		while(count <= 100) {
			sum += count;
			count++;
		}
		
		System.out.println(sum);
		
		count = 1;
		sum = 0;
		
		while(true) {
			if(count > 100) {
				break;
			}
			sum += count;
			count++;
		}
		System.out.println(sum);

	}

}
