package array;

public class ObjectCopy {

// 얕은 복사 예제
// * 얕은 복사: 배열 요소의 '주소'만 복사 됨. 배열 요소가 변경되면 복사된 배열의 '값' 도 복사됨.
	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1","조정래");
		bookArray1[1] = new Book("태백산맥2","조정래");
		bookArray1[2] = new Book("태백산맥3","조정래");
		//얕은 복사 : arraycopy() 
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();;
		}

		// (1) bookArray1의 0번 값 변경 
		System.out.println("=================");
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();;
		}
		
		// (2) bookArray2 의 0번째 값도 변경되어 있음을 알 수 있다. -> '얕은 복사' 때문! 
		System.out.println("=================");
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].showBookInfo();;
		}		

	}

}
