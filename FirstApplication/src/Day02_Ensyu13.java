
public class Day02_Ensyu13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int sum = 0;
		int count = 1;
		
		while(count <= 100) {
			if(count % 6 != 0) {
				sum += count;
			}
			
			count++;
		}

		System.out.println(sum);
		System.out.println();
		
		sum = 0;
		count = 1;
		
		while(true) {
			if(count > 100) {
				break;
			}
			if(count % 6 != 0) {
				sum += count;
			}
			
			count++;
		}

		System.out.println(sum);
		System.out.println();

	}

}
