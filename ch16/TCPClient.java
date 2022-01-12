package client;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
//TCP 서버와 연결하는 TCP 클라이언트 예제 
import java.util.Scanner;

// 클라이언트 클래스를 먼저 실행하면 ConnectException 발생. 서버가 시작되지도 않았으니. (접속하려는 ip, port번호에 해당하는 주소가 없다) 
public class TCPClient {

	public static void main(String[] args) throws Exception{
//		2. 서버접속(TCP서버 클래스와 연결) : 현재 내 컴퓨터로 서버, 클라이언트 구현중. 따라서 IP주소를 localhost로 쓸 수 있다. 
		Socket s = new Socket("localhost" /* IP주소 */, 50000  /*포트 번호 (서버클래스의 포트번호와 같아야)*/);
		System.out.println("[===클라이언트: 서버와 접속===]");
		
		// 보낼 때 코드
		OutputStream o = s.getOutputStream();
		PrintStream p = new PrintStream(o);  // OutputStream은 1byte만 출력할 수 있어서, 보조를 위해 타입변경. (2byte인 char, 객체인 String 도 가능)
		p.print("안녕 hello 서버님\n");
		System.out.println("[===클라이언트: 서버로 인사말 출력===]");
		p.flush(); // flush 메서드: print 메서드의 출력 문자열이 클라이언트 임시 메모리에만 저장되어 있는 상태. (여러개 일수도 있으니 모아서) 한 번에 내보내기 <- flush
		
		// 읽어올 때 코드 
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is); // Scanner도 2byte처리를 위한 보조.
		System.out.println("[===클라이언트: 서버로부터 받은 인사말===" + sc.nextLine() +"]");

		
		s.close();  // 서버와 연결끊기
		System.out.println("[===클라이언트: 서버와 접속 해제===]");
	}

}

