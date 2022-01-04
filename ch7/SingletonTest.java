package ch7;

// static의 활용 
//싱글톤 예제: 객체 생성을 1번 하고 계속 공유하여 사용하고 싶을 때

class NoSingleton {
	NoSingleton() {
		System.out.println("NoSingleton 생성자 호출");
	}
}

class Singleton {
	static private Singleton me = new Singleton(); // static: 공유, private: 다른 클래스에서 호출불가
	private Singleton() {   // private을 붙여서 다른 클래스인 메인에서 호출 못한다. 
		System.out.println("Singleton 생성자 호출");
	}
	public static Singleton getInstance() {  // 객체를 만들 필요가 없다. 1번 만들어진 me 인스턴스를 계속 공유하여 사용하는 것.(싱글톤) 
		return me;
	}
}
 
public class SingletonTest {

	public static void main(String[] args) {
		NoSingleton n1 = new NoSingleton();
		NoSingleton n2 = new NoSingleton();
		NoSingleton n3 = new NoSingleton();
//		Singleton s1 = new Singleton();  // private 이라서 호출 불가
		
		// "Singleton 생성자 호출" 출력이 1번만 된다.
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
	}

}
