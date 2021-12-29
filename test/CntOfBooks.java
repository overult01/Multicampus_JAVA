package test;

public class CntOfBooks {

	public static void main(String[] args) {
		
		int cntOfBooks = (int)(Math.random() * 100) + 1; // 1 ~ 100 
		int cntOfStu = (int)(Math.random() * 100) + 1; // 1 ~ 100 
		System.out.println(cntOfBooks);
		System.out.println(cntOfStu);
		
		if (cntOfBooks >= cntOfStu) {
			System.out.println("1명의 학생당 : "+ cntOfBooks / cntOfStu + "권씩 가질 수 있습니다.");
			System.out.println("남아있는 책은 " + (cntOfBooks - (cntOfBooks / cntOfStu) * cntOfStu ) + "권입니다.");
		}
		else {
			System.out.println("나눠줄 수 없습니다. ");
		}
		
		
		//2.
		//책 : 97권
		//int cntOfBooks = 97;
		//
		//학생 : 102명
		//int cntOfStu = 12;
		//
		//책권수가 학생수보다 많다면
		//12명 학생들에게 공평권수의 책 분배
		//
		//===> 출력
		//1명의 학생당 : xx권씩 가질 수 있습니다.
		//남아있는 책은 xx권입니다.
		//
		//책권수가 학생수보다 많지 않다면
		//===> 출력
		//나눠줄 수 없습니다.


	}

}
