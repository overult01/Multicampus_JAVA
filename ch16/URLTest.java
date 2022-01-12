package ch16;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

// URL클래스 (java.net.URL)

// 사이트의 소스코드 보는 예제 
public class URLTest {

	public static void main(String[] args) {

		URL site;
		try {
			site = new URL("https://lc.multicampus.com/kdt-venture/#/login"); // 접속하면 서버: 구글 // 클라이언트: 자바 코드 
			InputStream is = site.openStream();
			System.out.println((char)is.read());
			Scanner scanner = new Scanner(is);
			
			// stream에서는 끝을 -1로 표시(키보드로 사용자가 끝 요청, 서버 결과 끝 모두) 
			while (scanner.hasNextLine() /* == true */) {  // 스캐너 클래스의 hasNextLine()메서드: 다음줄에 읽을 것이ㅣ 있는지르르 Boolean반환. 
				System.out.println(scanner.nextLine());  // 1줄씩 입력받기
				// 파일에 출력도 가능.
			}
			
			System.out.println("===================================");
			System.out.println(site.getHost());  // 도메인명: lc.multicampus.com
			System.out.println(site.getPort());  // -1이 나오면 포트번호는 없다는 뜻. 
			System.out.println(site.toURI());
			System.out.println(site.getProtocol());  // 프로토콜은 http 혹은 Https.
			
		} catch (Exception e) {  // MalformedURLException: 이런 url은 없다. (접근 불가) 
			e.printStackTrace();   			// IOException: 입출력할 때는 항상 발생한다. 

		} 

	}

}
