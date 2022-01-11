package day11.lambda;

public class ThreadTest {
	
	public static void main(String[] args) {
				
		Thread[] arr2 = {
				new Thread(()->{
					for (int i = 0; i < 3; i++) {
						System.out.println("음악 듣는 중입니다");		
					}
				})
				,new Thread(() -> {
					for (int i = 0; i < 10; i++) {
						System.out.println("다운로드 중입니다");		
					}
				})
				,new Thread(() -> {
					for (int i = 0; i < 5; i++) {
						System.out.println("뉴스 보는 중입니다");		
					}
				})
		};
		
		for (Thread thread : arr2) {
			thread.start();
		}
		
		
	}
}
