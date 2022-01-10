// 생산자 스레드 클래스
class Producer extends Thread{
	private Buffer blank;
	
	public Producer(Buffer blank){
		this.blank = blank;
	}
	public void run(){
		for(int i = 0; i < 10; i++){
			// 생산자 스레드는 put() 메서드를 호출한다.
			blank.put(i);//생산
			System.out.println("생산자: 생산 "+ i);
			try{
				sleep((int)Math.random() * 100); // sleep(0-100)
			}catch(InterruptedException e) {}
		}
	}
}
// 소비자 스레드 클래스
class Consumer extends Thread{
	private Buffer blank;
	
	public Consumer(Buffer blank){
		this.blank = blank;
	}
	public void run(){
		int value = 0;
		for(int i = 0; i < 10; i++){
			// 소비자 스레드는 get() 메서드를 호출한다.
			value = blank.get();
			System.out.println("소비자: 소비 "+ value);
		}
	}
}
//Buffer 클래스, 데이터, 데이터와 관련된 처리를 담당한다.
class Buffer{
	private int contents;
	private boolean available = false;

	//버퍼에서부터 데이터를 가져가는 메서드, 동기화한다.
	public synchronized int get(){//소비
		while(available == false){
			try{
				wait();
			} catch(InterruptedException e){}
		}
		available = false;//생산 상태 
		notifyAll();
		return contents;
	}
	//버퍼로 데이터를 저장하는 메서드, 동기화한다.
	public synchronized void put(int value){//생산
		while(available == true){
			try{
				wait();
			} catch(InterruptedException e){}
		}
		contents = value;// 0
		available = true;// 생산 데이터 소비 상태
		notifyAll();//wait 중단 스레드 실행 알려줌
	}
}
//생산자와 소비자 스레드를 기동시키는 클래스
public class ProducerConsumer{
	public static void main(String args[]){
		Buffer ch = new Buffer();
		Producer p = new Producer(ch);//ch 객체 공유
		Consumer c = new Consumer(ch);
		p.start();
		c.start();
	}
}