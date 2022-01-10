package test;

import java.util.ArrayList;
import java.util.List;
// 배열은 고정길이. 
class SameSentence {


	// compare 메서드 
	String[] compare(List<String> list1, List<String> list2){
		
		// 동일 값 저장용
		ArrayList<String> resultList = new ArrayList();

		// 참고자료 : https://mommoo.tistory.com/32
		int len1 = list1.size();
		int len2 = list2.size();
		if (len1 > len2) {
			len1 = len2;   // len1만큼만 비교하기 위해 
		}
		
		// list1과 list2 저장 데이터 갯수 비교한다
		//갯수 일치하면 list1, list2 모든 데이터를 각 인덱스별 비교하며 동일하면
        //String 배열 저장하고 리턴

		//갯수 일치하지 않으면 list1, list2 더 작은 갯수의 list 갯수만큼 데이터를 각 인덱스별 비교하며 동일하면
        //String 배열 저장하고 리턴
		
		for (int i =0; i < len1; i++) {
			if (list1.get(i).equals(list2.get(i))) {
				resultList.add(list1.get(i)); // 리스트를 인덱스로 조회하려면 : get(인덱스) 메서드
			}
		}
				
		//ArrayList -> 배열로 바꾸기 : toArray메서드 사용. 제너릭스가 선언 안되어있으면 Object타입, 선언되어있으면 그 타입으로 반환해준다.
		String[] resultArray = new String[len1];  // 배열의 길이는 len1만큼 생성.
		resultList.toArray(resultArray);

		return resultArray;
	}	
}

public class SameSentenceTest {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("자바는 객체지향 언어입니다");
		list1.add("우리는 멀티캠퍼스에서 자바를 배우는 중입니다");
		list1.add("오늘은 컬렉션 프레임워크를 배우죠! ");
		list1.add("내일은 스레드를 배울 예정입니다 ");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("자바는 객체지향 언어입니다");
		list2.add("우리는 multi에서 자바를 배우는 중입니다");
		list2.add("오늘은 콜렉션 프레임워크를 배우죠! ");
		list2.add("내일은 스레드를 배울 예정입니다 ");
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("자바는 객체지향 언어입니다");
		list3.add("우리는 멀캠에서 자바를 배우는 중입니다");
		list3.add("오늘은 컬렉션 프레임워크를 배우죠! ");
		
		SameSentence ss = new SameSentence();
		System.out.println("list1, list2에서 같은 내용을 출력합니다");
		String[] first = ss.compare(list1, list2);
		for (String s: first) {  // 향상된 For문
			if (s != null) {
				System.out.println(s);
			}
		}
	/*
	자바는 객체지향 언어입니다
	내일은 스레드를 배울 예정입니다 
	*/
		System.out.println("================================");
		System.out.println("list1, list3에서 같은 내용을 출력합니다");
		String[] second = ss.compare(list1, list3);
		for (String s: second) {
			if (s != null) {
				System.out.println(s);
			}
		}
	/*
	자바는 객체지향 언어입니다
	오늘은 컬렉션 프레임워크를 배우죠!
	*/

	}

}