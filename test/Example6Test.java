package test;

// 환급금 계산 
public class Example6Test {

	public static void main(String[] args) {
		Example6 student = new Example6(); // 교육생 클래스(Example6)의 객체 생성 & 인스턴스를 student에 할당
		
		student.name = args[0]; // 인스턴스의 변수값 초기화  
		student.department = args[1];
		student.className = args[2];
		student.pay = Integer.parseInt(args[3]);
		student.subPay = Integer.parseInt(args[4]);

		System.out.println(student.className);
			
	switch (student.className) {
	case "자바프로그래밍" : 
		student.payback = (int) (student.pay * 0.25 + student.subPay);
		System.out.println("이름:"+student.name + ", 소속:" + student.department + ", 과정명: " + student.className + ", 교육비: " + student.pay + " , 부가금:" + student.subPay+ ", 환급금: "+ student.payback);
		break;
	case "JDBC프로그래밍" : 
		student.payback = (int) (student.pay * 0.20 + student.subPay);
		System.out.println("이름:"+student.name + ", 소속:" + student.department + ", 과정명: " + student.className + ", 교육비: " + student.pay + " , 부가금:" + student.subPay+ ", 환급금: "+ student.payback);
		break;
	case "JSP프로그래밍" : 
		student.payback = (int) (student.pay * 0.15 + student.subPay);
		System.out.println("이름:"+student.name + ", 소속:" + student.department + ", 과정명: " + student.className + ", 교육비: " + student.pay + " , 부가금:" + student.subPay+ ", 환급금: "+ student.payback);
		break;
	default :
		System.out.println("잘못 입력되었습니다");
	}

//	if (student.className == "자바프로그래밍") {
//		student.payback = (int) (student.pay * 0.25 + student.subPay);
//		System.out.println("이름:"+student.name + ", 소속:" + student.department + ", 과정명: " + student.className + ", 교육비: " + student.pay + " , 부가금:" + student.subPay+ ", 환급금: "+ student.payback);
//	}
//	else if (student.className == "JDBC프로그래밍") {
//		student.payback = (int) (student.pay * 0.20 + student.subPay);
//		System.out.println("이름:"+student.name + ", 소속:" + student.department + ", 과정명: " + student.className + ", 교육비: " + student.pay + " , 부가금:" + student.subPay+ ", 환급금: "+ student.payback);
//
//	}
//	else if (student.className == "JSP프로그래밍") {
//		student.payback = (int) (student.pay * 0.15 + student.subPay);
//		System.out.println("이름:"+student.name + ", 소속:" + student.department + ", 과정명: " + student.className + ", 교육비: " + student.pay + " , 부가금:" + student.subPay+ ", 환급금: "+ student.payback);
//
//	}
//	else {
//		System.out.println("잘못 입력되었습니다");
//	}
//
	}
}


/*2. main(String[] args) 메서드를 포함하는 또 다른 클래스를 
작성합니다.
2-1> commanf line argument - 명령행 매개변수를 이용하여 사용자로부터
student가 참조하는 객체의 이름, 소속, 과정명, 
교육비, 부가금을 입력받습니다.

실행 : 
run-run configuration-arguments-program arguments
이자바 멀티캠퍼스 JSP프로그래밍 50000 5000

2-2> 교육생 클래스의 객체를 생성하여 student
라는 이름의 변수로 참조하도록 합니다.
이 때 2-1 입력 5개 변수를 이름, 소속, 과정명,
교육비, 부가금 변수값으로 초기화(=값 할당)합니다. */


/* 2-3>  환금급을 계산하자

- 환급금은 
 과정명이 "자바프로그래밍" 이면
 입력한 교육비의 25% + 부가금 이고,
 
 과정명이 "JDBC프로그래밍" 이면
 입력한 교육비의 20% + 부가금 이고,
 
 과정명이 "JSP프로그래밍" 이면
 입력한 교육비의 15% + 부가금 으로        
 계산하여 초기화합니다.

 그밖의 과정명은 
 "잘못 입력되었습니다"는 에러 메시지를 출력합니다.

- 올바른 과정명은 
student  변수 참조 객체 내부의 
이름, 소속, 과정명, 교육비, 부가금, 환급금을 출력합니다. */