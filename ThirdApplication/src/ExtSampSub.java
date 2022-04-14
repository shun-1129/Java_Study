
public class ExtSampSub extends ExtSampSuper {
	
	public static void main(String[] args) {
		
		ExtSampSub calc = new ExtSampSub();
		calc.calc();
		
	}

	public void calc() {
		//1～100の合計
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		setMsg(String.valueOf(sum));
		DispMsg();
	}

}
