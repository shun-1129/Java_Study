
public class Day02_Kadai6 {

	public static void main(String[] args) {
		
		int[] a = {10, 2, 5, 6, 11, 8, 6};
		int[] b = {5, 15, 25, 35, 40, 45, 50};
		
		int[] math = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			math[i] = a[i] * b[i];
		}
		
		for(int i = 0; i < math.length; i++) {
			System.out.println(math[i]);
		}

	}

}
