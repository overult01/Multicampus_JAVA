package ch8;


// finally 블럭: 항상 실행되어야 하는 문장. try - catch - finally 
// 예외처리 관련.  


public class FinallyTest {

	public static void main(String[] args) {
		try {
			int first = Integer.parseInt(args[0]);
			int second = Integer.parseInt(args[1]);
			System.out.println(second / first);
			System.out.println("에러가 없어서 try문이 끝까지 수행되어야 하는 경우만 실행되는 문장");
		}
		catch(ArithmeticException error) { 
			System.out.println("0 입력하면 실행 불가능");
		}
		catch(NumberFormatException error) {
			System.out.println("정수 아닌 값 입력하면 실행 불가능 ");
		}
		finally {  // 예외 발생 유무, 예외의 타입, 예외처리와 무관하게 실행이 필요한 문장일 때 사용.
			System.out.println("항상 실행 필요 문장");
		}
		
		System.out.println("main 실행완료"); // 예외 없으면 try만, ArithmeticException 에러면 catch문 1번만, NumberFormatException 에러면 catch문 2번만.
		
	}

}
