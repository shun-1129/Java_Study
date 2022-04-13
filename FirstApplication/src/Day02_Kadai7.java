
public class Day02_Kadai7 {

	public static void main(String[] args) {
		
		int[][] a = {{10, 20, 30, 40, 50},{20, 30, 40, 50, 60},{80, 70, 60, 50, 40}};

		int max = 0;
		int min = 100;
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(max < a[i][j]) {
					max = a[i][j];
				}
				if(min > a[i][j]) {
					min = a[i][j];
				}
				
				sum += a[i][j];
			}
		}
		
		System.out.println("MAX = " + max);
		System.out.println("MIN = " + min);
		System.out.println("SUM = " + sum);
		
	}

}
