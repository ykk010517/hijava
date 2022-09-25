package hijava.practice;

public class Casting {
	public static void main(String[] args) {
		byte b = 1;
		int i = b;
		long l = 12345678;
		
		
		
//		b =  i;
//		b는 1바이트, i는 4바이트이므로 에러 발생 
		
		System.out.println(i + l);
	}
}
