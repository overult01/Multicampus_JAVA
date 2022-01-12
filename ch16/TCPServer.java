package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 서버 소캣 클래스, tcp 방식의 서버 <> 클라이언트통신 예제 

// 서버 특징: 클라이언트보다 먼저, 항상 실행중(무한대 실행지속이 되어야 하는 것: demon), 여러개 클라이언트의 요청을 처리 

public class TCPServer {  

	public static void main(String[] args) {
		try {
			// 1. 서버 시작(= ServerSocket 생성)
			ServerSocket ss = new ServerSocket(50000);  //포트번호 지정
			System.out.println("[===서버: 50000포트에서 시작===]");
			
			int cnt = 0;
			
			while(true) {  // 죽지 않는 서버. 
				Socket s = ss.accept();
				System.out.println("[===서버: 클라이언트와 연결===]");
				
				// 읽어올 때 코드 
				InputStream is = s.getInputStream();
				Scanner sc = new Scanner(is); // Scanner도 2byte처리를 위한 보조.
				System.out.println("[===서버: 클라이언트로부터 받은 인사말===" + sc.nextLine() +"]");  // \n 나오면 한 줄로 인식 
				
				// 보낼 때 코드
				OutputStream o = s.getOutputStream();  // 서버에서 클라이언트로 응답 전송. 
				PrintStream p = new PrintStream(o);  // OutputStream은 1byte만 출력할 수 있어서, 보조를 위해 타입변경. (2byte인 char, 객체인 String 도 가능)
				p.print("클라이언트님도 안녕하신가요?\n"); // 보낼 메세지 
				System.out.println("[===서버: 클라이언트로 인사말 출력===]");
				p.flush(); // 버퍼에 데이터가 가득 차있는지 여부와 관련 없이 한 번에 쏟아내는. 
				
				s.close();
				System.out.println("[===서버: " + s.getInetAddress().getHostAddress() /*나랑 연결된 클라이언트의 ip*/+ "클라이언트와 연결 해제===]"); // 이 경우 서버 <> 클라이언트 간 연결만 해제. 서버는 아직 살아있다
				
				if(cnt > 5 /*서버 종료 조건을 주려고. true는 임시*/) {
					ss.close();  // 서버를 죽임
					System.out.println("[===서버: 서버 종료===]");
					
				}
				cnt += 1;
			}
		}
		catch (IOException error) {
			error.printStackTrace();  // 에러 원인 확인하라
		}
		
	}

}
