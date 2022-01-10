package ch13;

// 멀티쓰레드 구현

class MyThread1 extends Thread /*1. 쓰레드 상속받는다*/{

	// 쓰레드에 사용자 지정 이름을 붙여주기 위해. 
	MyThread1(String name) {
		super(name);  // 부모 클래스인 Thread의 생성자(= Thread(String) )에 String을 전달한다. 
	}
	
	// 2.run 메서드 오버라이딩 
	@Override
	public void run() {
		System.out.println(getName());  // 쓰레드 클래스 내 getName메서드. 자동으로 쓰레드의 번호를 붙여준다. // Thread-0
		for (int i = 0; i < 100; i++) {
			System.out.print("!");
		}
	}

}

class MyThread2 extends Thread /*1. 쓰레드 상속받는다*/{
	
	MyThread2(String name) {
		super(name);  // 부모 클래스인 Thread의 생성자에 String을 전달한다. 
	}

	
	// 2.run 메서드 오버라이딩 
	@Override
	public void run() {
		System.out.println(getName());  // 쓰레드 클래스 내 getName메서드.  자동으로 쓰레드의 번호를 붙여준다. // Thread-1  
		for (int i = 0; i < 100; i++) {
			System.out.print("#");
		}
	}

}


public class ThreadTest {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("사용자가 이름 지정 1");
		MyThread2 t2 = new MyThread2("사용자가 이름 지정 2");
		t1.start(); // 3. 쓰레드의 run 메서드 호출.
		t2.start(); // 섞이면서 출력된다. 순서없이 출력된다. (멀티 쓰레드) 
		System.out.print("main 종료"); // t1, t2, main스레드까지 3개의 멀티 스레드로 실행된다. 
		
		
	}

}

