package client;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient2 {

	public static void main(String[] args) throws Exception{
		//2> 서버 접속(127.0.0.1 == localhost) ==> 현재 내컴퓨터의 ip
		Socket s = new Socket("70.12.113.167", 60000);
		System.out.println("[==클라이언트 : 서버와 접속==]");
		
		//키보드 아이디 암호 2개 입력받아서 
		Scanner keyboard = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = keyboard.next();
		System.out.print("암호 : ");
		String pw = keyboard.next();
		
		//서버로 출력
		OutputStream o = s.getOutputStream();
		PrintStream p = new PrintStream(o);
		p.print(id + " " + pw + "\n");//java web엔터키
		p.flush(); //print 메소드 출력문자열 - 클라이언트 임시메모리만 저장 - 한번에 서버로 내보내기 
		
		System.out.println("[==클라이언트 : 서버로 로그인정보 출력 ==]");
				
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		System.out.println("[==클라이언트 :  서버로부터 받은 로그인 결과 ==]" + sc.nextLine() );
		
		
		s.close();
		System.out.println("[==클라이언트 : 서버와 접속해제==]");
	}

}
