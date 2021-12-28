package test;

public class Sample {

	public static void main(String[] args) {
		int number = (int)(Math.random() * 1000)+1; //3자리 정수 . Math.random() 은 0~1.0(미포함) 사이의 실수 반환하니까
		int numberHun = number / 100; // 자바는 정수 / 정수 하면 정수몫만 반환
		System.out.println(numberHun * 100);
		
	}

}


//test 프로젝트 내 : src
//
//1.
//// 3자리 정수 주어지면
//int sample = 867;
//
//===> 백단위 출력 :800
//
