package Rev;

public class Test1 {

	public int instVar;

	public int getInstVar() {
		return instVar;
	}

	public void setInstVar(int instVar) {
		this.instVar = instVar;
	}

	public static void main(String[] args) {

		int locVar1 = 10;
		int locVar2 = 20;
		Test1 newObj = new Test1();
		newObj.instVar = 15;
		System.out.println(newObj.instVar + locVar2);

		if (locVar1 > locVar2) {
			System.out.println("loc1 is big");
		} else if (locVar1 == locVar2) {
			System.out.println("Loc1 is same as loc2");
		} else {
			if (newObj.instVar == 15) {
				System.out.println("true");
			}
			System.out.println("loc2 is big");
		}

		int locVar3;
		locVar3 = locVar1 > locVar2 ? 1 : 2;
		System.out.println(locVar3);
		boolean locVar4 = locVar1 < locVar2 ? true : false;
		System.out.println(locVar4);

		switch (locVar1) {
		case 1:
			System.out.println("true!!!");
			break;
		case 10:
			System.out.println("yes");
			break;
		default:
			System.out.println("bye");
			break;
		}

		while (locVar1 < locVar2) {
			System.out.println("locVar1 is: " + locVar1);
			locVar1++;
			
		}
		do {
			System.out.println("print: " + locVar1);
			locVar1++;
		} while (locVar1 < 22);

		for (int i = 10; i < 15; i++) {
			System.out.println("print value of i: " + i);
		}

		for (; locVar1 < 24; locVar1++) {
			for (int o = 21; o < locVar1; o++) {
				System.out.println("pp : " + o);
				System.out.println("pp 11111 : " + locVar1);
			}
		}
		
		

	}

}
