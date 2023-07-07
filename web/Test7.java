package kr.co.icia.web;

public class Test7 {
	public static void main(String[] arg) {
//		wrapper class : 기본 타입에 대한 클래스
//		int => Integer, long => Long, double => Double
		
//		자바는 객체 지향 언어의 깃발을 높이 세우고 등장
		Integer i = new Integer(11);
		System.out.println(i.intValue());
		
		int j = 11;
		System.out.println(j);
		
//		문자열을 정수로 바꾼다 => wrapper class 에 함수가 소속
		Integer.parseInt("3");
		
//		int 의 최대값
		System.out.println(Integer.MAX_VALUE);
	}
}
