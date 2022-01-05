package test;
// 상속, 오버라이딩, 객체 형변환 ,생성자, super활용 실습 

// 각 직종의 회사원들의 급여를 계산하시오.
class Employee {
	int id;
	String name;
	int pay, extraPay, totalPay; // 본봉, 일반수당 
	
	// 생성자 정의. 매개변수 4개 값을 멤버변수 값으로 초기화. 
	Employee(int id, String name, int pay, int extraPay) {
//		super();  // 자동 생성되는 문장 
		this.id = id;
		this.name = name;
		this.pay = pay;
		this.extraPay = extraPay;
	}
	
	void calculatePay() {
		totalPay = pay + extraPay;
	}
}

class Manager extends Employee{
	int managerPay; // 간부수당 

	Manager(int id, String name, int pay, int extraPay, int managerPay) {
		super(id, name, managerPay, extraPay);  //super ()
//		this.id = id; // super() 에서 다 호출된 부분. 따라서 생략 가능. 
//		this.name = name;
//		this.pay = pay;
//		this.extraPay = extraPay;
		this.managerPay = managerPay;
	}

	@Override
	void calculatePay() {
//		totalPay = pay + extraPay + managerPay;
		super.calculatePay(); // 상위 클래스의 코드 재사용 위해서(반복되는 부분 줄이기)
		totalPay += managerPay;
		
	}
		
}


class Engineer extends Employee{
	int qualificationPay;
	int engineeringPay;
	
	// 생성자 정의 
	Engineer(int id, String name, int pay, int extraPay, int qualificationPay, 	int engineeringPay) {
		super(id, name, pay, extraPay);
		this.qualificationPay = qualificationPay;
		this.engineeringPay = engineeringPay;
	}

	@Override
	void calculatePay() {
		super.calculatePay();
		totalPay = totalPay + qualificationPay + engineeringPay ;
	}		

}

class Secretary extends Employee{

	int secretaryPay;
	
	Secretary(int id, String name, int pay, int extraPay, int secretaryPay) {
		super(id, name, pay, extraPay);
		this.secretaryPay = secretaryPay;
	}

	@Override
	void calculatePay() {
		super.calculatePay();
		totalPay += secretaryPay ;
	}

}

public class SalaryTest {

	public static void main(String[] args) {
		Employee e [] = new Employee[4];
		// 1.상속 2.생성자(타입 순서 갯수....)
		e[0] = new Employee
		(1000,"이사원",10000,5000);
		e[1] = new Manager
		(2000,"김간부",20000,20000,10000);
		e[2] = new Engineer
		(3000,"박기술",15000,7500,5000,5000);
		e[3] = new Secretary
		(4000,"최비서",15000,7000,10000);

		System.out.println("사번:이름:본봉:총급여");
		// 모든 자식 클래스의 타입이 Employee(부모 타입)이지만, 오버라이딩 된 메소드가 우선된다.  (변수는 부모타입 것. )
		for(int i = 0; i < e.length; i++) {
			e[i].calculatePay(); // 총급여 계산 메서드를 호출해야 totalPay를 계산할 수 있다. 
			System.out.println(e[i].id + ":" + e[i].name + ":" + e[i].pay +":"+ e[i].totalPay);
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