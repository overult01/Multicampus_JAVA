package test;
// HashSet 예제
// Set은 중복 X인 점 활용. 
import java.util.HashSet;
import java.util.Random;

public class LottoSetTest {

	public static void main(String[] args) {
		HashSet<Integer> lottoset = new HashSet();
		//lottoset에 1-45 사이의 중복되지 않는 로또 숫자 6개를 생성하여 저장하고 출력한다.
	             //  1 45 23 33 44 45 2
		// set은 중복된 값이 추가되면 무시한다. (set: 중복 x, 순서 x) 
		while (lottoset.size() < 6) {
//			int number = (int)(Math.random()* 45 + 1); // 1~45
			Random randomNumber = new Random();
			int number = randomNumber.nextInt(46);  // 위의 (int)Math.random()*45 + 1 와 동일한 역할 
			lottoset.add(number);
		}		
		System.out.println("로또번호: ");
		for (Integer i : lottoset) {
			System.out.println(i);
		}
	} 
}
