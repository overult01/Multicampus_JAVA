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
		MyObject o4 = new MyObject(200, null);
		
		// getClass().getName() + "@" + Integer.toHexString(hashCode())
		// 패키지명.클래스명16진수(주소값) 
		System.out.println(o3);  // (오버라이딩 전)ch9.MyObject@70dea4e -> (오버라이딩 후)100-java 
		System.out.println(o3.toString()); // ch9.MyObject@70dea4e
		System.out.println(o4);  // java.lang.Object@4e25154f
		System.out.println(o4.toString());  // java.lang.Object@4e25154f
		
	}

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
	

}