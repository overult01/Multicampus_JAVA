package ch4;

public class GugudanTest {

	public static void main(String[] args) {

		// 2단 출력 (for 문)
		for ( int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				if( dan == 5 ) {
					continue; // 단이 5이면 출력 안한다 
//					break; // 4딘 까지만 출력한다. 
				}
				System.out.print( dan+ "*" + i + "=" + dan * i + "\t" );  // \t: 공백을 맞추는 효과				 
			}
			System.out.println();
		}
		
	}

}
