package ch6;

// 재귀호출 예제 

class Math {
	int factorial(int n) {
		int result = 1;

//		재귀 예시 
//		if( n == 1 ) {
//			result = 1;
//		}
//		else {
//			result = n * factorial(n - 1);			
//		}
		
		// 모든 재귀는 반복문으로 바꿀 수 있다 
		for (int i = n; i > 0; i--) {			
			result *= i;
		}
		return result;
	}
}

public class FactorailTest {

	public static void main(String[] args) {
		
		Math m = new Math();
		int facResult = m.factorial(5);
		System.out.println(facResult);
	}
}
