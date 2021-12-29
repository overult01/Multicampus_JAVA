package array;

public class TwoDimensionArr {
// 다차원 배열 중에서 '2차원 배열'.
// 2차원 배열은 1차원 배열이 여러개가 있다는 것으로 이해하면 됨 
	public static void main(String[] args) {

		/*
		 *  배열의 선언
		 *  int[][] arr = new int[2][3]; 
		 */  		
		
		
		// 2차원 배열의 선언 & 초기화 
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};  // 2행 3열 구조
		
		// '행'의 길이 : arr.length
		System.out.println(arr.length); // 2 출력. 2차원 배열의 길이는 '행의 길이'

		// '열'의 길이 : arr[i].length
		System.out.println(arr[0].length);  // 3 출력. 
		System.out.println(arr[1].length);  // 3 출력. 

		System.out.println("===================");
		// 2차원 배열의 전체 요소 모두 출력 : 2중 for 문 사용
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);  // (0,0) ~ (0,2) 출력한 뒤 (1,0) ~ (1,2) 출력 
			}
		}
		
	}

}
