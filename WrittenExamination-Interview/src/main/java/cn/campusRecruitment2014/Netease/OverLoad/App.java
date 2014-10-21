package cn.campusRecruitment2014.Netease.OverLoad;

public class App {

	public static void main(String[] args) {
		OverLoadTest t = new OverLoadTest();
		
		char c = 'S';
		int i = 2;
		long l = 123L;
		double d = 123.325;
		String s = "LY";
		t.print(c);
		t.print(i);
		t.print(l);
		t.print(d);
		t.print(s);
		
		/**
		 * 如果注释掉
		 * public void print(char c)方法
		 * 则会执行
		 */
	}

}
