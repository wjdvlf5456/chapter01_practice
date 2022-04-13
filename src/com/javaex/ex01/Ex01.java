package com.javaex.ex01;

public class Ex01 {
	//	자료형 연습
	public static void main (String[] args) {
		//sout 입력 후 자동완성을 누르면 System.out.println(); 을 입력할 수 있다.
		
		
		/*
		자료형 중 정수형 연습
		byte와 short는 이진수로 계산할 때 맨 앞에 0이냐 1이냐로 양수인지 음수인지 정할 수 있다.
		*/
		
		//byte 는 2의 7승인 -128에서 127까지 표현할 수 있다.
		byte var01 = 127;
		System.out.println(var01);
		
		
		//short 는 2의 15승인 -32768에서 32767까지 표현할 수 있다.
		short var02 = 324;
		System.out.println(var02);
		
		//int는 4byte 크기이며 십진수 8자리까지 표현이 가능하다.
		int var03 = 1234567891;
		System.out.println(var03);
		
		/*
		long은 8byte 크기이며 십진수 16자리까지 표현이 가능하다.
		그리고 숫자 마지막에 l을 붙여주어야 한다.
		*/
		long var12 = 1234567890123456l;
		System.out.println(var12);
	}
}
