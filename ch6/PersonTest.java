package ch6;
// 변수에 static, final 들이 붙었을 때
// static이 붙으면: 클래스 변수(공통값)
// final이 붙으면: 상수 (변하지 않음) 
class Person{
	String name;
	int age;
	static final String nation = "대한민국"; // static: 공통된 값은 static을 사용하여 메모리에 1개만 만들어서 공유하겠다. 
}

public class PersonTest {
 public static void main(String []args) {
	 System.out.println(Person.nation); // static 변수는 객체 생성 이전에 이미 생성되어있다. 따라서 출력 가능 
//	 System.out.println(Person.name); // 인스턴스 변수는 객체 생성에 이전에 존재하지 않고, 클래스명.인스턴스 변수명이 안된다 
	 
	 
	 Person p1 = new Person();
	 p1.name = "김기술";
	 p1.age = 23;
	 System.out.println(p1.name + "은 나이" + p1.age + "이고 " + p1.nation + "입니다");

	 Person p2 = new Person();
	 p2.name = "박정보";
	 p2.age = 33;
	 System.out.println(p2.name + "은 나이" + p2.age + "이고 " + p2.nation + "입니다");

	 // static변수는 공통 변수를 참조하기 때문에 1명을 바꾸면 전체 인스턴스가 모두 변한다. 컴파일 오류는 없지만 
//	 p2.nation = "미국";
//	 System.out.println(p1.name + "은 나이가 " + p1.age + "살이고 국적은 " + p1.nation); //김기술은 나이가 23살이고 국적은 미국
//	 System.out.println(p2.name + "은 나이가 " + p2.age + "살이고 국적은 " + p2.nation); //박정보은 나이가 33살이고 국적은 미국
	 
//	 static변수의 변경 방지를 위해서 final을 붙인다. (맨 위의 static final. 순서 상관 없음)
 	}
}
