package kr.co.icia.web;

public class Test6 {
	public static void main(String[] arg) {
//		같은 타입을 연산하면 결과도 같은 타입
		int x = 10, y = 20;
		System.out.println(x+y);
		
//		다른 타입을 연산하면 결과는 표현 범위가 넓은 타입
		double z = 3;
		System.out.println(x+z);
		
//		표현 범위가 넓은 쪽으로의 변화는 자바가 자동으로 처리
//		=> 100% 안전
		double zz = x + y;
		
//		표현 범위가 좁은 쪽으로의 변화는 프로그래머의 책임
		double i = 3.5;
		double j = 4.2;
		int k = (int)(i+j);
	}
}
