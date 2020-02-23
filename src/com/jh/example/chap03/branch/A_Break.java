package com.jh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {

	/*
	분기문 break 3가지 역할
	1. switch 문에서 switch 문을 벗어나는데 사용
	2. 반복문에서 반복루프를 벗어나는데 사용
	3. 기존 프로그램에서 사용되는 goto 문의개선된 형대로 사용된다.
	
	공통점은 break 문을 만나면 해당 반복문이 강제로 종료된다.
	모든 반복문에서 사용 가능하며 break를 포함하는 반복문 한 개만 종료시킬 수 있다.중첩 반복문일 경우 범위가 가까운 반복문 한개만 종료 시킨다.
	*/
	Scanner sc = new Scanner(System.in);
	
	//문자열을 입력 받아서 글자 갯수를 출력 
	//end 가 입력 되면 반복 종료(do ~ while 문 사용)
	public void method1() {
		do {
			System.out.print("문자열 입력 : ");
			String st = sc.next();
			if(st.equals("end")) {
				break;
			}
			System.out.println("글자 갯수 : " + st.length());
		}while(true); // true 을 false 로 초기화 선언이 없기 때문에 계속 반복을 함
	}
	
	// 1부터 입력 한 수까지의 합 출력
	public void method2() {
		System.out.print("정수를 입력 해주세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; ; i++) {
			sum += i;
			if(i == num) {
				break;
			}
		}
		System.out.println("1부터" + num + "까지의 합은 : " + sum +"입니다.");
	}
	
}
