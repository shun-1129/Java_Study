
public class JaStrEqu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		char ch;
		String s1 = "abcd";
		String s2;
		
		s2 = "ab";
		s2 += "cd";
		
		if(s1.equals(s2)) {
			ch = 'Y';
		} else {
			ch = 'N';
		}
		
		System.out.println(ch);

	}

}
