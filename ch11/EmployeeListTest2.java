package ch11;
// 컬렉션 프레임 워크 중 : ArrayList 
import java.util.ArrayList;


public class EmployeeListTest2 {

	public static void main(String[] args) {
		// Employee 타입 데이터저장 의도로 list를 알려주었다. 다른 타입 삽입시 컴파일 오류.
		ArrayList<Employee> list = new ArrayList<Employee>(5);
		// Employee 객체들이 아닌 값들은 저장하지 못함 
//		list.add("java");
//		list.add(100);
//		list.add(3.14);
//		list.add("java");
//		list.add(100);
//		list.add(3.14);
		
		
		Employee e1 = new Employee(100, "박과장", 500000.55);
		Employee e2 = new Employee(100, "김대리", 400000.55);
		Employee e3 = new Employee(100, "최부장", 600000.55);		
		
		list.add(e1); // 자동형변환(Employee 타입 -> Object 타입) 
		list.add(e2);
		list.add(e3);
		
		System.out.println(list.size());  // 데이터 개수조회
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 인덱스 값: " + list.get(i)/* .toString() */);  // 객체 자체를 호출하면 toString메서드를 사용하는 결과를 호출하는 것과 같다.
		}
		
		
		System.out.println("================");
		for (Employee one /*list내부 데이터 타입*/ : list) { 
			System.out.println(one);
			}
		}
		
}

