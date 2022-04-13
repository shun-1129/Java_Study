
public class Day02_Kadai3 {

	public static void main(String[] args) {
		
		int[] a = {10, 2, 5, 6, 11, 8, 6};
		
		int temp = a[0];
		for(int i = 0; i < a.length; i++) {
			if(temp > a[i]) {
				temp = a[i];
			}
		}
		
		System.out.println(temp);

	}

}
