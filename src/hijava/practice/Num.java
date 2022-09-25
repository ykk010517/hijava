package hijava.practice;

public class Num {

	public static void main(String[] args) {
		byte b = 1;
		short s = 1;
		
		int i = 1;
		long l = 1;
//		long l = 2147483648L;

		System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}

}

// max value보다 커지거나 min value보다 작아지면 안 됨 (overflow error; out of range)
