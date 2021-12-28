package ch4;

public class ForTest {

	public static void main(String[] args) {
		// 1 ~ 10 총합
		
		// for 문 
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total += i;
			System.out.println("i= " + i + "일 때 total = " + total);
		}
//		System.out.println(i); // i변수는 for블록 안에서만 확인 가능(for블럭 내의 지역변수)
		
		// while 문
		int total2 = 0;
		int i2 = 1;
		while (i2 <= 100) {
			total2 += i2;
			System.out.println("i2= " + i2 + "일 때 total2 = " + total2);
			i2++;
		}
		
		// do while 문 (조건에 맞지 않더라도 무조건 최소 1번은 수행)
		int total3 = 0;
		int i3 = 101;
		do {
			total3 += i3;
			System.out.println("i3= " + i3 + "일 때 total3 = " + total3);
			i3++;
		} while (i3 <= 100);		
	}
}
