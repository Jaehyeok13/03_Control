package com.jh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	Scanner sc = new Scanner(System.in);
	// while 문의 변형, 적어도 한번은 수행될 수 있는 반복문이다.
	// 차이점 while문과 do ~ while 문의 차이는 조건삭을 언제 확인하는지가 다르다.
	
	// 키보드로 영어 문자열 값을 입력 받아 출력 반복 실행 'exit' 가 나올떄 까지 반복한다.
	public void method1() {
		String st = "";
		do {
			System.out.print("문자를 입력해주세요 : ");
			st = sc.next();
			System.out.println("입력값 : " + st);
		}while(!st.equals("exit"));
		sc.close();
	}
	
	/*
	분기문 break 3가지 역할
	1. switch 문에서 switch 문을 벗어나는데 사용
	2. 반복문에서 반복루프를 벗어나는데 사용
	3. 기존 프로그램에서 사용되는 goto 문의개선된 형대로 사용된다.
	
	공통점은 break 문을 만나면 해당 반복문이 강제로 종료된다.
	모든 반복문에서 사용 가능하며 break를 포함하는 반복문 한 개만 종료시킬 수 있다.중첩 반복문일 경우 범위가 가까운 반복문 한개만 종료 시킨다.
	*/
	
	// method1 번을 break 을 사용 하여 멈추기
	public void method2() {
		String st = "";
		do {
			System.out.print("문자를 입력하세요 : ");
			st = sc.next();
			System.out.println("입력값 : " + st);
			if (st.equals("exit")) {
				break; // 조건문을 사용하여 입력값을 판단하여 반복루프를 벗어나는데 사용
			}
		} while (true); // 조건이 true 이기 때문에 무한 반복이 진행이 된다. 똑같이 'exit' 작성하면 끝내야 하는걸 추가 해줘야 한다.
	}
	
	// 숫자를 입력 받아 숫자 9을 받을 때까지 반복한다.
	public void method3() {
		int menu = 0;
		do {
			System.out.println("1. 문자열 출력(ver.do while 조건)");
			System.out.println("2. 문자열 출력(ver.do while true");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 9: System.out.println("프로그램을 종료 합니다."); break;
			default : System.out.println("잘못 입력 하셨습니다."); break;
			}
		}while(menu != 9);
	}
	
	public void method4() {
		
		do {
			System.out.println("1. 문자열 출력(ver.do while 조건");
			System.out.println("2. 문자열 출력(ver.do while true");
			System.out.println("9. 종료 ");
			System.out.print("메뉴 선택");
			int	menu = sc.nextInt();
		
		
			switch(menu) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 9 : System.out.println("종료 합니다."); return;
			default: System.out.println("잘못 입력 하셨습니다.");
			}
		}while(true);
	}
	
}
