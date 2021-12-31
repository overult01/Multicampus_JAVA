package ch6;

class Initial{
	int i = 22;
	int j;
	static int k = 30;  // 실행순서 1
	Initial(int i, int j) { // 생성자 사용자 정의 
		this.i = i;
		this.j = j;
	}
}

public class ConstructorTest {

	public static void main(String[] args) { // 실행순서 1
		System.out.println(Initial.k);
//		System.out.println(Initial.i); static 변수가 아니므로 사용불가 
//		System.out.println(Initial.j);
		
		Initial ini  = new Initial(100, 200); // 실행순서 2(ini 생성), 3(new로 생성자 호출됨 -> 100, 200 으로 변수 값 초기화) 
		// -> 즉, 보통 생성자를 통해 명시적 초기화하는 것이 낫다. 따라서 i를 22로 맨위에 초기화한 것은 의미가 없으니, 인스턴스 변수는 int i; 로 선언만 하자.
		// 사용자 정의대로 매개변수전달하여 생성자 호출 
		System.out.println(ini.i);
		System.out.println(ini.j);
		System.out.println(ini.k);

	}

}
