package kr.co.icia.web;

// JS 의 경우 함수를 단독으로 작성할 수 있다.
// function print() {console.log('까꿍');}

// 자바의 함수는 반드시 클래스 소속 (method)이다.
// 자바에서 함수는 곧 메서드이다.

// jQuery 에서 프로그램의 시작 : $(document).ready();
// 자바에서 프로그램의 시작 (entry point, 진입점) : main

// JS - 타입을 JS 가 판단 => let a; => 판단 근거가 없음
// => undefined => 타입을 정하지 못하겠음

// 자바 - 타입을 강하게 체크 => 자바에서 타입 생략은 불가능

public class Test1 {
	public static void main(String[] arg) {
		long value = 10;
		long result = value * 10;
		System.out.println(result);
	}
}
