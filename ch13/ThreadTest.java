package ch13;

// 멀티쓰레드 구현(runnable)

class MyThread1 extends Thread /*1. 쓰레드 상속받는다*/{
	
	// 2.run 메서드 오버라이딩 
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print("!");
		}
	}

}

class MyThread2 extends Thread /*1. 쓰레드 상속받는다*/{
	
	// 2.run 메서드 오버라이딩 
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print("#");
		}
	}

}


public class ThreadTest {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start(); // 3. 쓰레드의 run 메서드 호출.
		t2.start(); // 섞이면서 출력된다. 순서없이 출력된다. (멀티 쓰레드) 
		System.out.print("main 종료"); // t1, t2, main스레드까지 3개의 멀티 스레드로 실행된다. 
		
		
	}

}

