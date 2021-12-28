package ch4;

public class IfTest {

	public static void main(String[] args) {
		String name = "이자바";
		
		// java, db , algorithm, 시험점수 - 100
		int java = 100;
		int db = 100;
		int algo = 95;
		int sum = java + db + algo;
		int avg = sum / 3;
		double avgDouble = (double) sum / (double)3;
		
		System.out.println(name + "학생은 자바점수 =" + java + " db점수 = " + db + " 알고리즘점수 =" + algo);
		System.out.println(name + "학생은 촘점 = " + sum + ", 정수평균 = " + avg + ", 실수평균 =" + avgDouble);
		
		//avg: 90 이상 100점 이하 A등급 부여
		//avg: 80 이상 90점 이하 B등급 부여
		//avg: 70 이상 80점 이하 C등급 부여
		//avg: 70 미만 미수료 		
		
		if (avg >= 90 && avg <= 100) {
			System.out.println("A등급 부여");
			if(avg >= 93) {
				System.out.println("A+ 등급 부여");
			}
		}
		else if (avg >= 80 && avg <= 90) {
			System.out.println("B등급 부여");
		}
		else if (avg >= 70 && avg <= 80) {
			System.out.println("C등급 부여");
		}		
		else {
			System.out.println("미수료");
		}
		
	}

}
