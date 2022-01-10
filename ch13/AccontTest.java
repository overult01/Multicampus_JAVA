package ch13;

// 쓰레드 동기화: synchronized
// 1개의 쓰레드가 실행중이면 다른 쓰레드가 접근하면 안되는 메서드 앞에 synchronized를 붙인다.

class Account {  // 5개 쓰레드에서 공유되는 객체 (메인 메서드에서 확인 할 수 있다) 
	String name; // 고객명
	int total; // 총액 
	
	Account(String name) {
		this.name = name;
	}

	// deposit메서드를 실행하고 total을 출력하 때까지 다른 쓰레드가 끼어들지 못하게 하고 싶다. 
	synchronized void deposit(int money, String loc) { // 입금액, 지점명
		total += money;
		System.out.println("[" +loc + "]" + money + " 입급 후 [ 총액 : " + total + "]");
	}
}

// 각 지점명을 멀티 쓰레드로 만들 것.
class CustomerThread extends Thread{
	Account ac;
	public CustomerThread(Account ac, String name ) { // 계좌, 지점명 
		super(name);
		this.ac = ac;
	}
	
	public void run() {
		int money = (int)(Math.random() * 1000); // 입금액을 난수로 발생시킴 
		ac.deposit(money, getName());  // getName(): super에 매개변수로 가져왔던 name을 가져올 수 있다.
	}
}

public class AccontTest {

	public static void main(String[] args) {
		Account acc = new Account("인터넷쇼핑몰");
		CustomerThread[] ct = new CustomerThread[5];  // 5명의 고객이 이 인터넷 쇼핑몰에서 물건을 샀다고 가정.
		
		// 5개의 쓰레드가 acc 공유해서 사용할 수 있게 만들어 놓은 것. 
		// 결과로 나온 총액이 뒤죽박죽이다. (특정 스레드가 일시 중단되면서 잠깐 밀림. 그 사이에 다른 스레드들이 run되어서 결과가 꼬임) 
		ct[0] = new CustomerThread(acc, "강남고객");
		ct[0].start();
		ct[1] = new CustomerThread(acc, "구로고객");
		ct[1].start();
		ct[2] = new CustomerThread(acc, "인천고객");
		ct[2].start();
		ct[3] = new CustomerThread(acc, "마포고객");
		ct[3].start();
		ct[4] = new CustomerThread(acc, "제주고객");
		ct[4].start();
		
		// 1개의 쓰레드가 deposit메서드를 실행하고 끝날 때까지 그 쓰레드는 중단되는 일이 없도록 해야한다. -> deposit메서드 앞에 synchronized 붙이기. 
	}

}
