package ch7;

// 객체 참조 키워드 : this(자신참조), super(상위클래스 객체 참조)

class A {
	int i;
	A(String s) {
		System.out.println("A생성자 호출");
		i = 10;
	}
}

class B extends A {
	int j;
	B() {
		// super();  // 생성자의 가장 첫 줄은 super()가 있는 것이다 : 상위클래스의 생성자가 항상 먼저 호출된다. 자동으로. (사실은 Object 객체 생성 -> 상위클래스 객체 생성 -> 하위클래스 객체 생성 순으로 생성된다)
		this("전달");
		System.out.println("B생성자 호출");
		j = 100;
	}
	B(String s) {
		super(s); // this, super는 모두 첫 문장에 있어야 해서 만들어진 코드 
	}
}

public class SuperTest {

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}

}
