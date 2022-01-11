package ch15;

import java.util.Scanner;

// Scanner 
public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력하면 덧셈 연산 수행합니다.");
		int first = sc.nextInt(); // 입력된 값 중에 첫 번째 값을 담는다.
		int second = sc.nextInt();
		System.out.println(first + second);
		System.out.println("한글 입력하세요");
		String third = sc.next(); // 단어 한 개만 읽어온다. (공백 이전) 
		System.out.println(third);
		
	}
}
