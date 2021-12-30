package ch6;

// 오버로딩 예제
// 오버로딩: 1개의 클래스에 같은 이름의 메서드를 여러개 정의

class ArithMetic {
	int add(int i, int j) {
		return i + j; 
	}

	double add(double i, double j) {
		return i + j;
	}
	
	String add(String i, String j) {
		return i + j;
	}
	
}

public class OverloadingTest {

	public static void main(String[] args) {

		ArithMetic a = new ArithMetic();
		double r1 = a.add(1.1, 2.3);
		String r2 = a.add("자바", "스프링");
		int r3 = a.add(1, 2);
		double r4 = a.add(3.14, 1); // 두 번째 매개변수 1이 자동형변환으로 double 로 변경됨 

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4); // 컴퓨터의 오차범위 때문에. 4.140000000000001

		// parseInt는 매개변수에 따라 몇 진수로 나올지 바뀌는 것(매개변수 따라 다른 메서드 호출) 
		int decimal = Integer.parseInt("100");
		int bin = Integer.parseInt("100", 2);
		int hex = Integer.parseInt("100", 16);
		
		System.out.println(decimal); // 100
		System.out.println(bin); // 4
		System.out.println(hex); // 256	
	}

}