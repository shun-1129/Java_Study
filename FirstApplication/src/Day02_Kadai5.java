
public class Day02_Kadai5 {

	public static void main(String[] args) {
		
		int[] a = {10, 2, 5, 6, 11, 8, 6};
		int[] b = {12, 4, 6, 16, 7, 5};
		
		int[] temp = new int[b.length];
		
		int count = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] != b[j]) {
					System.out.println(b[j]);
				}
			}
		}

	}

}
