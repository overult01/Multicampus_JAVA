package ch15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {
	// FileInputStream: jpg, gif, mp3등 문자가 아닐 때. 영어만 들어간 문서일 때 사용.
	public static void main(String[] args) {
		try {
			System.out.println("======1byte입력=====");
			FileInputStream fi = new FileInputStream("test.txt");
		
		while(true) {
				int result = fi.read();
				if (result == -1 ) {//eof : End Of File 
					break;
				}
				System.out.print((char)result);
			}
			fi.close();
		}
		
		catch(FileNotFoundException e){
			System.out.println("파일이 없습니다.");
		}
		catch(IOException e) {
			e.printStackTrace(); // 에러 원인 확인 
		}
		
		
		// 2바이트로는 한글도 잘 보인다. (전세계 모든 언어를 유니코드로 가능) 
		try {
			System.out.println("======1byte입력=====");
			FileReader fr = new FileReader("test.txt");
		
		while(true) {
				int result = fr.read();
				if (result == -1 ) {//eof : End Of File 
					break;
				}
				System.out.print((char)result);
			}
			fr.close();
		}
		catch(FileNotFoundException e){
			System.out.println("파일이 없습니다.");
		}
		catch(IOException e) {
			e.printStackTrace(); // 에러 원인 확인 
		}
	}

}
