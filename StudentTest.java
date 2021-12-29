package arraylist;

public class StudentTest {
//ArrayList 예제 출력 확인 클래스 
	public static void main(String[] args) {
		// 학생 2명 생성 
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		studentLee.addSubject("과학", 100);

		studentLee.showStudentInfo();

		System.out.println("=======");
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 70);

		studentKim.showStudentInfo();
		
		
	}

}
