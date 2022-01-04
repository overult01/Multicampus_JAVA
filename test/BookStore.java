package test;

// 제한자
// 생성자 예제(21/21/31) 
import java.util.ArrayList;

//class Book -->작성
//Book 클래스의 제약조건
//1. 책 제목(title)과 가격(price)정보를 저장하는 필드변수가 있어야 한다.
//2. 필드변수는 모두 private 접근제한자를 가져야 한다. 
//3. 필드변수를 모두 초기화하는 생성자가 있어야 한다.
//( main 메소드 Book객체생성 문장 오류 발생 x:
//생성자 추가)
//4. 필드변수에 값을 설정하고 리턴하는  setter/getter 메서드가 있어야 한다.
//setTitle(String title) : 멤버변수 title 값을 셋팅하는 메소드
//String getTitle() : 멤버변수 title 값을 반환하는 메소드
//void setPrice(int price) : 멤버변수 price 값을 셋팅하는 메소드
//int getPrice() : 멤버변수 price 값을 반환하는 메소드 
//5. setter/getter 메서드는 모두 public 접근제한자를 가져야 한다. 

class Book {
	private String title;
	private int price;	

	
	// 3번 역할
	// 생성자 오버로딩 
	public Book(String title, int price) {
//		super(); // 자바의 모든 클래스는 첫문장에 상위클래스의 생성자(매개변수 없는)를 자동호출(즉, 생략도 가능) 
		this.title = title;
		this.price = price;
	}

	public Book() {
		super();
	}

	// private 이 붙은 인스턴스를 위한 getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

//BookMgr mgr = new BookMgr(booklist);
//System.out.println("=== 책 목록 ===");
//mgr.printBookList();
//System.out.println("");
//System.out.println("=== 책 가격의 총합 ===");
//mgr.printTotalPrice();


//class BookMgr -->작성
//BookMgr 클래스의 제약조건 
//1. 책(Book) 객체 여러 개를 저장할 수 있는 
//책 목록(booklist)이라는 배열을 필드변수로 가져야 한다. 
//2. 책 목록(booklist)이라는 배열 변수를 
//초기화하는 생성자를 작성해야 한다. 
//3. 책 목록을 화면에 출력하는 printBookList() 
//메서드가 있어야 한다. 
//4. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다. 
class BookMgr {
	
	Book[] booklist; // Book 객체만 저장할 배열 타입
	
	BookMgr(Book[] booklist) {  // 메인메서드에서 BookMgr mgr = new BookMgr(booklist); 로 매개변수 전달 .
		this.booklist = booklist; 
	}
	
	void printBookList() {
		for (int i = 0; i < booklist.length; i++) {
			System.out.println(booklist[i].getTitle());  // booklist[i]들은 book객체들이다 . title은 private이 붙은 변수이므로 getter로 접근.
		}
	}
	
	void printTotalPrice() {
		int total = 0;  // printTotalPrice 메서드의 지역변수. 지역변수는 반드시 초기화해주어야.(자동 초기화 불가) 
		for (int i = 0; i < booklist.length; i++) {
			total += booklist[i].getPrice();
		}
		System.out.println("현재 책 가격의 합: " + total);
		
	}
	
}

public class BookStore {

	public static void main(String[] args) {

		Book booklist[] = new Book[5]; // 객체들도 일종으 클래스 타입이다. 따라서 모든 클래스는 배열의 타입이 될 수 있다.  

		Book book1 = new Book("Java Program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundamentals", 30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book();
		book5.setTitle("EJB Program");
		book5.setPrice(34000);
		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;
		
		BookMgr mgr = new BookMgr(booklist);
		System.out.println("=== 책 목록 ===");
		mgr.printBookList();
		System.out.println("");
		System.out.println("=== 책 가격의 총합 ===");
		mgr.printTotalPrice();

	}

}

//[실행결과]
//=== 책 목록 ===
//Java Program
//JSP Program
//SQL Fundamentals
//JDBC Program
//EJB Program
//
//=== 책 가격의 총합 ===
//전체 책 가격의 합 : 132000