package iotest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// 강사님 코드 
public class ScoreTest2 {

	public static void main(String[] args) throws IOException {

	
	Scanner sc = new Scanner(System.in);
	
	// 리스트가 빌요한 이유: 1등 뽑자, 점수순으로 정렬하자 등
	ArrayList<Student2> list = new ArrayList(3);
	FileWriter fw = new FileWriter("scores.dat", true);
	
	for(int i =1; i <= 3; i ++) {
		System.out.print("이름: ");
		String name = sc.next();

		System.out.print("국어: ");
		int kor = sc.nextInt();

		System.out.print("영어: ");
		int eng = sc.nextInt();
		
		System.out.print("수학: ");
		int mat = sc.nextInt();
		
		Student2 st = new Student2(name, kor, eng, mat);
		list.add(st);  // 총점, 평균 계산 완료된 상태 
		}
	
	// 키보드 3명 학생 정보 입력
	
	// 1등 학생의 모든 것을 뽑자 평균값순으로.
	int firstAvg = 0;
	Student2 firstStu = null;  // 1등 학생의 객체를 저장하기 위함. 
	for (Student2 st : list) {
		if (firstAvg < st.avg) { firstAvg = st.avg; firstStu = st;}
	}
	System.out.println(firstAvg);  // 1등학생의 오버라이딩된 toString()메서드 호출. 
	
	
	// list 내 저장 학생 정보 출력
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));  // st그냥 출력 == toString()메서드 호출. (객체@16진수 주소값)

		// score.dat 파일 저장 
		fw.write( (i+1) + "\t" + list.get(i) + "\n");

		}
	
		fw.close();
	}
	
	

}


class Student2 {
	String name;
	int kor, eng, mat, sum, avg;
	public Student2(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = this.kor+ this.eng + this.mat;
		avg = sum / 3;
	}
	
	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sum + "\t" + avg;
	}
	
}