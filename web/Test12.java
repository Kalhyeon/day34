package kr.co.icia.web;

public class Test12 {
	public static void main(String[] arg) {
//		1. byte short int long
//		2. 정수는 일정 범위의 값을 정확하게 저장한다.
//		3. 결론 : long 을 쓰자
		
		long x = 1111;
		long y = 23456;
		System.out.println(x+y);
		
//		long 의 최대값
		System.out.println(Long.MAX_VALUE);
	}
}