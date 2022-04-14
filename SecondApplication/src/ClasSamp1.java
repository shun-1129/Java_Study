
public class ClasSamp1 {

	public static void main(String[] args) {
		
		/*
		 *
		 *	MyCls a = new MyCls();は
		 *
		 *	Default packageに存在するMyCls.classを参照している。
		 * 
		 */

		MyCls MyCls = new MyCls();
		MyCls.a = 10;
		MyCls.Disp();
		
		MyCls MyCls2 = new MyCls();
		MyCls2.a = 30;
		MyCls2.Disp();

	}

}
