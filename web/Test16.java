package kr.co.icia.web;

import java.util.Date;

public class Test16 {
	public static void main(String[] args) throws InterruptedException {
//		참조 변수는 해시코드 (객체 번호)를 가진다.
		Date d = new Date();
		System.out.println(d.hashCode());
		
		Thread.sleep(2000);
		
		d = new Date();
		System.out.println(d.hashCode());
		
		Thread.sleep(3000);
		
		d = new Date();
		System.out.println(d.hashCode());
		
	}
}
