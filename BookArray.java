package array;

public class BookArray {

	public static void main(String[] args) {
		
		/*  int Array를 만들 때 예시  
		 * 		int[] intarr = new int[10];
		 */
		
		// 객체 Array를 만들 때 방법
		
		// (1) 객체 배열의 주소값 만들기 
		Book[] library = new Book[5]; // 책이 5권이 만들어지는 것이 아님. 그 책이 만들어질 자리가 5개가 생성되는 것 (즉, address 를 나타냄 ). 따라서 별도로 new book 으로 책들을 생성해야 함. 
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		
		// (2)  각각의 객체 생성( 주소에 넣어줄)
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		// (3) 생성한 객체 배열의 각각의 주소값 출력
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);   
		}

 		// (4) book.java 에서 생성한 showBookInfo() 로 '책이름, 저자' 출력
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();    
		}		
		
	}

}

