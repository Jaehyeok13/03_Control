package com.jh.example.chap02.run;

import com.jh.example.chap02.loop.A_For;
import com.jh.example.chap02.loop.B_While;
import com.jh.example.chap02.loop.C_DoWhile;

public class Run {

	public static void main(String[] args) {
		/*
		 반복문(loop) 문장들을 반복해서 여러 번 수행되게 할 떄 사용하는 구문이다. 구문 상에 반복되는 구간을 루프(loop)라고 하며,
		 루프가 있는 문장이라고 하여 루(loop) 문이라고도 한다.
		 */
		
		/*
		 for 문
		 가장 많이 사용되는 반복문으로 정확한 반복 횟수가 정해져 있을때 주로 사용한다.(규칙적인 거실행시)
		 배열이나 컬렉션의 연속 데이터 처리에 주로 사용된다.
		 for 문은 초기식, 조건식, 증감식으로 구성 되며, 조건식이 true 일 동안 반복되는 구조이다. 자세한 사항은 
		 A_For 클래스에 있다.
		 */
//		A_For af = new A_For();
//		af.method1();
//		af.method2(); 
//		af.method3();
//		af.method4();
//		af.method5();
//		af.method6();
//		af.method7();
//		af.method8();
//		af.method9();
//		af.method10();
		
		/*
		 while 문
		 프로그램 수행 흐름을 바꾸는 역할을 하는 제어문 중 하나로 특정 문장들을 반복해서 수행하도록 함
		 횟수가 정해지지 않은 반복 처리에 주로 사용된다.
		 while(조건식){
		 	조건식이 참(true)일 경우 실행되는 문장
		 	자세한 사항은 
		 	B_while 클래스에 있다.
		 }
		 */
//		B_While bw = new B_While();
//		bw.method1();
//		bw.method2();
//		bw.method3();
//		bw.method4();
//		bw.method5();
//		bw.method6();
//		bw.method7();
//		bw.method8();
//		bw.method9();
//		bw.method10();
	
	/*
	 	do ~ while
	 	do {
	 		안의 내용을 일단 한번 실행한 다음, 아래에 있는 while 조건식의 결과에 따라 블록 {} 안의 내용에 대한 반복 실행을 
	 		결정하는 반복문이다.
	 		// 반복 조건이 참일 때 수향되는 문장들
	 		자세한 설명은
	 		C_DoWhile 클래스에 있다.
	 	}while(조건식);
	 	
	 	분기문 : 프로그램 제어를 이동시키기 위해 break, continue, return 문이 있다.
	 	자세한 사항도 클래스 안에 설명함
	 */
		C_DoWhile cd = new C_DoWhile();
//		cd.method1();
//		cd.method2();
		cd.method3();
	}	
}
