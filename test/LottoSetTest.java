package test;
// HashSet 예제
// Set은 중복 X인 점 활용. 
import java.util.HashSet;

public class LottoSetTest {

	public static void main(String[] args) {
		HashSet<Integer> lottoset = new HashSet();
		//lottoset에 1-45 사이의 중복되지 않는 로또 숫자 6개를 생성하여 저장하고 출력한다.
	             //  1 45 23 33 44 45 2
		while (lottoset.size() < 6) {
			int number = (int)(Math.random()* 45 + 1); // 1~45
			lottoset.add(number);
		}		
		System.out.println(lottoset);
	} 
}
