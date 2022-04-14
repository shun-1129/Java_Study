import java.util.Scanner;

public class Day04_Ensyu04 {

	public static void main(String[] args) {

		Tantou3[] tn = new Tantou3[10];
		Tantou3 tn1 = new Tantou3();
		
		tn[0] = new Tantou3("佐藤一郎", 10, "システム部");
		tn[1] = new Tantou3("山田太郎", 11, "システム部");
		tn[2] = new Tantou3("佐々木花子", 12, "システム部");
		tn[3] = new Tantou3("田中次郎", 13, "システム部");
		tn[4] = new Tantou3("伊藤くん", 14, "システム部");
		tn[5] = new Tantou3("古田君", 15, "システム部");
		tn[6] = new Tantou3("永野くん", 16, "システム部");
		tn[7] = new Tantou3("あべくん", 17, "システム部");
		tn[8] = new Tantou3("春日", 18, "システム部");
		tn[9] = new Tantou3("髙橋君", 19, "営業部");
		
		tn1.Disp2();
		int select1 = Integer.parseInt(tn1.select());
		tn1.Disp3();
		int select2 = Integer.parseInt(tn1.select());
		
		for(int i = 0; i < tn.length; i++) {
			if(tn[i].getAge() >= select1 && tn[i].getAge() <= select2) {
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

class Tantou3 {
	private String name;
	private int age;
	private String syozoku;

	Tantou3() {
		this.name = "<noname>";
		this.age = 0;
		this.syozoku = "<nodata>";
	}
	
	Tantou3(String name, int age, String syozoku) {
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
		System.out.print("開始:");
	}
	
	public void Disp3() {
		System.out.print("終了:");
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
