package kr.co.icia.web;

import java.util.Date;

// 메모리를 static, stack, heap 영역으로 나누는 이유
public class Test15 {
	public static void main(String[] arg) {
//		static 영역은 상수 영역 : 프로그램을 실행하면 만들어져
//							 종료할 때 까지 유지
		
//		stack 은 변수 영역 : 중괄호를 열면 만들고 닫으면 파괴
//						 (문법에 따라 생성/파괴)
		
//		heap 은 객체 영역 : 필요할 때 만들고 필요 없어지면 회수
//						힙은 이름이 없다.
//						스택에 참조 변수를 만들어 그 이름으로 간접 제어한다.
		Date d = new Date();
		
	}
}
