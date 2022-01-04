// 참조변수 형변환(상속필수) 

class A{
	int ia =10;
	void ma() {
		System.out.println(ia);
	}
}

class B extends A{
	int ib = 20;
	void mb() {
		System.out.println(ib);
	}
}

class C extends A{
	int ic = 30;
	void mc() {
		System.out.println(ic);	
	}
}

class D extends C{
	int id = 40;
	void md() {
		System.out.println(id);
	
	}
}

public class CastingTest {

	public static void main(String[] args) {
		A a1 = new A();  // 형변환 필요 X: A타입 본인.  // Object객체 + A객체 
		// 자동형변환: 자식을 부모타입으로 변환한 것.
		A a2 = new B(); // Object객체 + A객체 + B
		A a3 = new C(); // Object객체 + A객체 + C
		A a4 = new D(); // // Object객체 + A객체 + D 
		
		// 사용 변수나 메서드
		System.out.println(a1.ia);
		a1.ma();
		System.out.println(a2.ia);
		a2.ma();
		System.out.println(a3.ia);
		a3.ma();
		System.out.println(a4.ia);
		a4.ma();
	
//		System.out.println(a1.ib); // 오류. 메모리 안에 ib가 없다(지금은 A타입이어서 B객체가 생성되지도 않아서)
//		System.out.println(a2.ib); // 오류. 메모리 안에 ib변수 포함한 객체 B가 생성되었으나, 자동형변환으로 A타입되어 접근 불가능.		
		// 명시적 형변환
		B b2 = (B)a2;
		System.out.println(b2.ib);
		
		// 자동형변환이 필요한 경우: 변수의 타입이 통일 필요할 때
		// 여러가지 객체를 1개 배열로 선언할 수 있다
		A array[] = new A[4];
		array[0] = new D();
		array[1] = new C();
		array[2] = new B();
		array[3] = new A();
		for(int i = 0; i < array.length; i++) {
			// array 4개 객체의 ID 변수값 출력
//			D d1 = (D)array[i];  // C cannot be cast to D (A, B, C타입의 객체는 D로 바꾸지 못한다)
			if(array[i] instanceof D) { // instanceof: D 타입으로 명시적 형변환이 가능한지 확인 
				D d1 = (D)array[i];
				System.out.println(i + "번째 인스턴스일 때 " + d1.id);  // 0번째 인스턴스일 때 40
			}
			
		}
		
	}

}
