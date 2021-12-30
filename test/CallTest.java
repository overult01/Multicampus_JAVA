package ch6;

// 매개변수 예제 : 기본형, 참조형 차이점 비교 

class Data {
	int a = 30;
}

class Call {
	void add(int i) {
		System.out.println("add 내부: " + i++);
	}
	void addData(Data d) {
		System.out.println("addData 내부: " + d.a++);
	}
}

// 실행하면 main메서드 부터 실행됨 
public class CallTest {

	public static void main(String[] args) {
		Call c = new Call();
//기본형 변수 전달 방법 
//		int j = 10; // 지역번수 
//		c.add(j);
//		System.out.println("main내부: " + j);

		// 참조형 변수 전달 방법: 직접 제작한 클래스 타입 Data
		// 참조 타입은 매개변수 전달시 동일한 변수의 주소값을 참조. 
		Data d1 = new Data();		
		c.addData(d1);
		System.out.println("main 내부: " + d1.a);

		
	}

}
