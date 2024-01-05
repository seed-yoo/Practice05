package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

//		Member Jung = new Member("jws", "정우성", 50000);
//		Member Yoo = new Member("yjs", "유재석", 30000);
//		Member Lee = new Member("lhr", "이효리", 40000);
		
		Member Jung = new Member();
		Member Yoo = new Member();
		Member Lee = new Member();
		
		Jung.setId("jws");
		Jung.setName("정우성");
		Jung.setPoint(50000);
		
		Yoo.setId("yjs");
		Yoo.setName("유재석");
		Yoo.setPoint(30000);
		
		Lee.setId("lhr");
		Lee.setName("이효리");
		Lee.setPoint(40000);
		
		
		Jung.showInfo();
		Yoo.showInfo();
		Lee.showInfo();
	}

}
