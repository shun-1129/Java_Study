
public class Day03_Ensyu04 {

	public static void main(String[] args) {
		
		int[][] kuku = new int[9][9];
		
		for(int i = 0; i < kuku.length; i++) {
			for(int j = 0; j < kuku[i].length; j++) {
				kuku[i][j] = (i + 1) * (j + 1);
			}
		}

		for(int i = 0; i < kuku.length; i++) {
			for(int j = 0; j < kuku[i].length; j++) {
			
				System.out.printf("%3d", kuku[i][j]);
			
			}
			
			System.out.println();
			
		}
	}

}
