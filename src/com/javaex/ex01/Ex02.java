package com.javaex.ex01;

public class Ex02 {
	//자료형 연습
	public static void main (String[] args) {
		
		/*
		자료형-실수형 연습
		실수형은 두가지로 float 과 double이 있는데 실수형으로 소수점의 숫자를 표현할 수 있다.
		*/
		
		/*
		float 은 4byte크기이며 숫자 마지막에 f를 무조건 붙여주어야 한다.
		숫자를 쓸 때에는 제한없이 쓸 수 있지만 소수점 7자리까지만 표현되며 그 후 숫자는 반올림된다.
		*/
		float myCir1 = 3.141592659872342343453453453453453545345f;
		System.out.println(myCir1);
		
		
		/*
		double 은 8byte크기이며 숫자를 쓸 때에는 제한없이 쓸 수 있지만 소수점 15자리까지만 표현되며 그 후 숫자는 반올림된다.
		*/
		double myCir2= 3.1415926593420983455352354236357457565475674;
		System.out.println(myCir2);
		
	}
}
