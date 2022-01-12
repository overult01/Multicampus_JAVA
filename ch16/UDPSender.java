package client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {
	public static void main(String args[]) throws Exception {
	DatagramSocket sender = new DatagramSocket();
	System.out.println("발신 시작");
	String other = "공지사항을 전달합니다.";
	byte b[] = other.getBytes();
	DatagramPacket data = new DatagramPacket(b, b.length, InetAddress.getLocalHost(), 40000);
	sender.send(data);
	System.out.println("발싱 종료");
	sender.close();
	
	}
}
