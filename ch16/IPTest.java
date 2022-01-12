package ch16;

import java.net.InetAddress;
import java.net.UnknownHostException;

// INetAdress 클래스 사용 

public class IPTest {

	public static void main(String[] args) throws UnknownHostException{
		// 내 컴퓨터 ip 주소
		InetAddress myip = InetAddress.getLocalHost();  // 로컬 호스트는 내 컴퓨터.
		System.out.println("컴퓨터 이름 = "+ myip.getHostName());
		System.out.println("ip = " + myip.getHostAddress());

		// http://google.com 접속 -> 나는 클라이언트, 구글은 서버.
		// 도메인: 문자로 메이저 서버에 이름을 붙여둔 것. 따라서 ip주소를 몰라도 접속할 수 있다. 도메인도 전세계에서 유일하다. 여러 컴퓨터에 1개의 도메인을 등록할 수도 있다. 
		
		// 구글의 ip주소를 알아보자
		// 구글의 서버는 어려대에 동일한 도메인을 부여하고 있다.
		InetAddress[] serverip = InetAddress.getAllByName("google.com");
		for(InetAddress oneip: serverip) {
			System.out.println("구글서버 = " + oneip.getHostAddress());

		}
	}
}
