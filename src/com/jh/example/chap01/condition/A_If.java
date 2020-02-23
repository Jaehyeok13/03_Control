package com.jh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
	// 조건식의 내용이 true 일 때만 실행.
	
	/*
	 	단독 if 문
	 	if (조건식){
	 		실행할 문장;
	 	}
	 	조건식의 결과 값이 참(true) 이면 { } 안에 있는 코드 수행
	 	조건식의 결과 값이 거짓 (false) 이면 { } 안에 있는 코드는 무시하고 넘어감. 
	 	else 이 있을 경우 else{ } 를 실행 한다. else 은 if( ) 조건이 아닐때 그안에 메소드를 실행 시키는 것
	 	
	 	프로그램 수행 흐름을 바꾸는 역할을 하는 제어문 중 하나로 조건에 따라 다른 문장이 수행되도록 함
	 	
	 	if는 true, false와 상관 없이 조건절 실행, if ~else if ~else 는 조건문이 true 면 이후 조건은 실행 하지 않음
	 	
	 	ex) if(num == 1){
	 			true 일떄만 실행후
	 		}
	 		이 밑의 조건도 실행
	 		
	 		but if(num == 1){
	 			true 이부분이 실행이 되면 else if 문은 실행 안함
	 		}else if(num == 2){
	 		
	 		}
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		System.out.print("정수 입력 : ");
		int iNum = Integer.parseInt(sc.next());
		
		if(iNum > 0) {
			System.out.println("양수다.");
		}
		sc.close();
	}
	
	public void method2() {
		System.out.print("정수 입력 : ");
		int iNum = Integer.parseInt(sc.next());
		
		if(iNum > 0) {
			System.out.println("입력한 숫자는 양수 입니다.");
		}
		if(iNum < 0){
			System.out.println("입력한 숫자는 음수 입니다.");
		}
		if(iNum == 0){
			System.out.println("입력한 숫자는 0 입니다.");
		}
//			
//		if(iNum > 0) {
//			System.out.println("입력한 숫자는 양수 입니다.");
//		}else if(iNum < 0){
//			System.out.println("입력한 숫자는 음수 입니다.");
//		}else if(iNum == 0){
//			System.out.println("입력한 숫자는 0 입니다.");
//		}else {
//			System.out.println("정수를 입력 해주세요.");
//		}
	
		System.out.println("프로그램을 종료 합니다.");
		sc.close();
	}
	
	public void method3() {
		System.out.println("숫자 한 개 입력하세요 : ");
		
		int iNum = Integer.parseInt(sc.next());
		
		if(iNum % 2 == 0) {
			System.out.println("입력한 숫자는 짝수 입니다.");
		}
		if(iNum % 2 != 0){
			System.out.println("입력한 숫자는 홀수 입니다.");
		}
		
//		if(iNum % 2 == 0) {
//			System.out.println("입력한 숫자는 짝수 입니다.");
//		}else {
//			System.out.println("입력한 숫자는 홀수 입니다.");
//		}
		// Tip : 조건이 딱 두개로만 결정 될때는 굳이 else if 를 사용 할 필요 없이 else 로 끝내면 된다.
		sc.close();
	}
	
	public void method4() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년 (숫자만) : ");
		int grad = Integer.parseInt(sc.next());
		
		System.out.print("반 (숫자만) : ");
		int class1 = Integer.parseInt(sc.next());
		
		System.out.print("번호 (숫자만) : " );
		int num = Integer.parseInt(sc.next());
		
		System.out.print("성별 (M/F) : "); 
		char ch = sc.next().toUpperCase().charAt(0);
		// toUpperCase() 메소드는 입력한 영어 값을 다 대문자로 인식 하겠다.
		// toLowerCase() 메소드는 입력한 영어 값을 다 소문자로 인식 하겠다.
		
		
		System.out.print("성적(소수점 아래 두번째 자리 까지) : ");
		double score = sc.nextDouble();
		
//		String student = "" or student = null  초기화 가능
		String student = null;
		
		if(ch == 'M') {
			student = "남학생";
		}else if(ch == 'F') {
			student = "여학생";
		}else {
			student = "혼종";
		}
		System.out.printf("%d학년 %d반 %d번 %s%s 의 성적은 %.2f 입니다.  ", grad, class1, num, name, student, score );
		sc.close();
	}
	
	public void method5() {
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.next());
		String str = "";
		if(age > 19) {
			str = "성인";
		}else if(age <= 13) {
			str = "어린";
		}else {
			str = "청소년";
		}
		System.out.println(str);
		sc.close();
	}
	
	public void method6() {
		System.out.print("국어 : ");
		int kor = Integer.parseInt(sc.next());
		
		System.out.print("영어 : ");
		int eng = Integer.parseInt(sc.next());
		
		System.out.print("수학 : ");
		int math = Integer.parseInt(sc.next());
		
		int total = kor + eng + math;
		double avg = total / 3;
		
		if(kor >= 40 && eng >= 40 && math >= 40 ) {
			System.out.printf("합격 총 점수 : %d 평균 점수 : %.2f ", total, avg);
		}else {
			System.out.println("그냥 과락이지");
		}
	}
	
	public void method7() {
		System.out.print("주민 번호를 입력 하세요 (- 포함) : ");
		char ch = sc.nextLine().charAt(7);
		String st = "";
		if(ch == '1' || ch == '3') {
			st = "남자";
		}else if (ch == '2' || ch == '4') {
			st = "여자";
		}else {
			st = "잘못 입력 하셨습니다.";
		}
		System.out.println(st);
	}
	
	public void method8() {
		System.out.print("정수1 : ");
		int num1 = Integer.parseInt(sc.next());
		
		System.out.print("정수2 : ");
		int num2 = Integer.parseInt(sc.next());
		
		System.out.print("입력 : ");
		int num3 = Integer.parseInt(sc.next());
		
		// 정수1 보다 아야 하고 정수2 보다는 커야 하는 값 출력
		if(num3 < num1 || num3 > num2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
	
	public void method9() {
		System.out.print("정수1 : ");
		int num1 = Integer.parseInt(sc.next());
		
		System.out.print("정수2 : ");
		int num2 = Integer.parseInt(sc.next());
		
		System.out.print("정수3 : ");
		int num3 = Integer.parseInt(sc.next());
		
		if(num1 == num2 && num2 == num3) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	public void method10() {
		System.out.print("A사원의 연봉 : ");
		int a = Integer.parseInt(sc.next());
		
		System.out.print("B사원의 연봉 : ");
		int b = Integer.parseInt(sc.next());
		
		System.out.print("C사원의 연봉 : ");
		int c = Integer.parseInt(sc.next());
		
		double incA = a + a * 1.4;
		double incB = b + b * 0;
		double incC = c + c * 1.15;
		String st1 = "3천 이상";
		String st2 = "3천 이하";
		
		if(incA >= 3000) {
			System.out.println("A 사원 " + st1);
		}else {
			System.out.println("A 사원 " + st2);
		}
		if(incB >= 3000) {
			System.out.println("B 사원 " + st1);
		}else {
			System.out.println("B 사원 " + st2);
		}
		if(incC >= 3000) {
			System.out.println("C 사원 " + st1);
		}else {
			System.out.println("C 사원 " + st2);
		}
		
	}
	
	public void method11() {
		// 문자열 비교하기
		// 이름 넣어서 본인인지 확인
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		String check = "서재혁";
		
		// 여기서 등위 기호 == 사용 하지 않는 이유는 String 의 == 기호는 우리가 원하는 문자 값을 비교 하는 것이 아닌
		// 데이터가 저장된 메모리를 가지고 비교를 하기 때문에 참, 거짓으로 출력이 된다.
		// 이것은 String 이 기본자료형, 참조 자료형 인지에서 차이가 나는 부분이다. 
		// 우리가 원하는 문자값을 원할 때는 equals 메소드를 사용 한다. equlasIgnoreCase() 메소드는 영어의 대소문자 구별 X
		
		if(name.equals(check)) {
			System.out.println("본입 입니다.");
		}else {
			System.out.println("본인이 아닙니다.");
		}
		
	}
	
}
