package hijava.practice;

public class Str {

	public static void main(String[] args) {
		char c = 'A';		// cf. char c = 65;    or  char c = '\uD55C';
		byte b = 'A';		// character, byte: single quotation ('')
		System.out.println(c);
		System.out.println( (int)c );    // cf. (char)c  or   (char)b
		System.out.println(b);
		
		String str = "AB";		// string: double quotation ("")
		System.out.println(str);
		System.out.println("AB".getBytes().length);
		System.out.println("AB한".getBytes().length);	
		System.out.println("한".getBytes().length);
	}
	
}
