package com.jh.example.chap01.condition;

import java.util.Scanner;

public class C_IfElesif {
	/*
	 	if-else if 문
	 	if(조건식){
	 		실행할 문장1;
	 	}else if(조건식){
	 		실행할 문장2
	 	}else{
	 		실행할 문장3
	 	}
	 	
	 	다중 조건을 줄 수 있는 조건문
	 	if 문의 조건식 결과 값이 참이면 if 안에 있는 실행문1 수행
	 	if 문의 조건식 결과 값이 거짓 이면서 else if 문의 조건식 결과 값이 참이면 else if 문 안의 실행문2 수행
	 	둘다 거짓이면 실행할 문장3 수행
	 	if 에서 참이라고 수행됐으면 그아래 문장들은 수행 되지 않음
	 	else if 문의 여러 개 일 수 있고, else 문은 없을 수도 있다.
	 	
	 */
	
	private Scanner sc = new Scanner(System.in);
	public void method1() {
		System.out.print("숫자 한개를 입력 하세요 : ");
		int i = sc.nextInt();
		
		if(i > 0) {
			System.out.println("양수");
		}else if(i < 0){
			System.out.println("음수");
		}else {
			System.out.println("입력한 숫자는 0 입니다.");
		}
		sc.close();
	}
	
	public void method2() {
		System.out.print("성별 M/F) : ");
		char sex = sc.nextLine().toUpperCase().charAt(0);
		
		if(sex == 'M') {
			System.out.println("남자 입니다.");
		}else if(sex == 'F') {
			System.out.println("여자 입니다.");
		}else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		sc.close();
	}
	
	public void method3() {
		System.out.print("나이를 입력 해주세요 : ");
		int age = sc.nextInt();
		
		if(age > 19) {
			System.out.println("성인");
		}else if(age <= 13) {
			System.out.println("어린이");
		}else {
			System.out.println("청소년");
		}
		sc.close();
	}
	
	public void method4() {
		System.out.print("주민번호 (-포함) : ");
		char ch = sc.nextLine().charAt(7);
		
		if(ch == '1' || ch == '3') {
			System.out.println("남자");
		}else if(ch == '2' || ch == '4') {
			System.out.println("여자");
		}else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		sc.close();
	}
	
	public void method5() {
		System.out.print("정수를 입력 해주세요 : ");
		int score = sc.nextInt();
		int gap = sc.nextInt();
		char ch;
		
		if(gap >= 9) {
			ch = 'A';
		}else if(gap >= 8) {
			ch = 'B';
		}else if(gap >= 7) {
			ch = 'C';
		}else if(gap >= 6) {
			ch = 'D';
		}else {
			ch = 'F';
		}
		System.out.printf("당신의 점수는 %d 점이고, 등급은 %c 입니다.", score, ch);
		sc.close();
	}
	
	public void method6() {
		System.out.print("점수를 입력 해주세요 : ");
		int i = sc.nextInt();
		String st = "";

		if (i >= 90) {
			st = "A";
			if (i >= 95) {
				st += "+";
			}
		} else if (i >= 80) {
			st = "B";
			if (i >= 85) {
				st += "+";
			}
		} else if (i >= 70) {
			st = "C";
			if (i >= 75) {
				st += "+";
			}
		} else if (i >= 60) {
			st = "D";
			if (i >= 65) {
				st += "+";
			}
		} else {
			st = "F";
		}
		System.out.println("당신의 성적은 : " + st);
		sc.close();
	}
}
