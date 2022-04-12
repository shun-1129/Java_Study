
public class Day02_Ensyu14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int sum = 0;
		int count = 1;
		
		while(count <= 1000) {
			sum += count;
			if(sum >= 30000) {
				System.out.println(sum);
				System.out.println(count);
				break;
			}
			
			count++;
		}
		
		System.out.println();
		
		sum = 0;
		count = 1;
		
		while(true) {
			sum += count;
			if(sum >= 30000) {
				System.out.println(sum);
				System.out.println(count);
				break;
			}
			
			count++;
		}

	}

}
