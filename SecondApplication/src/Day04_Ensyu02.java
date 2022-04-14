
public class Day04_Ensyu02 {

	public static void main(String[] args) {
		
		Tantou[] tn = new Tantou[10];
		
		tn[0] = new Tantou("佐藤一郎", 10, "システム部");
		tn[1] = new Tantou("山田太郎", 11, "システム部");
		tn[2] = new Tantou("佐々木花子", 12, "システム部");
		tn[3] = new Tantou("田中次郎", 13, "システム部");
		tn[4] = new Tantou("伊藤くん", 14, "システム部");
		tn[5] = new Tantou("古田君", 15, "システム部");
		tn[6] = new Tantou("永野くん", 16, "システム部");
		tn[7] = new Tantou("あべくん", 17, "システム部");
		tn[8] = new Tantou("春日", 18, "システム部");
		tn[9] = new Tantou("髙橋君", 19, "営業部");
		
		for(int i = 0; i < tn.length; i++) {
			tn[i].Disp();
		}

	}

}

class Tantou {
	private String name;
	private int age;
	private String syozoku;

	Tantou() {
		this.name = "<noname>";
		this.age = 0;
		this.syozoku = "<nodata>";
	}
	
	Tantou(String name, int age, String syozoku) {
		this.name = name;
		this.age = age;
		this.syozoku = syozoku;
	}
	
	public void Disp() {
		System.out.print("氏名 : " + this.name);
		System.out.print("\t年齢 : " + this.age);
		System.out.println("\t所属部署 : " + this.syozoku);
	}
}