package hijava.practice;

public class N {
	int x = 10;
	int y = 20;
	
	public void swap() {
		int t = x;
		x = y;
		y = t;
	}
	
	
	public void main(String[] args) {
		N n = new N();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
		n.swap();
		System.out.println("----------------");
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
	}

}
