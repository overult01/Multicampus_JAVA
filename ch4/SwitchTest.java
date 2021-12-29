package ch4;

public class SwitchTest {

	public static void main(String[] args) {
		String name = "이자바";
		
		// java, db , algorithm, 시험점수 - 100
		int java = (int)(Math.random()*100) + 1;
		int db = (int)(Math.random()*100) + 1;
		int algo = (int)(Math.random()*100) + 1;
		int sum = java + db + algo;
		int avg = sum / 3;
		double avgDouble = (double) sum / (double)3;
		
		System.out.println(name + "학생은 자바점수 =" + java + " db점수 = " + db + " 알고리즘점수 =" + algo);
		System.out.println(name + "학생은 촘점 = " + sum + ", 정수평균 = " + avg + ", 실수평균 =" + avgDouble);
		
		//avg: 90 A등급 부여
		//avg: 80 B등급 부여
		//avg: 70 C등급 부여
		//avg:  기타 등급  		
		
		int avg10 = avg / 10; // 90점대 / 10 --> 9 
		
		switch(avg10) {
		case 10:
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		default:
			System.out.println("기타등급");
		} // switch end
		
	} // main end

} // class end 
