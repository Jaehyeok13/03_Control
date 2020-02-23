package com.jh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	/*
	 	if ~else{
	 		if(조건식){
	 			실행할 문자 1;
	 		}else{
	 			실행할 문자2;
	 	}
	 	
	 둘중 한개를 선택해서 실행하는 조건
	 
	 조건식의 결과 값이 true 참 이면 if 안에 있는 실행문 1 이 실행
	 조건식의 결과 값이 false 거짓 이면 else 안에 있는 실행문 2 가 실행
	 
	 일반적으로 true / false 의 결과를 만드는 관계연산자와 논리연산자가 주로 사용된다.
	 
	 else : 제시된 조건식의 결과가 false 일 떄를 의미하는 단어로 표현한다.
	 
	 */
	private Scanner sc = new Scanner(System.in);
	public void method1() {
		System.out.print("숫자를 한개 입력 하세요 : ");
		int num = Integer.parseInt(sc.next());
		
		if(num > 0 ) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}
		if(num == 0) {
			System.out.println("입력 한 숫자는 0 입니다.");
		}
		sc.close();
	}
	
	public void method2() {
		System.out.print("숫자를 하나 입력 하세요 : ");
		int num = Integer.parseInt(sc.next());
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		sc.close();
	}
	
	public void method3() {
		System.out.print("성별 (M/F) : ");
		char sex = sc.next().toUpperCase().charAt(0);
		String gender = "";
		
		if(sex == 'M') {
			gender = "남자";
		}else {
			gender = "여자";
		}
		if(sex != 'M' && sex != 'F') {
			System.out.println("잘못 입력 하셨습니다.");
		}else {
			System.out.println(gender);
		}
		sc.close();
	}
	
	public void method4() {
		System.out.println("나이를 입력 하세요 : ");
		int age = Integer.parseInt(sc.next());
		
		String str = "";
		
		if(age > 19) {
			str = "성인";
		}else if(age <= 13) {
			str = "어린이";
		}else {
			str = "청소년";
		}
		System.out.println(str);
		sc.close();
	}
	
	public void method5() {
		int kor = 40;
		int math = 100;
		int eng = 90;
		
		double avg = (kor + math + eng) / 3;
		String str = "";
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			str = "합격";
		}else {
			str = "불합격";
		}
		System.out.println(str);
		sc.close();
	}
	
	public void method6() {
		System.out.print("주민번호 (-포함) : ");
		char resident = sc.nextLine().charAt(7);
		String gender = "";
		if(resident == '1' || resident == '3') {
			gender = "남자";
		}else {
			gender = "여자";
		}
		if((resident != '1' && resident != '3') && (resident != '2' && resident != '4')) {
			System.out.println("잘못 입력 하셨습니다.");
		}else {
			System.out.println(gender);
		}
		sc.close();
	}
	
	public void method7() {
		System.out.print("정수 : ");
		int first = Integer.parseInt(sc.next());
		
		System.out.print("정수2 : ");
		int second = Integer.parseInt(sc.next());
		
		System.out.print("입력 : ");
		int third = Integer.parseInt(sc.next());
		
		boolean key = third <= first && third > second;
		if(key) {
			System.out.println(key);
		}else {
			System.out.println(key);
		}
		sc.close();
	}
	
	public void method8() {
		System.out.print("입력1 : ");
		int first = Integer.parseInt(sc.next());
		
		System.out.print("입력2 : ");
		int second = Integer.parseInt(sc.next());
		
		System.out.print("입력3 : ");
		int third = Integer.parseInt(sc.next());
		
		boolean key = first == third && second == third;
		if(key) {
			System.out.println("세 수는 같은 값인가? : " + key);
		}else {
			System.out.println("세 수는 같은 값인가? : " + key);
		}
		sc.close();
	}
	
	public void method9() {
		sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int a = Integer.parseInt(sc.next());
		
		System.out.print("B사원의 연봉 : ");
		int b = Integer.parseInt(sc.next());
		
		System.out.print("C사원의 연봉 : ");
		int c = Integer.parseInt(sc.next());
		
		double resultA = a * 1.4;
		double resultB = b; 
		double resultC = c * 1.15;
		String st1 = "3천 이상";
		String st2 = "3천 미만";
		
		if(resultA >= 3000) {
			System.out.printf("A 사원 연봉/연봉+a : %d/%f %s \n", a,resultA,st1);
		}else {
			System.out.printf("A 사원 연봉/연봉+a : %d/%f %s \n", a,resultA,st2);
		}
		if(resultB >= 3000) {
			System.out.printf("B 사원 연봉/연봉+a : %d/%f %s \n", b,resultB,st1);
		}else {
			System.out.printf("B 사원 연봉/연봉+a : %d/%f %s \n", b,resultB,st2);
		}
		if(resultC >= 3000) {
			System.out.printf("C 사원 연봉/연봉+a : %d/%f %s \n", c,resultC,st1);
		}else {
			System.out.printf("C 사원 연봉/연봉+a : %d/%f %s \n", c,resultC,st2);
		}
		sc.close();
	}
	
	public void method10() {
		System.out.print("이름을 입력 하세요 : ");
		String name = "서재혁";
		String myname = sc.next();
		
		if(name.equals(myname)) {
			System.out.println("동일 인물입니다.");
		}else {
			System.out.println("동일 인물이 아닙니다.");
		}
		sc.close();
	}
	
	public void method11() {
		System.out.print("정수1 : ");
		int first = sc.nextInt();
		
		System.out.print("정수2 : ");
		int second = sc.nextInt();
		
		boolean key = (first <= 100 && first > 0) && (second <= 100 && second > 0);
		if(key) {
			System.out.printf("두수의 합은 : %d 이고 정수1 : %d 정수2 : %d 입니다.\n", (first + second), first, second);
		}else {
			System.out.println("둘중 하나가 100 초과 했거나 1 미만의 숫자이다.");
		}
		sc.close();
	}
}
