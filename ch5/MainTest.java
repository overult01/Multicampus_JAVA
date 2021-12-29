package ch5;

public class MainTest {

	public static void main(String[] args) {

		System.out.println("입력변수 갯수 =" + args.length);
		System.out.println("내용출력");
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		// run ..... 100 200
		// 300 출력
//		System.out.println((int)(args[0]) + (int)(args[1]));  //문바열 더하기 이르모 100200
		// 자바 형번환: boolean 제외 기본형 변수들 가능 -> String 은 참조형이다(기본형이 아니라서 형변환 불가)
		// String -> int 형반환 메서드 사용해야 한다.
		int first= Integer.parseInt(args[0]);
		int second= Integer.parseInt(args[1]);
		System.out.println(first + second); // 300
		
		// String -> double 타입으로 형변환 메서드
		System.out.println(Double.parseDouble(args[0])); // 100.0
		
	}

}
