package array;

public class ArrayTest3 {

	public static void main(String[] args) {

		// 예시: alphabets Array에 A부터 Z 까지 다 넣어보아라. 
		// 이렇게 문자 배열도 사용할 수 있다. 근데 매번 이렇게 만들어서 사용하기가 번거로우므로, 자바에서 제공하는 String 에서 이가 구현되어 있다. 
		char[] alphabets = new char[26];
		char ch = 'A';  // 알파벳 A는 숫자로 65 
		
		for(int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		
		for(int i = 0; i < alphabets.length; i++, ch++) {
			System.out.println(alphabets[i]);
		}
		
	} 

}