public class Day02_Ensyu07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int eve = 0;
		int odd = 0;
		int count_eve = 0;
		int count_odd = 0;
		double eve_ave = 0.0;
		double odd_ave = 0.0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				eve += i;
				count_eve++;
			} else {
				odd += i;
				count_odd++;
			}
		}

		eve_ave = (double)eve / (double)count_eve;
		odd_ave = (double)odd / (double)count_odd;

		System.out.println("偶数 AVE = " + eve_ave);
		System.out.println("奇数 AVE = " + odd_ave);
		
	}

}
