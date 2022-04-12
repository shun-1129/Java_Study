public class Day02_Ensyu07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] sum = new int[2];
		int[] count = new int[2];
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum[0] += i;
				count[0]++;
			} else {
				sum[1] += i;
				count[1]++;
			}
		}

		System.out.println("偶数 AVERAGE = " + (double)(sum[0] / count[0]));
		System.out.println("奇数 AVERAGE = " + (double)(sum[1] / count[1]));
		
	}

}
