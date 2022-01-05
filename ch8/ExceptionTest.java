package ch8;

// 예외처리 
public class ExceptionTest {

	public static void main(String[] args) {
		// args배열은 실행할 때 입력받은 값. 
		// 우리가 입력한 값에 따라 실행할 때도, 실행하지 못할 때도 있다. 
		int first = 0;
		// 예외처리1: try - catch 문
		// try: 실행할 문장, catch: 에러시 실행할 문장 (try문 1개에 다수의 catch블럭이 여러개 올 수 있다. ) 
		try{
			first = Integer.parseInt(args[0]);
			int second = Integer.parseInt(args[1]);
			System.out.println(second / first);
			}
		// 일부 예외만 먼처 처리. 이후 나머지 모든 예외는 catch(Exception error) 로 한 번에 처리도 가능하다.
		catch(NumberFormatException error) {
		System.out.println("정수 변환이 가능한 값을 입력하세요");
		}

		// 모든 예외를 한 번에 처리하는 catch: 자바의 모든 에러는 Exception 클래스를 상속받은 것. 따라서 자동형변환 원리로 부모 객체인 Exception 타입사용. 
		catch(Exception error) {
			System.out.println("발생하는 모든 에러를 동일 처리");
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
//		catch(NumberFormatException error) {
//			System.out.println("정수 변환이 가능한 값을 입력하세요");
//		}
//		catch(ArrayIndexOutOfBoundsException error) {
//			System.out.println("입력값은 2개 이상이어야 합니다.");
//		}
		
		System.out.println("메인 실행완료");
	}
}

/* 
100 100 입력 : 정상실행
100 입력 : args[1]이 없어서 ArrayIndexOutOfBoundsException 오류. 
아무것도 입력 X : ArrayIndexOutOfBoundsException 오류.
aa bb 입력 : NumberFormatException 오류.
0 10 입력 : ArithmeticException 오류. 
*/