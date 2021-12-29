package array;

public class DeepCopy {
// 깊은 복사 예제.

public static void main(String[] args) {

	
	Book[] bookArray1 = new Book[3];
	Book[] bookArray2 = new Book[3];
	
	bookArray1[0] = new Book("태백산맥1","조정래");
	bookArray1[1] = new Book("태백산맥2","조정래");
	bookArray1[2] = new Book("태백산맥3","조정래");
	
	// 얕은 복사와 달리 bookArray2의 값들을 각각 생성해줌 
	bookArray2[0] = new Book("태백산맥1","조정래");
	bookArray2[1] = new Book("태백산맥2","조정래");
	bookArray2[2] = new Book("태백산맥3","조정래");
	
	// 깊은 복사 
	for(int i = 0; i < bookArray1.length; i++) {
		bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		bookArray2[i].setBookName(bookArray1[i].getBookName());
	}

	
	for(int i = 0; i < bookArray1.length; i++) {
		bookArray1[i].showBookInfo();;
	}
	
	// (2) bookArray2 의 0번째 값도 변경되어 있음을 알 수 있다. -> '얕은 복사' 때문! 
	System.out.println("=================");
	for(int i = 0; i < bookArray1.length; i++) {
		bookArray2[i].showBookInfo();;
	}		
	
	// ===================
	// < 향상된 for문 : 배열 요소의 첨부터 끝까지 모든 요소를 참조 할 때 편리한 반복문>
	String[] strArr = {"Java", "Android", "C"};
	
	// 기본 for 문 
	for (int i = 0; i < strArr.length; i++) {
		System.out.println(strArr[i]);
	}

	// 향상된 for문 : 배열 요소 모두를 출력할 것이다 할 때 (위와 같은 결과 출력 )
	for(String s : strArr) {
		System.out.println(s);
	}
		
	// 향상된 for문 : 어떤 배열이든 동일하게 사용 가능 (위는 객체 배열, 지금은 기본 배열)
	int[] arr = {1, 2, 3, 4, 5};
	for(int num : arr) {
		System.out.println(num);
	}
	
	}
}