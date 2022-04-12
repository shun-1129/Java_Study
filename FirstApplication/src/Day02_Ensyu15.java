
public class Day02_Ensyu15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int count = 1;
		
		while(count <= 1000) {
			if(count <= 500 && count % 3 == 0) {
				System.out.println(count);
			} else if(count > 500 && count <= 1000 && count % 2 == 0) {
				System.out.println(count);
			}
			
			count++;
		}
		
		System.out.println();
		
		count = 1;

		while(true) {
			if(count > 1000) {
				break;
			}
			if(count <= 500 && count % 3 == 0) {
				System.out.println(count);
			} else if(count > 500 && count <= 1000 && count % 2 == 0) {
				System.out.println(count);
			}
			
			count++;
		}
		
	}

}
