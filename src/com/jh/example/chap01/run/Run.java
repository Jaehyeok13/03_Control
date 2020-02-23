package com.jh.example.chap01.run;

import com.jh.example.chap01.condition.A_If;
import com.jh.example.chap01.condition.B_IfElse;
import com.jh.example.chap01.condition.C_IfElesif;
import com.jh.example.chap01.condition.D_Switch;

public class Run {

	public static void main(String[] args) {
		//  제어문 
		/*
		 	프로그램의 실행 흐름을 제어하는 문장, 프로그램의 실행 흐름은 메소드 브록{} 안에서 작성한 순서대로 실행된다. 
		 	개발자가 원하는 방향으로실행의 흐름을 바꾸는 것이 제어문 이다.
		 	제어문은	if, if~else , if ~else if else , switch 조건문 / loop (for, while, do~while) 반복문 
		 	
		 	  조건문 : 조건식을 데시하고 조건식의 결과에 따라 다음 코드의 수행 여부를 결정하는 문장 
		 	  		 조건문은 true or false 의 결과가 나오게 작성 해야 한다.
		 	  
		 	  반복문 : 문장들을 반복해서 여러 번 수행되게 할 떄 사용하는 구문이다. 구문 상에 반복되는 구간을 루프 loop 라고 하며,
		 	  		  루프가 있는 문장이라고 하여 루프(loop) 문이라고도 한다.
		 	  		  
		 */
		A_If ai = new A_If();
//		ai.method4();
//		ai.method5();
//		ai.method6();
//		ai.method7();
//		ai.method8();
//		ai.method9();
//		ai.method10();
		
		B_IfElse bif = new B_IfElse();
//		bif.method1();
//		bif.method2();
//		bif.method3();
//		bif.method4();
//		bif.method5();
//		bif.method6();
//		bif.method7();
//		bif.method8();
//		bif.method9();
//		bif.method10();
		bif.method11();
		
		C_IfElesif cif = new C_IfElesif();
//		cif.method1();
//		cif.method2();
//		cif.method3();
//		cif.method4();
//		cif.method5();
		cif.method6();
		
		D_Switch ds = new D_Switch();
		ds.method1();
		ds.method2();
		ds.method3();
		ds.method4();
	}


}
