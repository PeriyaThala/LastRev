package Rev;

public class Test2 {

	public static void main(String[] args) {
		
		int[] myintarr = new int[10];
		myintarr[0] = 10;
		myintarr[1] = 20;
		myintarr[2] = 30;
		myintarr[3] = 40;

		int[] myintarr1 = { 1, 2, 3, 4 };

		System.out.println(myintarr1[3]);
		System.out.println(myintarr.length);

		for (int i = 0; i < myintarr1.length; i++) {
			System.out.println(myintarr1[i]);
		}

		int[][] dimarr = { { 1, 2, 3, 4 }, { 0, 1, 2 } };
		System.out.println(dimarr.length);
		for (int i = 0; i < dimarr.length; i++) {
			for (int j = 0; j < dimarr[i].length; j++) {
				System.out.println(dimarr[i][j]);
			}
		}

	}

}
