package Rev;

public class Test6 {

	public static void main(String[] args) {
		
		Test6 fur = new Test6();
		fur.door(84l, 76);
		
	}
	
	public void door(String key, int pwd) {
		System.out.println("Door Open");
	}
	public void door(long lock, int pwd) {
		System.out.println("Door Close");
	}
	public void door(String key, int pwd, long token) {
		System.out.println("Door broken");
	}

}
