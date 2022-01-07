package test;

import java.util.ArrayList;
import java.util.List;
// 배열은 고정길이. 
class SameSentence {

	SameSentend(list1, list2) {
		
	}

	// compare 메서드 
	String[] compare(List<String> list1, List<String> list2){
		

		// 리스트 만들고 -> 배열로 바꾸기
		// 참고자료 : https://mommoo.tistory.com/32
		List list = new ArrayList();
		if (list1.size() == list1.size()) { // 사이즈 확인 
			for (int i = 0; i < list1.size(); i ++) {
				if (list1.get(i) == list2.get(i)) {  // 리스트를 인덱스로 조회하려면 : get(인덱스) 메서드
					list.add(list1.get(i));
				}
			}
		}
		
		else {
			int len = 0;
			if (list1.size() >= list2.size()) {
				len = list2.size();
			}
			else {
				len = list1.size();
			}
			
			for (int i = 0; i < len; i ++) {
				if (list1.get(i) == list2.get(i)) {  // 리스트를 인덱스로 조회하려면 : get(인덱스) 메서드
					list.add(list1.get(i));
				}
			}
		}
		
		//ArrayList -> 배열로 바꾸기 .
		String[] array = (String[]) list.toArray(new String[list.size()]);

		// list1과 list2 저장 데이터 갯수 비교한다
		//갯수 일치하면 list1, list2 모든 데이터를 각 인덱스별 비교하며 동일하면
                            //String 배열 저장하고 리턴

		//갯수 일치하지 않으면 list1, list2 더 작은 갯수의 list 갯수만큼 데이터를 각 인덱스별 비교하며 동일하면
                            //String 배열 저장하고 리턴
		return array;
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
		ss.compare(list1, list2);
	/*
	자바는 객체지향 언어입니다
	내일은 스레드를 배울 예정입니다 
	*/
		System.out.println("================================");
		System.out.println("list1, list3에서 같은 내용을 출력합니다");
		ss.compare(list1, list3);
	/*
	자바는 객체지향 언어입니다
	오늘은 컬렉션 프레임워크를 배우죠!
	*/

	}

}