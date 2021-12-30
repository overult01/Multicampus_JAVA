package ch6;

// static 메서드 : static 변수(클래스 변수)만 사용가능
// 인스턴스 메서드 : 인스턴스 변수, 클래스 변수 모두 사용 가능 
// 메모리에 할당되는 시기가 달라서 이런 차이가 발생됨 

class B {
	int i = 10; // 인스턴스 변수 
	static int j = 20; // 클래스 변수(static이 붙은) 
	
	void m1() { // 인스턴스 메서드 에서 인스턴스 변수, 클래스 변수 모두 사용 가능 
		System.out.println(i + j);
	}
	
	static void m2() {
//		System.out.println(i + j);	// static 메서드 에서 static 변수(클래스 변수 )만 쓸 수 있다(인스턴스 안됨) 	
		System.out.println(j);
	}
}

public class StaticMethodTest {

	void test() {
		System.out.println("클래스 = StaticMethodTest");
	}
	
	// main 메서드는 static이 항상 붙어있다(맨 처음 메모리에 할당됨)
	// run 할 때 객체 생성 이전에 '최초로 호출되는 메서드가 main'이므로 
	public static void main(String[] args) {
		
		 B b = new B();
		 b.m1();
		 B.m2();
		
		 // static이 안붙었으면 무조건 객체 생성을(new) 해서 사용 / static은 객체 생성 필요 없음, 클래스.변수 로 쓸 수 있다. 
		 StaticMethodTest s = new StaticMethodTest();
		 s.test();   // main메서드와 동일한 클래스에 있는 test메서드라도 1) 자기 자신 클래스의 객체생성 호출 혹은 2) test메서드에도 static 붙이기  

		 Integer.parseInt(s);
		 
	}

}
