package ch9;
// java.lang 패키지 학습 
// Object 예제 

public class ObjectTest {

	public static void main(String[] args) {
		Object o1 = new Object();  // 모든클래스는 Object객체를 만들 필요가 ??
		Object o2 = new Object();
		
		// getClass().getName() + "@" + Integer.toHexString(hashCode())
		// 패키지명.클래스명16진수(주소값) 
		System.out.println(o1);  // java.lang.Object@7852e922
		System.out.println(o1.toString()); // java.lang.Object@7852e922
		System.out.println(o2);  // java.lang.Object@4e25154f
		System.out.println(o2.toString());  // java.lang.Object@4e25154f
		// 알 수 있는 것: 1) 객체를 출력한다 = 객체.toString()메서드를 호출한다 결과 동일 2) o1, o2객체는 메모리 주소값만 다르다.
		
		// 사용자 정의 클래스도 toStirng()메서드를 사용할 수 있다.
		MyObject o3 = new MyObject(100, "java");  // 모든클래스는 Object객체를 만들 필요가 ??
		MyObject o4 = new MyObject(100, "java");
		
		// getClass().getName() + "@" + Integer.toHexString(hashCode())
		// 패키지명.클래스명16진수(주소값) 
		System.out.println(o3);  // (오버라이딩 전)ch9.MyObject@70dea4e -> (오버라이딩 후)100-java 
		System.out.println(o3.toString()); // ch9.MyObject@70dea4e
		System.out.println(o4);  // java.lang.Object@4e25154f
		System.out.println(o4.toString());  // java.lang.Object@4e25154f
		
		//Object클래스의 equals메서드는 메서드 객체(참조형)의 동등성 비교. => Object의 equals는 '주소비교' (String 의 equals는 값비교). but 메서드 오버라이딩으로 수정해서 사용가능.  
		// ==연산자: 기본형(실제값 비교), 참조형(주소값 비교)의 동등성 비교 
		if (o1 == o2) {
			System.out.println("o1 == o2 true"); // false
		}
		if (o1.equals(o2)) {
			System.out.println("o1 == o2 true"); // false
		}		
		
		
		if (o3 == o4) {
			System.out.println("o3 == o4 true"); // false
		}
		if (o3.equals(o4)) {
			System.out.println("o3 == o4 equals true"); // false
		}
	}
	// 객체 동등성 비교
	// 두 객체 '주소'를 비교하교 결과 리턴
	// 다른 부분을 동등성 비교하고 싶다면 오버라이딩 해서 사용- 같은 타입 객체인지, 인스턴스 변수값 같은지 확인은 보통 오버라이딩해서 구현한다.
	// String 클래스의 equals는 문자열 비교로 Object 클래스의 equals를 오버라이딩 한 것이다.
}

class MyObject {
	int code;
	String msg;
	
	// 초기화하는 생성자
	MyObject(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	// 메서드 오버라이딩
	@Override
	public String toString() {
		return code + "-" + msg; // 100-java 형태로 출력하고 싶을 때 오버라이딩 예제.
	}

	@Override
	public boolean equals(Object obj /*자동형변환*/) {
// MyObject 타입하고 code, msg 변수값 동일하면 true 반환으로 오버라이딩.
		if(obj instanceof MyObject) {
			if( this.code == ((MyObject) obj).code && this.msg == ((MyObject) obj).msg ) {
				// 명시적 형변환. MyObject 객체의 code변수 사용하기 위해서.
				
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

}