
public class Day02_Ensyu12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int eve = 0;
		int odd = 0;
		int count = 1;
		
		while(count <= 100) {
			if(count % 2 == 0) {
				eve += count;
			} else {
				odd += count;
			}
			count++;
		}

		System.out.println(eve);
		System.out.println(odd);
		System.out.println();
		
		eve = 0;
		odd = 0;
		count = 1;
		
		while(true) {
			if(count > 100) {
				break;
			}
			
			if(count % 2 == 0) {
				eve += count;
			} else {
				odd += count;
			}
			count++;
		}
		
		System.out.println(eve);
		System.out.println(odd);

	}

}
