package kr.co.icia.web;

public class Test3 {
	public static void main(String[] arg) {
//		정수 : 일정한 범위 (표현 범위)의 값을 정확하게 저장한다.
//		int 는 약 -21억~+21억
		int a = 2000000000;
		int b = 1500000000;
		System.out.println(a+b);
		
//		기초 : a+b 는 21억보다 크기 때문에 잘못된 값이 나온다.
//		중급 : 왜 음수가 나오는 지 (2의 보수) 안다.
//		고급 : 계산할 수 있다.
	}
}
