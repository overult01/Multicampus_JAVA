package ch11;
//set : 중복값 불가, 순서유지불가(=인덱스 없음)
import java.util.HashSet;

public class SetTest {
	

	public static void main(String[] args) {
		HashSet set = new HashSet<>();  // 데이터 저장할 수 있는 크기가 가변, 여러가지 타입 저장 가능. (list와 동일)
//		set.get(0);   // set에는 get이 안된다. 인덱스가 없어서(순서 유지 불가)
		System.out.println("100 저장: " + set.add(100)); // true, false로 결과가 나옴. 
		System.out.println("java 저장: " + set.add("java"));
		System.out.println("100삭제: " + set.remove(100));
		// 인덱스 말고 데이터 자체만 매개변수로 이용가능.
		System.out.println("100추가: "+ set.add("java"));
		 // 컴파일오류는 안나지만 안들어감. set은 중복값 허용 불가. 
		// hash set은 데이터 수정이라는 개념이 없다. 
		
		// 객체는 여러번 저장될 수 있다. 사실은 같은 인스턴스들이 아니므로(스택에 저장된 메모리 주소가 다르기 때문)
		System.out.println("사번 100 회사원저장: " + set.add(new Employee(100, "박사원", 360000.55))); // true 
		
		System.out.println("사번 100 회사원저장: " + set.add(new Employee(100, "박사원", 360000.55))); // 또 true 

		
//		Employee타입이면서, 사번을 중복된 데이터를 가질 수 없게 만들려면? (저장무시) 
		// hashcode()메서드 리턴값 동일하면
		// equals() 메서드 true이면
		// 데이터 통일 - 중복 -검사 
		
		// set 데이터를 조회 
		System.out.println(set.size());
		// hash에서는 get메서드 사용 불가 
//		for(int i = 0; i < set.size(); i++) {
//			System.out.println(set.get(i));
//		}
		
		// 향상된 for문. (인덱스를 사용할 수 없는 경우에서의 for문) 
		for(Object o : set) {
			System.out.println(o); // set은 순서가 없다. 따라서 저장한 순서대로 데이터가 출력되지 않는다. 
		}
		
		
		// 제너릭스 : 특정 타입만 저장하도록 <> 안에 지정. 
		// String만 저장할 것이다 
		HashSet<String> set2 = new HashSet<String>();
		set2.add("java");
		set2.add("jsp");
		set2.add("react");
		set2.add("jquery");
		for(String s: set2) {
			System.out.println(s); // set은 순서가 없다. 따라서 저장한 순서대로 데이터가 출력되지 않는다. 
		}
		
		// contains 메서드: set2 내부에서 jsp가 있는지 확인하고 싶다.
		System.out.println(set2.contains("jsp"));  // true

		System.out.println("=================");

		// collection 타입을 배열 결과로 변경
		String [] result = new String[set2.size()];
		set2.toArray(result);  // toArray()메서드. result 배열에 set2를 복사해서 넣어둠.
		for(String s : result) {  
			System.out.println(s);
		}
	}

}
