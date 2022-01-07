package ch11;
// 제너릭 예제 (사용하지 않았을 경우) 

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

class Box{
	Object contents;  // 상자 내부의 내용물. 이 내용물의 종류가 많다(사과, 종이 모두 담을 수 있어야 한다.). 따라서 Oject 타입으로 작성.  

	Box(Object contents) {
		this.contents = contents;
	}

	public Object getContents() {
		return contents;
	}

	public void setContents(Object contents) {
		this.contents = contents;
	}
	
}



public class NonGenericTest {

	public static void main(String[] args) {
		Apple a = new Apple("대구");
		Paper p = new Paper("A4");
		Box aBox = new Box(a);   // 사과만 저장
		Box bBox = new Box(p);   // 종이도 저장
		
		if(aBox.getContents() instanceof Apple) {
			System.out.println(((Apple)aBox.getContents()).origin);  // 대구
		}

		if(bBox.getContents() instanceof Paper) {
			System.out.println(((Paper)bBox.getContents()).size);
		}
	}
// 이런 경우 항상 if문, 명시적 형변환을 사용해야해서 번거롭다. 그래서 제너릭을 사용하여 바꿀 것이다. 
}
