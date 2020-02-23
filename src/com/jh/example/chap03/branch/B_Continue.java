package com.jh.example.chap03.branch;

public class B_Continue {
	// continue 문은 반복문 내에서만 사용 할 수 있음 continue 문은 아래의 내용을 실행 하지 않고
	// 증감식 또는 다음 값으로 건너 뛰라는 의미(중간 생략)
	
	// 1 ~ 100 까지의 정수들의 합 출력
	// 단, 4의 배수 빼고 계산
	public void method1(){
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 4 == 0) {
				continue; // 즉 원래 밑에 sum += i 작업을 해야 하지만 continue 로 인하여 증감식으로 넘어감
			}
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
	
	// 짝수 단, 짝수 수는 뺀 구구단 출력
	public void method2() {
		int sum = 0;
		
		for(int dan = 2; dan <= 9; dan++) {
			if( dan % 2 == 1) {
				continue;
			}
			System.out.println("============" + dan + "============");
			for(int su = 1; su <= 9; su++) {
				if(su % 2 == 0) {
					continue;
				}
				sum += dan * su;
				System.out.printf("%d X %d = %d\n", dan,su,sum);
			}
		}
	}
}
