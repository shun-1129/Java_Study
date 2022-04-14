import java.util.Scanner;

public class Day04_Ensyu03 {

	public static void main(String[] args) {

		Tantou2[] tn = new Tantou2[10];
		Tantou2 tn1 = new Tantou2();
		
		tn[0] = new Tantou2("佐藤一郎", 10, "システム部");
		tn[1] = new Tantou2("山田太郎", 11, "システム部");
		tn[2] = new Tantou2("佐々木花子", 12, "システム部");
		tn[3] = new Tantou2("田中次郎", 13, "システム部");
		tn[4] = new Tantou2("伊藤くん", 14, "システム部");
		tn[5] = new Tantou2("古田君", 15, "システム部");
		tn[6] = new Tantou2("永野くん", 16, "システム部");
		tn[7] = new Tantou2("あべくん", 17, "システム部");
		tn[8] = new Tantou2("春日", 18, "システム部");
		tn[9] = new Tantou2("髙橋君", 19, "営業部");
		
		tn1.Disp2();
		String select = tn1.select();
		
		for(int i = 0; i < tn.length; i++) {
			if(tn[i].getSyozoku().equals(select)) {
				tn[i].Disp();
			}
		}
		
		/*
		for(int i = 0; i < tn.length; i++) {
			tn[i].Disp();
		}
		*/

	}

}

class Tantou2 {
	private String name;
	private int age;
	private String syozoku;

	Tantou2() {
		this.name = "<noname>";
		this.age = 0;
		this.syozoku = "<nodata>";
	}
	
	Tantou2(String name, int age, String syozoku) {
		this.name = name;
		this.age = age;
		this.syozoku = syozoku;
	}
	
	public String select() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public void Disp() {
		System.out.print("氏名 : " + this.name);
		System.out.print("\t年齢 : " + this.age);
		System.out.println("\t所属部署 : " + this.syozoku);
	}
	
	public void Disp2() {
		System.out.print("1 : システム部\n2 : 営業部\n部署を選択 : ");
	}

	String getName() {
		return this.name;
	}
	
	int getAge() {
		return this.age;
	}
	
	String getSyozoku() {
		return this.syozoku;
	}
	
}
