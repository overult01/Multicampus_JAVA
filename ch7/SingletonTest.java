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

class FinalClass{
	final double pi; // 선언만. final이 없으면 자동초기화됨 (필드변수는 자동초기화됨) 
//	double pi;
	
	// 생성자에서 값을 초기화하든지, 클래스 내부에서 초기화하든지 해야한다. 
	FinalClass() {
		pi = 3.14;
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
		
		FinalClass fc = new FinalClass();
//		fc.pi = 12345;   // final 이 붙은 변수는 값을 수정할 수 없다. 
		System.out.println(fc.pi);
	}

}
