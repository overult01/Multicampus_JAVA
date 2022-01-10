package runnable;

//멀티쓰레드 구현(runnable)
// 다중상속을 해야할 때는 인터페이스 사용위해 Runnable 이용한다.

class MyThread1 implements Runnable /*1. 쓰레드 상속받는다*/{
	
	// 2.run 메서드 오버라이딩 
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print("!");
		}
	}

}

class MyThread2 implements Runnable {
	
	// 2.run 메서드 오버라이딩 
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print("#");
		}
	}

	void m1() {
	}
}


public class ThreadTest {

	public static void main(String[] args) {
		
		// 3. Runnable 타입 객체 생성 
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		// 4. Thread 타입 객체 변환 (이 부분만 다르다) 
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		
		
		tt1.start(); // 5. 쓰레드의 run 메서드 호출.
		tt2.start(); // 섞이면서 출력된다. 순서없이 출력된다. (멀티 쓰레드) 
		System.out.print("main 종료"); // t1, t2, main스레드까지 3개의 멀티 스레드로 실행된다. 
		
		
	}

}

