package ch11;
// 컬렉션 프레임 워크 중 : ArrayList 
import java.util.ArrayList;

class Employee {
	int id;
	String name;
	double pay;
	
	public Employee(int id, String name, double pay) {
		this.id = id;
		this.name = name;
		this.pay = pay;
	}
	
	// toString 메서드 오버라이딩 
	public String toString() {
		return id + "-" + name + "-" + pay;
	}
	
}

public class ListTest {

	public static void main(String[] args) {
		// 배열: 동일 타입 데이터만 저장하는 구조  2. 길이 불변(고정)
		String [] arr = new String[100];
		// ArrayList : 모든 타입의 데이터(기본형 + 라이브러리 클래스 + 사용자 정의 클래스)를 저장할 수 있는 구조.  2.가변 길이.   
		ArrayList list = new ArrayList(5); // (최초 5개 공간 + 부족하면 5개 자동 증가)
//		ArrayList list = new ArrayList(5, 3); // (최초 5개 공간 + 부족하면 3개 자동 증가)
//		ArrayList list = new ArrayList();  // (최초 10개 공간 + 부족하면 10개 자동 증가)
//		

		// list는 순서유지, 데이터 중복 허용. 
		list.add("java");
		list.add(100);
		list.add(3.14);
		list.add("java");
		list.add(100);
		list.add(3.14);
		
		
		Employee e1 = new Employee(100, "박과장", 500000.55);
		Employee e2 = new Employee(100, "김대리", 400000.55);
		Employee e3 = new Employee(100, "최부장", 600000.55);		
		
		list.add(e1); 
		list.add(e2);
		list.add(e3);
		
//		list.remove(0);  // "java" 삭제
//		list.set(0, 200); // 수정. 
		System.out.println(list.size());  // 데이터 개수조회
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 인덱스 값: " + list.get(i)/* .toString() */);  // 객체 자체를 호출하면 toString메서드를 사용하는 결과를 호출하는 것과 같다.
		}
		
		
		System.out.println("================");
		for (Object one /*list내부 데이터 타입*/ : list) {
			System.out.println(one);
		}
		
	}

}
