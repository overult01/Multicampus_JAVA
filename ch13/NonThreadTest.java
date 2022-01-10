package ch13;

// 멀티 쓰레드 구현 

class Test1 {
	void m1() {
		for (int i = 0; i < 100; i++) {
			System.out.println("!");
		}
	}
}

class Test2 {
	void m1() {
		for (int i = 0; i < 100; i++) {
			System.out.println("#");
		}
	}
}


public class NonThreadTest {

	public static void main(String[] args) {
		// t1의 메서드가 실행된 후, t2의 메서드가 실행된다. (순차적) 
		Test1 t1 = new Test1();
		t1.m1();

		Test2 t2 = new Test2();
		t2.m1();
		
		// !##! 등으로 두 메서드가 섞여서 나올 수 없을까? -> 멀티 쓰레드 사용 

	}

}
