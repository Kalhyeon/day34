package kr.co.icia.web;

import java.time.LocalDate;

public class Test19 {
	public static void main(String[] args) {
//		연산자 : 증감 연산자
//		++, -- 는 값을 증가, 감소시킨다.
		int x = 10;
		int y = 10;
		
//		증감 연산은 변수 앞 (전위, prefix), 뒤 (후위, postfix) 모두 올 수 있다.
		++x;
		y++;
		System.out.println(x);
		System.out.println(y);
		
//		다른 연산과 함께 사용하면 이야기는 달라진다.
//		전위는 증감부터 한다.
//		후위는 증감을 나중에 한다.
		System.out.println(++x);	// 12, x 는 12
		System.out.println(y++);	// 11, y 는 12
		
		int z1 = ++x;
		int z2 = y--;
		
//		z1 : 13, z2 : y
	}

}
