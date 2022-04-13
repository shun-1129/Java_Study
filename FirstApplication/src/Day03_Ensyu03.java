
public class Day03_Ensyu03 {

	public static void main(String[] args) {
		
		int[][] a = {
				{7,2,3,5,9},
				{3,8,5,6,7}
		};
		
		int[] MAX = new int[2];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				
				if(MAX[i] < a[i][j]) {
					MAX[i] = a[i][j];
				}
			}
		}

		System.out.println(MAX[0]);
		System.out.println(MAX[1]);

	}

}
