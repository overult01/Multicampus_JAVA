package ch13;
// 쓰레드 클래스의 join 메서드

class JoinThread extends Thread{
	int i;
	public void run() {
		i = 10; 
		System.out.println("JoinThread에서 i = " + i);
	}
}



public class JoinTest {

	public static void main(String[] args) {
//		JoinThread jt = new JoinThread(); // 쓰레드 생성. 
//		jt.start();  // start메서드는 쓰레드 대기 상태로 만들어 놓음. 메인메서드 실행 -> start메서드 호출 -> 쓰레드 대기 -> 메인메서드 종료 -> run 메서드 호출 
//		System.out.println("main에서 i = " + jt.i);  
//		System.out.println("main종료");  
/* 출력결과 
main에서 i = 0
main종료 
JoinThread에서 i = 10
*/
		
		

		// run 메서드 수행 결과를 출력하고 싶을 때 
		JoinThread jt = new JoinThread(); // 쓰레드 생성. 
		jt.start();  // 즉각 run메서드 실행 아니다.
		try {
			jt.join(); // 특정 쓰레드를 지금 실행 하겠다. (실행 우선순위를 줘라). main메서드 종료 이전에 수행할 수 있다.  
		}
		catch(InterruptedException error) {
			
		}
		System.out.println("main에서 i = " + jt.i);  // main에서 i = 0
		System.out.println("main종료");  // JoinThread에서 i = 10
//		JoinThread에서 i = 10
//		main에서 i = 10
//		main종료

	}

}
