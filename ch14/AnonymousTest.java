package ch14;

// 람다식(익명 클래스)
// 단 1번만 인스턴스 생성할 때 사용한다. 

/* 기본 코드(람다식 미사용) 
interface MyFunction {
	public abstract int max(int a, int b);
}

class MyFunctionChild implements MyFunction {
	// 오버라이딩: 제어자는 같거나 더 넓거나, 선언부 동일, 구현부 다름 
	public int max(int a, int b) {
		return a > b? a: b;  // 조건삼항 연산
	}

}

public class AnonymousTest {

	public static void main(String[] args) {
		MyFunction c = new MyFunctionChild();
		int bigger = c.max(3, 5);  // 
		System.out.println(bigger);
	}

}
*/

// 람다식 사용 : 인스턴스를 단 한 번만 만들 때 
/*  익명의 클래스를 만들자(인터페이스를 상속받는 클래스를 익명으로)
interface MyFunction {
	public abstract int max(int a, int b);
}

//class MyFunctionChild implements MyFunction {
//	// 오버라이딩: 제어자는 같거나 더 넓거나, 선언부 동일, 구현부 다름 
//	public int max(int a, int b) {
//		return a > b? a: b;  // 조건삼항 연산
//	}
//
//}

public class AnonymousTest {

	public static void main(String[] args) {
		// 익명의 클래스 생성 & 인스턴스 생성 
		MyFunction c = new MyFunction() {
			public int max(int a, int b) {
			return a > b? a: b;  // 조건삼항 연산
			}
		};
		
		int bigger = c.max(3, 5);  // 
		System.out.println(bigger);
	}

}
*/

//람다식 사용: 메서드도 1개뿐이라 익명으로 만들자 
interface MyFunction {
	public abstract int max(int a, int b);
}

public class AnonymousTest {

	public static void main(String[] args) {
		// 익명클래스 & 익명함수(메서드가 1개라 가능) 
		MyFunction c = (int a, int b) -> a > b? a: b;  // 조건삼항 연산자
		
		
		int bigger = c.max(3, 5);  
		System.out.println(bigger);
	}

}
