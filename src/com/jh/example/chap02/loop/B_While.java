package com.jh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 while(조건식){
	 	실행문장;
	 	[분기문 or 증감]
   	 	이안에 조건을 벗어나게 할 연산(증감식, 분기문) 필요
	 } 
	 조건식 확인 -> (조건식이 true 일 경우 실행 문장 수행 -> 조건식 확인 -> 반복
	 조건식 결과 false 가 될 때 까지 반복 특정 
	 끝나는 명령을 받기 전까지 무한이 반복 된다는 점이 for 문과 차이가 있다.
	 */
	
	// 1 부터 5까지 출력하는 while 문
	public void method1() {
		System.out.println("======= method1 =======");
		int i = 1;
		// for 문 처럼 조건을 증감식으로 처리 가능하다.
		while(i <= 5) {
			System.out.println(i + "번째 반복문 수행");
			i++;
		}
	}
	
	// 1번과 반대로 5부터 1까지 감소하는 while문
	public void method2() {
		System.out.println("======= method2 =======");
		int i = 5;
		while(i > 0) {
			System.out.println(i + "번째 반복문 수행");
			i--;
		}
	}
	
	// 1부터 10 까지 2씩 증가 시키는 while 문(홀수 출력)
	public void method3() {
		System.out.println("======= method3 =======");
		int i = 1;
		while(i > 10) {
			System.out.println(i + "번째 반복문 수행");
			i += 2;
		}
	}
	
	// 정수를 1개를 입력 받아 입력 받은 숫자부터 10까지 1씩 증가시켜 누적값 구하는 while 문
	public void method4() {
		System.out.println("======= method4 =======");
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9 까지의 정수를 입력 해주세요 : ");
		int i = Integer.parseInt(sc.next());
		int multi = 0;

		if (i > 0 && i < 10) {
			while (i > 0 && i < 10) {
				multi += i;
				System.out.printf("%d + %d = %d\n", i,i,multi);
				i++;
			}
		}
		sc.close();
	}
	
	// 0부터 랜덤 숫자까지의 합을 구하는 while 문
	public void method5() {
		System.out.println("======= method5 =======");
		int rd = (int) (Math.random() * 10 + 1);
		int i = 0;
		int sum = 0;
		while (i < rd) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 %d 까지의 합계 : %d\n", rd,sum);
	}
	
	// 문자를 입력 받아 한글자씩 나눠 출력 하는 while 문
	public void method6() {
		System.out.println("======= method6 =======");
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력 허세요 : ");
		String str = sc.next();
		
		int index = 0;
		char ch; 
		while(index < str.length()) {
			ch = str.charAt(index);
			
			index += 1;
			System.out.println(index + " : " + ch);
		}
		sc.close();
	}
	
	// 구구단을 구하는 while 문
	public void method7() {
		System.out.println("======= method7 =======");

		int dan = 2;
		int num = 1;
		int multi = 0;
		while(dan < 10) {
			while(num < 10) {
				multi = dan * num;
				System.out.printf("%d X %d = %d\n", dan,num,multi);
				num++;
			}
			System.out.println();
			dan++;
			num = 1;
		}
	}
	
	// 아날로그 시계 24시간 구하기
	public void method8() {
		System.out.println("======= method8 =======");

		int hour = 0;
		int min = 1;
		while(hour < 24) {
			while(min < 60) {
				System.out.printf("%2d 시 %2d분\n", hour,min);
				min++;
			}
			System.out.println();
			hour++;
			min = 1;
		}
	}
	
	// 정수 2개를 받아서 최소값과 최대값을 구한구 두 수만큼의 숫자 누적하는 while 문
	public void method9() {
		System.out.println("======= method8 =======");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int i = Integer.parseInt(sc.next());
		
		System.out.print("두 번째 정수 : ");
		int j = Integer.parseInt(sc.next());
		
		int max = (i > j) ? i : j;
		int min = (i < j) ? i : j;
		int sum = 0;
		
		while(min <= max) {
			sum += min;
			min++;
			
		}
		// 이출력 부분을 min 으로 하고 싶을 경우 변수 하나를 만들어서 증감식을 다른 변수로 만들어서 해주면 된다.
		System.out.println(i + "부터" + j + "까지 수를 더한 값은 : " + sum);
		
		sc.close();
	}
	
	// 별자리 5개를 몇줄까지 반복할지 하는 while 문
	public void method10(){
		Scanner sc = new Scanner(System.in);
		System.out.print("출력 할 줄 수(정수 0 ~ 보다 크게) : ");
		int row = Integer.parseInt(sc.next());
		int column = 0;
		int i = 0;
	
		if(row != 0 && row >0) {
			while(i < row) {
//				System.out.println("*****");
				// * 5개로 만드는 while 문으로 변경
				while(column <= 5) {
					System.out.print("*");
					column++;
				}
				System.out.println();
				column = 0;
				i++;
			}
		}else {
			System.out.println("정수가 아닙니다.");
		}
		sc.close();
	}
	
	
	
	
	
	
	
	
}
