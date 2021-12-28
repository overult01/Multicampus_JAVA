package ch3;

public class OperatorTest {

	public static void main(String[] args) {
		boolean r1 = true;
		boolean r2 = false;
		boolean r3 = 10 > 5;
		
		int i1 = 100;
		int i2 = 200;
		double d1 = 100.0;
		boolean r4 = i1 == i2; //int 타입 비교 
		boolean r5 = i1 == d1; // int, double 타입 비교. int는 double로 자동 형변환이 가능. 따라서 사실 r6문장과 동일  
		boolean r6 = (double)i1 == d1; // double 타입끼리 비교 
		System.out.println(r4); // false
		System.out.println(r5); // true
		System.out.println(r6); // true				
		
		int i3 = 10 / 3;
		int i4 = 10 % 3;
		double d2 = 10 / 3.0;
		System.out.println("정수 몫은 "+i3);
		System.out.println("나머지는 "+i4);		
		System.out.println("실수 몫은 "+d2);		
		
		// + 끼리니까 순서대로 + 진행. 따라서 문자열 결합으로만 출력된 것.
		System.out.println("덧셈 = " + 100 + 200); // 덧셈 = 100200
		
		// 숫자 덧셈을 하고 싶었던 거라면 숫자덧셈을 먼저 실행하도록 하면 됨 
		System.out.println("덧셈 = " + (100 + 200)); // 덧셈 = 300

		// 조건 삼항 연산자
		int i = 0; // i가 1이면 수료/ i 가 1이 아니면 미수료
		String finish = i == 1 ? "수료" : "미수료";
		System.out.println(finish); // 미수료 
	}
}
