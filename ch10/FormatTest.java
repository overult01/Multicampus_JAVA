package ch10;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// 형식화: xxformat 

public class FormatTest {

	public static void main(String[] args) {
// DecimalFormat : 숫자포맷 
		double d1 = 123.45678;
		System.out.println(d1);
		DecimalFormat df = new DecimalFormat("0.00"); // 정수는 한 자리 이상을 나타내는 것.
		String s1 = df.format(d1);  // d1은 원래 double인데, df를 적용하면 String이 된다.
		System.out.println(s1);  // 123.46

		// 0 : 0 도 표현하자 
		df = new DecimalFormat("00000.00"); // 꼭 0이 있는 이 자리에 맞춰라.
		String s2 = df.format(d1);  // d1은 원래 double인데, df를 적용하면 String이 된다.
		System.out.println(s2);  // 00123.46
		System.out.println(123.40);
		System.out.println(df.format(123.40)); // 00123.40

		// # : 의미없는 0은 생략하자 
		df = new DecimalFormat("####.##"); // 의미없는 자리는 출력하지 말아라.
		String s3 = df.format(d1);  // d1은 원래 double인데, df를 적용하면 String이 된다.
		System.out.println(s1);  // 123.46

		// 0, # 혼합
//		df = new DecimalFormat("0000.#0");  // java.lang.IllegalArgumentException에라. ex. 123.01인 경우 소수점 첫 번째 자리를 표현하지 못하므로.
//		String s4 = df.format(d1);  
//		System.out.println(s4);  

		
		df = new DecimalFormat("\u00a4 ####.##+; ####.##-"); // 의미없는 자리는 출력하지 말아라.
		System.out.println(df.format(123.40));
		System.out.println(df.format(-123.40)); 
		
// SimpleDataFormat: 날짜 표현을 위해서만 사용  
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy- MM - dd - HH - mm - ss - E");
		String nowstr = sdf.format(now);
		System.out.println(nowstr);   // 2022- 01 - 06 - 16 - 45 - 58 : HH는 24시간 기준. 

// ChoiceFormat 		
		double [] scores = {60, 70, 80, 90}; // 경계선 값들. 작은 값들부터 만들어야 한다. 매칭될 것이랑 순서가 맞아야 한다. 
		String [] grades = {"D등급","C등급","B등급","A등급"};
		ChoiceFormat cf = new ChoiceFormat(scores, grades); // 매개변수로 기준이 될 것, 매칭될 것 순서대로 넣는다.
		System.out.println(cf.format(98.5)); // A등급
		System.out.println(cf.format(0)); // D등급(0번 인덱스보다 작아서 그만 비교하고 멈췄다) 
		System.out.println(cf.format(66)); // D등급
		
// MessageFormat : 형식대로 출력해주어라 
		Object[] data = {"이자바", 98.5, 1, nowstr};  // 자바의 모든 타입을 배열로 넣어라 
		String msg = "{0} 학생이 {3} 일시에 응시한 시험성적은 {1}이고 현재 {2}등입니다. ";
		// MessageFormat의 format메서드는 static.  
		// 문장형식, 들어갈 값들이 담긴 배열
		System.out.println(MessageFormat.format(msg, data));
	}

}
