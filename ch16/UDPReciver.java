package client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// UDPReciver 먼저 실행. 어떤 포트에서 받을지 알려줘야 해서.
public class UDPReciver {

	public static void main(String[] args) throws Exception {
//		// DatagramSocket 만들기 
//		DatagramSocket receiver = new DatagramSocket(40000);  // 40000번 포트에서 받겠다
//		System.out.println("수신 시작");
//		
//		// 비어있는 DatagramPacket 생성 
//		byte[] b = new byte[100]; // 100은 임의로 크기 설정한 것.
//		DatagramPacket data = new DatagramPacket(b, b.length); //DatagramPacket은 기본 생성자가 없다. 그래서 비어있는 바이트 배열을 만든 것이다. 
//		// 한글이 들어가면 33자만 들어감(한글은 3byte)
//
//		receiver.receive(data);		
//		b = data.getData();
//		
//		// sender에서 보낸 메세지 보기 위해서 String 으로 다시 변환.
//		String receiveddata = new String(b);
//		System.out.println(receiveddata + "내용을 " + data.getAddress());
//		
//		System.out.println("수신 종료");
//		receiver.close();
		DatagramSocket receiver = new DatagramSocket(40000);
		System.out.println("수신 시작");
		//비어있는 DatagramPacket 생성
		byte b[]= new byte[100];
		DatagramPacket data = new DatagramPacket(b , b.length);//한글 33자
		
		receiver.receive(data);
		//b = data.getData();
		String receiveddata = new String(b);
		System.out.println(receiveddata + "내용을  " + data.getAddress());
		
		System.out.println("수신 종료");
		receiver.close();
	
	}

}
