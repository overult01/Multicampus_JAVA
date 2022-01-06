package ch9;

import java.util.Random;

public class MathTest {

	public static void main(String[] args) {
//		Math m = new Math();  // 불가능 
// Math 클래스는 private 생성자(객체생성불가능), final 클래스(상속불가능), 모든 메소드는 static(Math. 으로 바로 사용)  
		System.out.println(Math.random());
		System.out.println(Math.PI);  // 정해진 값. 
		System.out.println(Math.round(123.55));  //반올림. 
		System.out.println(Math.abs(123)); // 절대값 
		
		// 난수발생클래스
		// 1 ~ 100 난수발생
		int ran1 = (int)(Math.random() * 100) + 1;
		System.out.println(ran1);
		
		// Math.random() 과 자바 내장 랜덤함수와 비교.
		java.util.Random rd = new Random();
		int ran2 = rd.nextInt(); // Int 타입의 난수 발생. int최솟값 ( - 2^31) ~ int최대값( 2^31 - 1)
		System.out.println(ran2);
		
		int ran3 = rd.nextInt(101); // Int 타입의 난수 발생. 0~100 사이의 정수 중 난수 발생. 
		System.out.println(ran3);

		// warrper 클래스 

		//wrapper클래스: 기본형 변수값을 객체상태로 포장한 클래스. 참조형처럼.
		// 기본형 타입 8개에 맞게 8개가 존재. 
		// 보통 타입 변환에 많이 쓴다.
		boolean r1 = Boolean.parseBoolean("TrUE");
		System.out.println(r1);
		System.out.println(Integer.toBinaryString(10)); // 2진수로 바꿔라 
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println(max);  // 2147483647 (= 2^31 - 1)
		System.out.println(min);  // -2147483648 (= - 2^31)
	}

}
