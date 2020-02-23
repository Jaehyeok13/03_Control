package com.jh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {
	/*
	  switch (조건 (정수, 문자 , 문자열 3가지만 가능) )
	 	switch (변수만 적어도 가능 (ex : i < 9){
	 		case :를 찾아 실행 되면 break 가 없을 경우 계속 다음 실행문 실행이 된다.
	 		해당 값이 없을 경우 default 로 나머지 값을 지정 하여 출력 한다.
	 	}
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		System.out.print("정수1 : ");
		int i = sc.nextInt();

		System.out.print("연산자 (+,-,*,/,%) : ");
		char op = sc.next().charAt(0);

		System.out.print("정수2 : ");
		int j = sc.nextInt();

		int result = 0;
		switch (op) {
		
		case '+':
			result = i + j;
			break;
		
		case '-':
			result = i - j;
			break;
		
		case '*':
			result = i * j;
			break;
			
		case '/':
			result = i / j;
			break;
			
		case '%':
			result = i % j;
			break;
			
			default:
				System.out.println("기호를 잘 못 입력 하셨습니다.");
		}
		System.out.printf("%d %c %d = %d \n", i, op, j , result);
	}
	
	public void method2() {
		System.out.print("과일을 입력 해주세요 : ");
		String fruit = sc.next();
		
		int price = 0;
		switch (fruit) {
		case "사과":
			price = 1740;
			break;

		case "배":
			price = 2000;
			break;
			
		case "망고":
			price = 10000;
			break;
			
		case "멜론":
			price = 20000;
			break;

		case "딸기":
			price = 50000;
			break;

		default:
			System.out.print("없는 과일 입니다.");
		}
			System.out.println(fruit + "의 가격은 : " + price);
	}
	
	// 1 ~ 3 번호를 입력 하여 입력 번호의 메뉴가 실행 시키기.
	
	public void method3() {
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 수정");
		System.out.println("3. 회원 삭제");
		System.out.print("번호를 입력 하세요 : ");
		
		int menu = sc.nextInt();
		
		switch(menu){
		case 1:
			System.out.println("회원 등록 메뉴 입니다.");
			break;
		case 2:
			System.out.println("회원 수정 메뉴 입니다.");
			break;
		case 3:
			System.out.println("회원 삭제 메뉴 입니다.");
			break;
		default:
			System.out.println("잘못 입력 하셨습니다.");
		}
	}
	
	// 월을 입력 하면 해당 달의 마지막 날 출
	public void method4() {
		System.out.println("1 ~ 12 중 하나를 입력 하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"월은 31일 까지 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"월은 30일 까지 입니다.");
			break;
		case 2:
			System.out.println(month+"월은 28일 까지 입니다.");
			default :
				System.out.println("1~12 사이의 정수를 입력 해주세요.");
		}
	}
}
