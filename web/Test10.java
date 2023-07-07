package kr.co.icia.web;

import java.util.Date;

public class Test10 {
	public static void main(String[] arg) {
//		자바는 기본 타입과 참조 타입
//		기본 타입은 값을 저장 : 정수 (int, long), 실수 (double), boolean
//		문자열 타입이 없으므로 자바는 String 클래스를 문자열로 사용한다.
//		String 은 new 를 사용하지 않는다.
		
//		참조 타입을 객체로 가리키고 new 를 사용하며, 크기는 4byte 이다.
		
		int a = 10;					// 기본
		double b = 3.14;			// 기본
		String c = "Hello World";	// 참조
		Date d = new Date();		// 참조
	}
}
