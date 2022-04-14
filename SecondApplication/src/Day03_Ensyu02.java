
public class Day03_Ensyu02 {

	public static void main(String[] args) {

		int data1 = taiseki(10, 10, 10);
		
		System.out.println("体積は " + data1 + " mm^3");
		
		int[] data = {5, 4, 7, 9,12};
		
		System.out.println(max_return(data));
		
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8,9,10};
		int[] c = Integration(a, b);
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}
	
	static int taiseki(int x, int y, int z) {
		return x * y * z;
	}
	
	static int max_return(int[] data) {
		int max = 0;
		for(int i = 0; i < data.length; i++) {
			for(int j = i + 1; j < data.length; j++) {
				if(data[i] < data[j]) {
					max = data[j];
				}
			}
		}
		
		return max;
	}

	static int[] Integration(int[] data1, int[] data2) {
		int[] data = new int[data1.length + data2.length];
		
		int count = 0;
		for(int i = 0; i < data1.length; i++) {
			data[count] = data1[i];
			count++;
		}
		for(int i = 0; i < data2.length; i++) {
			data[count] = data2[i];
			count++;
		}
		
		return data;
	}
}
