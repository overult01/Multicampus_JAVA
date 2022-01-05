package ch8;

import java.io.IOException;

//throws : 예외를 발생시킬 수 있는 메서드에서 에러를 처리할 필요는 없다. throws로 발생가능한 에러를 명시해서 호출한 곳에서 예외처리(try-catch)로 처리하도록 할 수 있다.

// checked(예. IOException), unchecked(= 런타임에러. ex. ArithmeticException) 에러 종류. 
class Test{
	void ma(int i) throws ArithmeticException, IOException{
		System.out.println(100 / i);
		throw new IOException(); // 일부러 컴파일 오류 발생.(checked exception)
	}
	void mb() throws ArithmeticException, IOException{
		ma(0);  // mb메서드가 ma메서드에 0 전달 -> ArithmeticException 발생 -> mb메서드에서 처리해야(호출하는 곳). 만약 여기서도 처리하기 싫으면 throws 해서 또 넘길 수 있음.   
	}
}

public class ThrowsTest {

	public static void main(String[] args) {
		Test t = new Test();
		try {
			t.mb();
		}
		catch (ArithmeticException error) {
			System.out.println("0 나누기 불가");  // throws로 계속 넘겨서 마지막에 호출한 메인메서드에서 예외처리(try - catch) 
		}
		catch(IOException error) {
			System.out.println("입출력 오류");
		}
	}

}
