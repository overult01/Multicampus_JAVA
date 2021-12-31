package ch7;

// 상속 예제(extends)
class Employee /*extends Object*/{  
	int id;
	String name;
	double pay;
	static String role = "회사원";
	void work() {
		System.out.println(id + "사번의 사원명은 " + name + "이고 급여는 " + pay +"입니다.");
	}
}

class Manager extends Employee{
	static String role = "매니저"; // 부모랑 이름이 같은 변수가 또 있다. 이런 경우 자식(본인) 클래스의 변수값이 우선한다.
	String jobOfManage;
	void getManage() {
		System.out.println(name + "매니저는 " + jobOfManage + "입니다.");
	}
	// work기능을 manager에서 재정의(오버라이딩)하면 본인(즉, 자식) 클래스 내 메서드가 우선되어 실행.
	void work() {
		System.out.println(id + "사번의 사원명은 " + name + "이고 급여는 " + pay +"입니다.");
		System.out.println("관리업무는 " + jobOfManage); 
	}
}

public class ManangerTest {

	public static void main(String[] args) {
		Manager manager1 = new Manager();
		manager1.name = "김지원";
		manager1.jobOfManage = "it매니저";
		manager1.id = 100;
		manager1.pay = 123456.78;
		manager1.work();
		manager1.getManage();
		System.out.println(manager1.role);  // 매니저 
		System.out.println(Manager.role); // 매니저 (static 때문에)
		System.out.println(Employee.role); // 회사원 (static 때문에)
	}
}
