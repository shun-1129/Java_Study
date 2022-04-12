
public class Day02_Ensyu16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
int count = 1;
		
		while(count <= 500) {
			switch(500 % count) {
				case 0:
					System.out.println(count);
					break;
				default:
			}
			
			count++;
		}
		
		System.out.println();
		
		count = 1;
		
		while(true) {
			if(count > 500) {
				break;
			}
			switch(500 % count) {
				case 0:
					System.out.println(count);
					break;
				default:
			}
			
			count++;
		}

	}

}
