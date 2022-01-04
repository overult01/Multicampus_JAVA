package test;
// 상속, 오버라이딩, 객체 형변환 ,생성자, super활용 실
/*
각 직종의 회사원들의 급여를 계산하시오.
(객체 형변환, 생성자 super 특징)
*/

class Employee {
	int id = 0;
	String name = "";
	int pay = 0; // 본봉
	int extraPay = 0; //일반수당 
	int totalPay = 0;
	
	// 생성자 정의. 매개변수 4개 값을 멤버변수 값으로 초기화. 
	Employee(int id, String name, int pay, int extraPay) {
		this.id = id;
		this.name = name;
		this.pay = pay;
		this.extraPay = extraPay;
	}
	
	void calculatePay() {
		totalPay = pay + extraPay;
	}
}

//회사원(Employee class){
// 	- 멤버변수=필드변수 선언
// 	   사번 이름 본봉 일반수당 총급여
// 	- 생성자 정의(main 참고)
// 	new Employee(1000,"이사원",10000,5000);
// 	(총급여 제외한) 
//        매개변수 4개의 값을 멤버변수 값으로  초기화.
// 
// 	- 급여 계산메서드():          
// 	   총급여 = 본봉 + 일반수당 
//}

class Manager extends Employee{
	int managerPay; // 간부수당 

	Manager(int id, String name, int pay, int extraPay, int managerPay) {
		super(managerPay, name, managerPay, managerPay);  //super () 재공부 필요. 이해가 안된다.
		this.id = id; // super 와 this 부분 
		this.name = name;
		this.pay = pay;
		this.extraPay = extraPay;
		this.managerPay = managerPay;
	}

	@Override
	void calculatePay() {
		totalPay = pay + extraPay + managerPay;
	}
		
}

//간부직(Manager class) : 상속
//	- 변수 선언(자동포함 제외 , 추가 변수 선언)
// 	    사번 이름 본봉 일반수당 총급여   간부수당
//	- 생성자 정의
// 	Manager(2000,"김간부",20000,10000,10000);
//        (Manager 생성자 내부 첫문장 super() ; 정의
//         Employee() 생성자 호출)
//
//
//- 급여 계산메서드()
// 	   총급여 = 본봉 + 일반수당+간부수당  
// }
class Engineer extends Employee{
	int qualificationPay;
	int engineeringPay;
	
	// 생성자 정의 
	Engineer(int id, String name, int pay, int extraPay, int qualificationPay, 	int engineeringPay) {
		super(id, name, pay, extraPay);
		this.id = id;
		this.name = name;
		this.pay = pay;
		this.extraPay = extraPay;
		this.qualificationPay = qualificationPay;
		this.engineeringPay = engineeringPay;
	}

	@Override
	void calculatePay() {
		totalPay = pay + extraPay + qualificationPay + engineeringPay ;
	}		

}
//기술직(Engineer class):상속 
// - 변수 선언
// 	   이름 사번 본봉 일반수당 총급여
// 	 자격수당 기술수당 
// 	- 생성자 정의:main
// 	
// - 급여 계산메서드()
// 	   총급여 = 본봉 + 일반수당+자격수당+기술수당 	

class Secretary extends Employee{

	int secretaryPay;
	
	Secretary(int id, String name, int pay, int extraPay, int secretaryPay) {
		super(id, name, pay, extraPay);
	}

	@Override
	void calculatePay() {
		totalPay = pay + extraPay + secretaryPay ;
	}

}

//		
//비서직(Secretary class) :상속
//	- 변수 선언
// 	   이름 사번 본봉 일반수당 총급여
//	  비서수당 
//	- 생성자 정의
// 	
//	- 급여 계산메서드()
// 	   총급여 = 본봉 + 일반수당+비서수당  
// */

public class SalaryTest {

	public static void main(String[] args) {
		Employee e [] = new Employee[4];
		// 1.상속 2.생성자(타입 순서 갯수....)
		e[0] = new Employee
		(1000,"이사원",10000,5000);
		e[1] = new Manager
		(2000,"김간부",20000,10000,10000);
		e[2] = new Engineer
		(3000,"박기술",15000,7500,5000,5000);
		e[3] = new Secretary
		(4000,"최비서",15000,7000,10000);
		
		for(int i = 0; i < e.length; i++) {
			System.out.println(e[i].id + ":" + e[i].name + ":" + e[i].pay + e[i].totalPay);
		}
		
		/* 배열 내의 각 객체의 
	          급여계산메소드 호출하고
		사번, 이름, 총급여 출력

	사번:이름:본봉:총급여
	1000:이사원:10000:xxxxx
	2000:김간부:20000:xxxxx
	3000:박기술:15000:xxxxx
	4000:최비서:15000:xxxxx
	 */ 
	}

}
