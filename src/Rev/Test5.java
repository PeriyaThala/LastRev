package Rev;

public class Test5 {
	
	private int length;
	private int width;
	private int height;

	public int getLength() {
		return length;
	}

	public void setLength(int l) {
		this.length = l;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int w) {
		this.width = w;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int h) {
		this.height = h;
	}
	
	public void boxD(int l, int w, int h) {
		System.out.println("dimensions are "+l+" "+w+" "+h);
	}

	public static void main(String[] args) {
		Test5 creob = new Test5();
		creob.boxD(1, 2, 3);
	}
}
