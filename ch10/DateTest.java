package ch10;
//날짜와 시간 
//java.lang 클래스에 없음. 그래서 import로 다른 패키지를 사용해야 한다.

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now /* .toString() */); // Date 클래스에선 현재시간 보는 것만 가능.
//		System.out.println(now.toLocaleString());   // Deprecated. 버전업그레이드된 다른 것이 있다. 신규 프로젝트는 사용을 지양하라.
//		System.out.println(now.toGMTString());
//		Date d1 = new Date(2022, 1 ,6, 15, 12, 13);  // 사용자가 직접 초단위까지 넣어서 만드는 건 제한.
		
//		Calendar cal = new Calendar(); // Calendar는 private 생성자.(객체생성불가)
		Calendar cal = Calendar.getInstance();  // Calendar 객체를 만들어줌. Calendar는 대표적인 싱글톤 패턴.
		System.out.println(cal);  // 너무 많은 정보가 있음.
		// 년 월 일 시 분 초 만 확인하겠다 
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // 1월이 0.
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println(year + "년도");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println(hour + "시");
		System.out.println(min + "분");	
		System.out.println(sec + "초");
		
		//DAY_OF_WEEK : 요일 0:일 1:월
		String[] weekday = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		int date = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekday[date-1]);
		System.out.println(date); // 목: 5 

	}

}
