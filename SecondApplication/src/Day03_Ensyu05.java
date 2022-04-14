
public class Day03_Ensyu05 {

	public static void main(String[] args) {
		
		int[] a = {50, 20, 80, 30, 10, 40};
		
		System.out.println(MaxOfArray(a));
		

	}

	static int MaxOfArray(int[] x) {
		
		int temp = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = i + 1; j< x.length; j++) {
				if(x[i] < x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		
		return x[0];
		
	}
	
}
