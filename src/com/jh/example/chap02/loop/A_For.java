package com.jh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	private Scanner sc = new Scanner(System.in);
	/*
	 for(초기식; 조건식; 증감식)
		실행문;
	 }
	 초기식 - > 조건식 확인 -> (조건식 true 일떄) 실행문장 수행 -> 증감식 -> 조건식 확인 -> 반복
	 조건식 결과가 false 가 될때 까지 반복
	 
	 for 문 안에 있는 초기식 조건식 증감식 생략 가능
	  초기식은 무엇인지, 조건은 무엇인지, 증감은 얼마나 되는지 다 표기해야함
	  결국 for()안에서만 생력 될뿐, 모두 필요한 요소이다.
	  
	  초기식은 반복하는 카운트용 변수 선언과 동시에 카운트 초기값을 지정하는 부분으로 딱 한 번 실행된다.
	  
	  조건식은 반복할 카운트의 종료값을 제시하며 조건식이 참(true) 이면 아래의 블{} 안의 내용을 수행되며, 조건식이 거짓(false)이면 반복 종료
	  
	  증감식은 블록{} 안의 내용이 수행이 끝나면 카운트용 변수의 값(초기식) 에 증감 연산이 수행되고, 다시 앞의 조건식이 수행된다.
	  
	  수행 구조를 보면
	  초기식 -> 조건식 -> 수행코드 -> 증감식 -> 조건식 -> 수행코드 -> 증감식 의 순서로 실행되며, 증감식의 값의 증감량에 따라
	  for 문의 반복횟수를 조절가능
	*/
	
	// 간단한 1 ~ 8 까지 반복 하는 코드 
	public void method1() {
		System.out.println("==========  method1 ============");
		for(int i =0; i <= 8; i++) {
			System.out.println(i + "번째");
		}
	}
	
	// 5부터 1로 감소 하는 코드
	public void method2() {
		System.out.println("==========  method2 ============");
		for(int i = 5; i > 0; i--) {
			System.out.println(i + "번째");
		}
	}
	
	// 1부터 2씩 증가 시켜 홀수 출력 하는 코드
	public void method3() {
		System.out.println("==========  method3 ============");
		for(int i =1; i < 10; i+= 2) {
			// 2씩 증감 시킨다.
			System.out.println("홀수 : " + i);
		}
	}
	
	// 정수를 입력 받아 1 ~ 9 까지 곱하는 구구단
	public void method4() {
		System.out.println("==========  method4 ============");
		sc = new Scanner(System.in);
		System.out.print("정수 입력(1 ~ 9) : ");
		int sum = sc.nextInt();
		int multi = 0;
		
		if(sum > 0 && sum < 10) {
			for(int i = 1; i < 10; i++) {
				multi = i * sum;
				System.out.printf("%d * %d = %d\t",sum, i , multi);
			}
			System.out.println();
		}else {
			System.out.println("1 ~ 9 사이의 정수를 입력해야지");
		}
	}
	
	// 랜덤 숫자 난수를 발생시켜 1 ~ 랜덤 까지 구해 조건식 까지의 모든 숫자 합한값 구하는 코드
	public void method5() {
		System.out.println("==========  method5 ============");
		// 랜덤은 난수 이기 때문에 완료후 형 변환 시켜줌
		int random = (int)(Math.random() * 10 + 1);
		
	// int random = (int)math.random();   똑같은 거 처럼 보이나 윗 코드는 객체로 선언함
		/*
		  0 이상 1미만 실수 선언됨 이것을 정수로 형변환 하기 위해서
		  (int)(math.random() * 10) -> 해석 하자면 난수에서 * 10 을 곱해서 정수로 만든다. 즉 0.1 ~ 0.9 를 1.0 ~ 9.0 으로 만들고
		  int 로 형 변환 시켜 정수로 만드는 코드 +1은 10 까지 만들기 위함
		 */
		int sum = 0;
		for(int i = 1; i < random; i++) {
			sum+= i;
		}
		System.out.printf("1부터 %d 정수 합계 : %d", random, sum);
		System.out.println();
	}
	
	//  두 정수를 입력하여 쵀다 값과 최소값을 구하고 그사이의 값을 다 구하는 코드
	public void method6() {
		System.out.println("==========  method6 ============");
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		// 여기서 최대값과 최소값을 구하기 위해 삼항 연산자를 이용 할 것이다.
		// 02_Operation G_triple 에서 연습함 모르면 참고
		int max = (num1 > num2) ? num1 : num2; // num1 과 num2 를 비교하여 둘중 에서 큰숫자가 최대값이 된다.
		int min = (num1 < num2) ? num1 : num2;
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.printf("%d 에서 %d 까지 총 합은 : %d  ", num1, num2 ,sum);
		System.out.println();
	}
	
	// 중첩 for 문 : for 문 실행문 안에 for 문 사용 가능 
	public void method7() {
		int multi = 0;
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				multi = i * j;
				System.out.printf("%d * %d = %d  ", i , j , multi);
			}
			System.out.println();
			// 중첩 for 문 사용시 주의 실행문1 , 실행문2 가 있을경우 실행문2가 다 끝나고 다시 실행문1이 다음 증감식 진행후 조건식 진행한다.
		}
	}
	
	// 아날로그 시계 24시간 중첩 for 문 사용으로 시간과 분 을 구하는 코드
	public void method8() {
		for(int hour = 0; hour < 24; hour ++) {
			for(int m = 0; m < 60; m++) {
				System.out.printf("%2d 시 %2d 분 \n", hour, m);
			}
		}
	}
	
	// 흔한 5칸 짜리 별을 몇줄 까지 만들 것인지 하는 코드
	public void method9() {
		System.out.print("출력 할 줄 수 : ");
		int row = sc.nextInt();
		for(int i = 0; i < row; i++) {
			for(int j = 0; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 9번을 활용 해서 줄수와 칸수 와 줄에 맞는 숫자를 출력 하는 코드x
	public void method10() {
		System.out.print("출력 할 줄 수 : ");
		int row = sc.nextInt();
		
		System.out.print("출력 할  수 : ");
		int hang = sc.nextInt();
		int su = 0;
		for(int i =0; i < row; i++) {
			for(int j = 0; j <= hang; j++) {
				if(i == j) {
					su += 1;
					System.out.print(su);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
