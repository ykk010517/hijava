package hijava.practice;

/**
 * 
 * @author yuykk
 * @update say함수 추가 (2022-09-20 by yuykk)
 */

public class HelloJava {
	
	public static void main(String[] args) {

//		 HelloJava에게 say라는 명령을 내림.
		HelloJava.say("Hi~");

//		JVM이 스스로 화면에 출력 (command + / )
		System.out.println("Hello Java!!");
	}

	public static void say(String msg) {
		System.out.println(msg);
	}
}


/* 여러 줄 주석
 * Write once, run anywhere
*/


/** 여러 줄 주석(2):코드의 안내 멘트, 중요도 높을 
**/



