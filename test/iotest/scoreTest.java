package iotest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// 입출력 테스트 실습 

class Student {
	
	String name;
	int kor;
	int eng;
	int math;
	private int sum;
	private double avg;
	
	Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 생성자 ver 
	// 나중에 계산되는 avg, sum 변수를 위해서 
//	Student(Student person) {
//		this(person.name, person.kor, person.eng, person.math); // 상위 생성자 호출 
//		this.sum = kor + eng + math;  // sum, avg 초기화 
//		this.avg = (double)(kor + eng + math) / 3;
//	}
	
	// getter ,setter 별 
	public double getAvg() {
	return avg;
	}

	public void setAvg() {
		this.avg = (double)(kor + eng + math)/3;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void setSum() {
		this.sum = kor + eng + math;
	}
	
}

/* 키보드 + scanner로 입력받고 
이름:
국어:
영어:
수학;
=> 3명의 학생의 이름, 점수 3개씩을 받기.
클래스 Student 에 name, kor, eng, mat, // 초기화  sum, avg 인스턴스 6개 정의 후 저장.
Student 인스턴스 3개를 각각 만들고, ArrayList<Student> 생성후 인스턴스 저장.
학생당 총점, 평균 계산하고 학생이름 앞에 학생 번호 추가해서 sum, avg에 저장.
이것을 파일로 영구적으로 저장하기 위해 현재 프로젝트 내의 'scores.dat'파일에 모두 저장.

*/


public class scoreTest {

	public static void main(String[] args) {
		/* 입력받기
		"미영" 98 100 88
		"준호" 100 80 70
		"세영" 100 100 100
		*/
		
		Scanner sc = new Scanner(System.in);
		
//		// 학생1 
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();		
		
		Student student1 = new Student(name, kor, eng, math);

		// 학생2
		String name2 = sc.next();
		int kor2 = sc.nextInt();
		int eng2 = sc.nextInt();
		int math2 = sc.nextInt();		
		
		Student student2 = new Student(name2, kor2, eng2, math2);

		// 학생3
		String name3 = sc.next();
		int kor3 = sc.nextInt();
		int eng3 = sc.nextInt();
		int math3 = sc.nextInt();		
		
		Student student3 = new Student(name3, kor3, eng3, math3);


		// ArrayList 생성 
		ArrayList<Student> students= new ArrayList<Student>();
		
		students.add(student1);  // ArrayList 에 요소 추가는 add 메서드로.
		students.add(student2);
		students.add(student3);
		
		try {
			File f = new File("scores.txt");
		
			if(f.canWrite() == true) {
				FileWriter file = new FileWriter("scores.txt", true);
				
				int cnt = 1;
				
				for(Student student : students) {
					file.write(cnt + student.name + student.kor + student.eng + student.math + student.getAvg() +student.getSum() + '\n');
					cnt += 1;
					
					file.close();
				}				
			}
		}
		
		catch(IOException error) {
			error.printStackTrace();
		}
		
	}

}



/* test/scores.dat 파일
 * 
 1 이학생 국어점수 영어점수 수학점수 총점 평균 
 2 김학생 국어점수 영어점수 수학점수 총점 평균 
 3 박학생 국어점수 영어점수 수학점수 총점 평균 
 */