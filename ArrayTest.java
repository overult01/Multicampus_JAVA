package array;

public class ArrayTest {

	public static void main(String[] args) {

		// 배열의 초기화 방법(1): [] 안에 숫자 적지 말고, 아래와 같
		/*
		 * int[] numbers = new int[] {0, 1, 2};
		 

		System.out.println(numbers.length);  //3
		*/
		
		
		// 배열의 초기화 방법(2) : [] 안에 숫자 기입
		int[] numbers = new int[3];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i =0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}

}

