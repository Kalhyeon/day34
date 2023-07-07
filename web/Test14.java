package kr.co.icia.web;

// 변수의 사용 범위 : scope
// 자바의 변수는 중괄호가 열리면 만들어지고, 중괄호가 닫히면 파괴된다.
// const 와 let 을 사용할 경우 JS 의 스코프도 동일하다.
public class Test14 {
	public static void main(String[] arg) {
		int a = 10;
		{
			int b = 20;
			{
				int c = 30;
//				1. a, b, c 출력 : a, b, c
			}
//			2. a, b, c 출력 : a, b
		}
//		3. a, b, c 출력 : a
		
		if(a>5) {
			int b = 200;
		}
	}
}
