
public class JaAry1 {

	public static void main(String[] args) {
		
		int[] a = new int[10];

		for(int i = 0; i < a.length; i++) {
			a[i] = (int)Math.pow(i, 2);
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
