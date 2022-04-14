
public class Day04_Ensyu01 {

	public static void main(String[] args) {
		
		User User = new User();
		User.number = 123456;
		User.name = "伊藤太郎";
		User.age = 21;
		User.sex = "男";
		
		User.Disp();

	}
	
}

class User {
	int number;
	String name;
	int age;
	String sex;
	
	void Disp() {
		System.out.println("社員番号 : " + number);
		System.out.println("\t氏名 : " + name);
		System.out.println("\t年齢 : " + age);
		System.out.println("\t性別 : " + sex);
	}
}