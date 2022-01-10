package threadtest;

// 멀티 쓰레드 실습 

class MusicThread extends Thread{

	// 생성자(매개변수 전달위해) 
	MusicThread (String name) {	
		
		super(name); // Thread클래스에 String 전달(쓰레드 이름 지정 위해서)
	}
	
	// 상속받고, 오버라이딩 - 음악듣는 중입니다 3번 출력 
	@Override
	public void run() {  // Thread의 run 함수는 오버라이딩 필수이다. 
		for (int i = 0; i < 3; i++) {
			System.out.println("음악듣는 중입니다");			
		}
		
	}	
}

class DownloadThread extends Thread{

	DownloadThread (String name) {
		super(name);
	}
	
	// 상속받고, 오버라이딩 - 다운로드 중입니다 10번 출력 	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("다운로드 중입니다");			
		}
	}	

}

class NewsThread extends Thread{
	
	NewsThread(String name) {
		super(name);
	}
	
	// 상속받고, 오버라이딩 - 뉴스보는 중입니다 5번 출력 	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("뉴스보는 중입니다");			
		}
	}	

}

public class ThreadTest {

	public static void main(String[] args) {
		Thread arr[] = new Thread[3]; // 쓰레드 타입으로 배열 생성

		// Thread타입(부모 클래스 타입)으로 자동형변환된 상태 
		arr[0] = new MusicThread("음악스레드"); // 쓰레드에 사용자 지정 이름
		MusicThread thread1 =(MusicThread)(arr[0]);
		
		arr[1] = new NewsThread("뉴스스레드");
		NewsThread thread2 =(NewsThread)(arr[1]);
		
		arr[2] = new DownloadThread("다운로드스레드");
		DownloadThread thread3 =(DownloadThread)(arr[2]);
		
		/*3개 스레드 시작 메서드 호출*/
		/*음악듣는 중입니다
		 * 다운로드 중입니다
		 * 뉴스보는 중입니다.  뒤섞여서 출력 */
		
		// 명시적 형변환: 하위 클래스의 run 메서드 사용위해. Thread클래스의 start 메서드 
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("main 메서드 종료");
	}

}

// 2. 인터페이스 runnable 내부에는 run 메서드 하나 뿐 (함수형 인터페이스) -> 람다식 변형
