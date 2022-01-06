package ch9;

public class StringTest1 {

	public static void main(String[] args) {
		// String인스턴스의 내용은 바꿀 수 없다(immutable) 
		String a = "abc"; // a: 100번지 (스택에서)
		String b = "def"; // b: 200번지 (스택에서)
		a = a + b; // 힙에 300번지 생성 후 변수 a가 300번지를 가리키게 한다. & 이후 힙의 100번지(&그안의 "abc")는 자동삭제된다. 

		
		char c [] = {'a', 'b', 'c', 'd'};
		// String 변환 
		String sc = new String(c);
		System.out.println(sc);
		System.out.println(sc.equals("abcd"));
		
		byte by[] = {65, 66, 67, 68};
		// 숫자와 대응되는 문자로 변환 (유니코드 혹은 아스키 코드)
		// 유니코드로 A는 65
		String sb = new String(by);
		System.out.println(sb);
	}
	
}
