package ch15;

import java.util.Scanner;

// Scanner 
public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*		System.out.println("정수 2개를 입력하면 덧셈 연산 수행합니다.");
		int first = sc.nextInt(); // 입력된 값 중에 첫 번째 값을 담는다.
		int second = sc.nextInt();
		System.out.println(first + second);
		System.out.println("한글 입력하세요");
		String third = sc.next(); // 단어 한 개만 읽어온다. (공백 이전) 
		System.out.println(third);
*/		
		// 100 김사원 3456.0 사원 교육부 입력
//		sc.next();  // scanner로 읽으면 우선 String으로 읽어진다.
		
		
		Employee e = new Employee(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(), sc.next());
		System.out.println(e);    // e.toString() - 자동호출 
	}
}


class Employee{
	int id;
	String name;
	double pay;
	String title, dept;

	public Employee(int id, String name, double pay, String title, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.pay = pay;
		this.title = title;
		this.dept = dept;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " "+ name + " "+ pay + " "+ title + " "+ dept;
	}
	
	
}