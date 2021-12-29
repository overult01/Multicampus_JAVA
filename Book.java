package array;

public class Book {
	
	// 읽은 책 관리를 위한 객체 Array 생성 예제 
	
	// (1) 멤버변수 
	private String bookName;
	private String author;
	
	// (2) Constructor
	public Book() {} // 디폴트 constructor
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	// (3) 멤버변수를 위한 get, set 메서드 
	// private 메서드를 위한 get, set 메서드 : 외부에서 사용할 수 있도록 
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	// (4) 정보를 보여주는 showBookInfo 메서드 
	// 책이름 + 저자 출력 
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
	
}
