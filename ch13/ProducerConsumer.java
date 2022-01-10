// 생산자 스레드 클래스
class Producer extends Thread{
	private Buffer blank;
	
	public Producer(Buffer blank){
		this.blank = blank;
	}
	public void run(){
		for(int i = 0; i < 10; i++){
			// 생산자 스레드는 put() 메서드를 호출한다.
			blank.put(i);
			System.out.println("생산자: 생산 "+ i);
			try{
				sleep((int)Math.random() * 100);
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
	public synchronized int get(){
		while(available == false){
			try{
				wait();
			} catch(InterruptedException e){}
		}
		available = false;
		notifyAll();
		return contents;
	}
	//버퍼로 데이터를 저장하는 메서드, 동기화한다.
	public synchronized void put(int value){
		while(available == true){
			try{
				wait();
			} catch(InterruptedException e){}
		}
		contents = value;
		available = true;
		notifyAll();
	}
}
//생산자와 소비자 스레드를 기동시키는 클래스
public class ProducerConsumer{
	public static void main(String args[]){
		Buffer ch = new Buffer();
		Producer p = new Producer(ch);
		Consumer c = new Consumer(ch);
		p.start();
		c.start();
	}
}