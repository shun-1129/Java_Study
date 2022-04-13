
public class Day03_Ensyu01 {

	public static void main(String[] args) {
		
		int[][] a = new int[6][10];
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 10; j++) {
				a[i][j] = j + 1;
			}
		}
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print("\t" + a[i][j]);
			}
			System.out.println();
		}

	}

}
