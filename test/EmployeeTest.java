package ch6;

public class EmployeeTest {

	public static void main(String[] args) {

		// 1. 회사원 4개 특성 파악  2. 클래스 정의
		// 3. 객체 생성
		Employee e1 = new Employee(); // Employee의 복사본 만들기(메모리에 생성할 것이 있다는 것.메모리에 생성된 모든 것은 변수명이 있어야 ) 
		e1.id = 1000;
		e1.name = "김사원";
		e1.dept = "IT";
		e1.pay = 123456.00;
		
		System.out.println("사번 =" + e1.id + ", 이름 =" + e1.name + ", 부서 =" + e1.dept + ", 급여 =" + e1.pay);

		Employee e2 = new Employee(); // Employee의 복사본 만들기(메모리에 생성할 것이 있다는 것.메모리에 생성된 모든 것은 변수명이 있어야 ) 
		e2.id = 2000;
		e2.name = "박대리";
		e2.dept = "교육부";
		e2.pay = 234560.00;
		
		System.out.println("사번 =" + e2.id + ", 이름 =" + e2.name + ", 부서 =" + e2.dept + ", 급여 =" + e2.pay);
		
	
	}

}
