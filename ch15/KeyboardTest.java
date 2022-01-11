package ch15;

import java.io.IOException;

// 입출력(I/O)
class KeyboardTest {

	public static void main(String[] args) {
		// 더 이상 입력문자 없을 때까지 계속 입력 
		try {
			while(true) {
			int onekey = System.in.read();  // 1바이트 밖에 못읽어온다.(2^8=256 코드문자까지) 따라서 한글은 2byte이므로 못읽어온다.  
			if (onekey == '\n') break; // 엔터키를  입력을 중단한다는 의미이다. 
			System.out.println((char)onekey);
			}
			// 한글입력 불가능하다는 문제점 
		}
		catch(IOException error) {
			error.printStackTrace();
		}
	}

}
