package com.javaex.ex01;

public class Ex03 {
	//	자료형 연습 -문자형  
	public static void main (String[] args) {
		
		/*
		문자형에는 char 을 사용하는데 character 의 준말이다.
		char 을 사용할 때에는 한 글자씩만 사용하여야 하고 ''안에 글자를 넣어야 한다.
		 */
		
		char myTxt1 = 'B';
		char myTxt = '안';
		System.out.println(myTxt1);
		System.out.println(myTxt);
		
		/*
		그리고 char은 정해져 았는 코드로도 사용할 수 있는데 이 때 유의해야 할 것은 문자사이에 ''를 사용하지 않는다.
		 */
		char myTxt2 = 65;
		System.out.println(myTxt2);
	}
}
