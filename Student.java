package arraylist;

import java.util.ArrayList;

// (자주 사용되는 )ArrayList 활용 예제 
public class Student {	

	private int studentID;
	private String studentName;

	// 학생이 수강하는 과목들을 배열로 관리하기 위해 생성 
	private ArrayList<Subject> subjectList;
	
	// (1) 학생에 대해서 생성 
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		// (2) 그 학생이 들은 수강 과목을 배열로 생성 
		// 학생이 한 명 생성될 때마다 배열을 새로 생성: Subject를 가지고 있는 ArrayList를 생성해주어라. 
		subjectList = new ArrayList<Subject>();
		
	}
	
	// (3) 수강 과목 배열에 과목을 추가할 수 있는 메서드 만듦 
	// 그 학생이 수강한 과목이 추가될 때마다 subjectList에 추가하기 위한 메서드 
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		// 이렇게 생성된 subject가 이 학생의 subjectList에 요소로 추가가 됨
		subjectList.add(subject);
		
	}
	
	// (4) 정보를 출력할 수 있는 메서드 생성 
	// 이 학생이 수강한 과목은 무엇이고, 그래서 총점은 얼마인지 계산하는 메서드 
	public void showStudentInfo() {
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			
			System.out.println("학생 " + studentName + "님의 " 
		+ subject.getName() + "과목의 성적은 " + subject.getScorePoint() + "입니다. ");
		}
		
		System.out.println("학생 " + studentName + "님의 총점은 " + total + "입니다. ");
	}
}
