package kr.co.icia.web;

public class Test17 {
	public static void main(String[] args) {
		
	}
}

/*
 * 1. 고급 언어 : 사람이 프로그래밍하기 쉬운 언어
 *	  기계어 : CPU 가 이해하고 실행할 수 있는 이진수 언어
 *	  고급 언어는 기계어로 번역 (compile)해서 실행한다.
 * 2. 자바는 CPU 위에 가상 머신을 설치하고 가상 머신 위에서 실행된다.
 *	  따라서 자바 코드는 가상 머신만 제공되면 어디에서나 실행할 수 있다.
 * 3. 자바는 자바 실행 환경 (가상 머신, JVM)과 자바 개발 환경 (JDK)로 구성된다.
 * 	  자바 개발자는 모두 필요하다.
 * 4. 이클립스에 스프링 애드온을 설치하여 사용할 수도 있다.
 * 	  스프링 회사에서 이클립스 + 스프링을 제공하는데 그 이름이 STS 이다.
 * 	  현업에서는 STS 보다 인텔리제이를 사용하는 경우가 더 많다 (프로젝트 호환 안됨).
 * 5. 언어가 원래 처리할 수 있는 데이터의 종류를 타입이라고 한다.
 * 		JS - number		string		boolean		undefined		object
 * 	  오라클 - number		varchar2	date
 *     자바 - long/double [String]	boolean
 * 6. 자바의 변수는 크게 기본형과 참조형이 있다.
 * 		기본형은 값을 직접 저장하고 있다 (long, double, boolean)
 * 								(Long, Double, Boolean).
 * 		스택에 있는 참조형은 힙에 있는 객체를 가리키는 리모컨이다.
 * 7. 자바의 메모리는 static, stack, heap 으로 나눈다.
 * 		static : 처음부터 끝까지 (리터럴)
 * 		stack : 문법에 따라 (scope) 자바가 관리
 * 				주로 참조 변수
 * 		heap : 필요할 때 필요한 만큼 사용 (프로그래머가 관리)
 * 				객체가 사는 곳
 * 8. 참조 변수는 객체의 번호 (hashCode)를 가진다.
 * 		가리키는 참조 변수가 없는 객체를 garbage 라고 한다.
 * 		자바가 garbage 객체의 메모리를 자동으로 회수한다.
 **/
