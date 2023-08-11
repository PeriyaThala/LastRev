package Rev;

import dummy1.dummytest1;

public class Test4 {

	public static void main(String[] args) {
		Test4 Orlando = new Test4();
		Orlando.doLogin();
		doLogout();
		System.out.println(Orlando.addNum(15, 9));
		diffpara("Hello Vasu", 25, 0);
		Test3 roja = new Test3();
		roja.doLogin();
		dummytest1 rrr = new dummytest1();
		rrr.doLogin();
	}

	public void doLogin() {
		System.out.println("Login Successfull");
	}

	public static void doLogout() {
		Test4 toronto = new Test4();
		toronto.doLogin();
		System.out.println("Logout Successfull");
	}

	public int addNum(int x, int y) {
		return x + y;
	}

	public static void diffpara(String s, int R, float f) {
		System.out.println(s + " " + R + " " + f);
	}

}
