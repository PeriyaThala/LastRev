package Rev;

public class Test3 {

	public static void main(String[] args) {
		Test3 objjj = new Test3();
		objjj.doLogin();
		int i = objjj.doLogout();
		System.out.println(i);

	}
	
	public void doLogin() {
		System.out.println("Login Successfull");
	}
	
	public int doLogout() {
		return 12;
	}

}
