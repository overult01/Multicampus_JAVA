package ch6;

// 생성자(constructor) 예

// this 예. 
// this.인스턴스 변수명: 1)내 객체의 인스턴스 라는 뜻(생성자 또는 매개변수와 인스턴스 변수 이름이 같을 경우 구분) 
// 2) 생성자나 지역변순의 이름이 같을 경우 구분. 
class Student{
//	Student () { } // 자동정의됨 = default constructor . 있어도, 없어도 무방 
//	Student () {System.out.println("생성자 호출");}  // 자동정의된 default constructor를 수정한 것 

	Student(int id, String name, String major) {  // 생성자 정의 변경: 생성자에서 매개변수로 변수 초기화하도록 수정.
		this.id = id;
		this.name = name;
		this.major = major;
	}

	Student() {  // 생성자 오버로딩(매개변수가 다름) 
//		id = -1;  // this 붙여도 되고 안붙여도 됨. 
//		name = "none";
//		major = "전공미정";
		
		this(-1, "none", "전공미정");  // 이 객체 안에서 다른 생성자를 쓰겠다는 의미. 이렇게 this를 사용하는 것은 생성자에서만 가능.
	}
	
	int id; // 학번
	String name;
	String major;
	void study() {
		System.out.println(name + " 학생은 " + major + " 공부를 열심히 합니다." );
	}
}

public class StudentTest {

	public static void main(String[] args) {
//		Student student1 = new Student(); // 객체 만들기
//		student1.id = 10000;  // 인스턴스 변수 초기화해서 저장 
//		student1.name = "김대한";
//		student1.major = "it전산학";
//		student1.study();
		
		Student student2 = new Student(20000, "박민국", "한국어문학");  // 생성자에서 변수 초기화도 진행하는 형태. 
//		student2.id = 20000;
//		student2.name = "박민국";
//		student2.major = "한국어문학";
		student2.study();
		
// 추가합격의 경우 매개변수 아무것도 없을 때 가정.	(생성자 오버로딩 예제)	
		Student student3 = new Student(); 
		student3.study();
	}

}
