package ch11;
import java.util.ArrayList;
// map: key- value 형식. get(키)로 값 조회 가능.
import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();  // 타입은 여러가지, 가변길이 (list, set, map 공통점)
		// 다양한 타입 사용 가능.
		map.put("aa", 11);
		map.put(1234, 22);
		map.put("dd", new Employee(33, "이름", 123.55));

		// 제너릭스: 타입 통일. (아이디는 String, 비번은 int)
		HashMap<String, Integer> map2 = new HashMap();
		map2.put("aa", 11); // 저장 
		map2.put("aa", 22); // 수정(set은 중복이면 무시, map은 키가 중복이면 수정) 
		map2.put("bb", 22);
		map2.put("dd", new Employee(11, "이름", 123.55).hashCode());

		// aa, dd 의 암호 출력 (value는 중복 가능)
		System.out.println(map.get("aa"));
		System.out.println(map.get("dd"));
		System.out.println("map의 저장 데이터 개수: " + map.size());
		
		System.out.println(map.get("ee")); // null. "ee"라는 키가 없어서 조회될 것이 없다. 
		if(map2.containsKey("ee"))  { // 키 중에 ee가 있는지 확인
			System.out.println( ( map2.get("ee")).intValue() ); // null. "ee"라는 키가 없어서 조회될 것이 없다. 
		}
		else {
			System.out.println("가입한 적이 없습니다.");
		}
		
		// 모든 회원 아이디와 암호 조회
		// 아이디 - map key값 조회
		// 암호 - map 해당 key value 값 조회.
		Set<String> ids = map2.keySet(); // key만 모아서 set형태로 반환(왜냐면 map의 key는 중복 x)
		for(String oneid : ids) {
			System.out.println(oneid + " : " + map.get(oneid));
		}
		
		System.out.println("=========");
		HashMap<Integer, Employee> map3 = new HashMap<Integer, Employee>();
		map3.put(1, new Employee(1, "사원1", 12300.0));
		
		// 전화번호부 만들어보기 
		HashMap<String, String[]> map4 = new HashMap<String, String[]>();
		map4.put("내친구", new String[]{"010-111-2222", "02-456-7890", "031-999-1234", "a@gmail.com"});
		map4.put("엄마", new String[]{"010-111-2222", "02-666-7890"});
		map4.put("직장동료", new String[]{"010-999-2222", "031-000-1234", "b@gmail.com"});
		// 명령행 매개변수로 직장동료를 입력시 3가지 나머지 데이터를 엔터로 구분하여 출력.
//		args[0] == map4.
		if(map4.containsKey(args[0])) {
			String[] phone= map4.get(args[0]);
			for(String p : phone) {
				System.out.println(p);
			}
		}
		else {
			System.out.println("폰정보는 없습니다. ");
		}
		
		// 폰정보 리스트 관리
		ArrayList<HashMap<String, String[]>> mapList = new ArrayList<HashMap<String, String[]>>(); //ArrayList안에 들어가야 하는 타입은 해쉬맵이다. 해쉬맵에는 String 타입이 들어가야 한다.  
		// 이제 list메서드 사용 가능. 
	}

}
