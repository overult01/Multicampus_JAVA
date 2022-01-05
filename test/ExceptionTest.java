package ch8;

// 예외처리 try - catch 문과 예외 강제 발생시키기 throw
public class ExceptionTest {

	public static void main(String[] args) {
		// args배열은 실행할 때 입력받은 값. 
		// 우리가 입력한 값에 따라 실행할 때도, 실행하지 못할 때도 있다. 
		// 예외처리1: try - catch 문
		// try: 실행할 문장, catch: 에러시 실행할 문장 (try문 1개에 다수의 catch블럭이 여러개 올 수 있다. ) 
		try{
			int first = Integer.parseInt(args[0]);
			int second = Integer.parseInt(args[1]);
			System.out.println(second / first);
//			IllegalArgumentException error = new IllegalArgumentException(); // 예외 강제 생성(일부러 예외 생성) 
//			throw error; // error 가 참조하고 있는 예외 객체를 강제적 발생시킨다.
			throw new IllegalArgumentException("매개변수 잘못 지정");  // 위의 두 문장을 한 번에 합치면 이렇게 씀 //throw: 인위적으로 에러를 만들 때, throw 뒤에 에러 객체 써준다. 
			// second / first 문장 중단 - 예외발생
			// new ArithmeticException() 자동 생성.
			// catch 검사 
		}
		// 일부 예외만 먼처 처리. 이후 나머지 모든 예외는 catch(Exception error) 로 한 번에 처리도 가능하다.
		catch(NumberFormatException error) {
		System.out.println("정수 변환이 가능한 값을 입력하세요");
		}

		// 모든 예외를 한 번에 처리하는 catch: 자바의 모든 에러는 Exception 클래스를 상속받은 것. 따라서 자동형변환 원리로 부모 객체인 Exception 타입사용. 
		catch(Exception error) {
			System.out.println(error.getMessage());  
		}
		
		// 예외별 catch 지정. catch(에러명 변수)
//		catch(ArithmeticException error) {
//			// 다른 값 주기
//			first = (int)(Math.random()* 100) + 1;
//			// 경고 문구 출력
//			System.out.println("0이 아닌 값을 입력하세요. ");
//			// 예외발생 원인, 문장, 메서드 추척하는 메서드 
//			error.printStackTrace();
//			// 예외발생원인 출력 메서드 
//			System.out.println(error.getMessage());  
//		}		
		System.out.println("메인 실행완료");
	}
}