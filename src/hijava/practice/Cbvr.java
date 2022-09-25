package hijava.practice;

public class Cbvr {
	int m = 2;
	
//변수 naming rule
//- 영문자, 숫자, _, ($)
//- 숫자로 시작할 수 없음
//- 예약어는 변수명이 될 수 없음 (볼드체)

	
	
	public static void main(String[] args) {
//CALL BY VALUE: 값이 전달, 기본자료
//CALL BY REFERENCE: 메모리에 주소가 전달, 참조자료
		
		int i = 1;
		System.out.println("i1=" + i );
		
		change1(i);
		System.out.println("i2=" + i);
		
		Cbvr cb1 = new Cbvr();
		System.out.println("cb1=" + cb1.m);
		
		change2(cb1);
		System.out.println("cb2=" + cb1.m);
	}

	
	public static void change2(Cbvr cb) {
		cb.m = 100;
		
	}
	
	
	
	public static void change1(int x) {
		System.out.println("x=" + x);
		
		x = 100;
	}
	
}
