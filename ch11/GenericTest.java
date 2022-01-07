package generictest;
// 제너릭스 예제 
// 컴파일시 타입을 체크해주는 기능.
class Apple{
	String origin;

	Apple(String origin) {
		this.origin = origin;
	}
}

class Paper{
	String size;

	Paper(String size) {
		this.size = size;
	}
}

// 박스에는 2가지 인스턴스 변수가 있는 경우. 복수개일 경우 계속 , 로 열거하면 된다. 
class Box <T /*, P*/ > /*T가 아니어도 된다. 통일 시켜주기만 하면 됨.*/{
	T contents;  // 상자 내부의 내용물. 이 내용물의 종류가 많다(사과, 종이 모두 담을 수 있어야 한다.). 따라서 Oject 타입으로 작성.  
//	P amount;
	Box(T contents) {
		this.contents = contents;
	}

	public T getContents() {
		return contents;
	}

	public void setContents(T contents) {
		this.contents = contents;
	}
	
}



public class GenericTest {

	public static void main(String[] args) {
		Apple a = new Apple("대구");
		Paper p = new Paper("A4");
		Box<Apple> aBox = new Box<Apple>(a);   // 우리가 전달해주는 표현을 저장해라. 이 타입으로만 써라. 
		Box<Paper> bBox = new Box<Paper>(p);   
		
//		if(aBox.getContents() instanceof Apple) {
			System.out.println((/*(Apple)*/aBox.getContents()).origin);  // 대구
//		

//		if(bBox.getContents() instanceof Paper) {
			System.out.println((/*(Paper)*/bBox.getContents()).size);
		}
}
// 명시적 형변환, 일일이 타입확인 하지 않아도 된다. 코드가 단순해져서 좋음. 
// 제너릭을 쓰면서 Box클래스에서는 가장 많이 바뀌었다. 
