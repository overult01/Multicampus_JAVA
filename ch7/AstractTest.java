package ch7;

// abstract 예제 

abstract class Shape{  // abstract 메서드가 1개라도 있으면 abstract 클래스 
	public abstract void area();  //{} 구현부가 없어서 abstract이 붙음 
	public abstract void circum();
}

class Rectangle extends Shape{
	
	int width = 0, height = 0;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

// 메서드 오버라이딩: 리턴타입, 이름, 매개변수 동일하고 접근 modifier는 동일하거나 더 넓어도 된다. 
	public void area() {  // 따라서 area메서드는 부모클래스의 area메서드의 public보다 넓거나 동일한, public을 붙여야. 
		System.out.println("가로 = " + width + "세로 = " + height+ "인 사각형의 면적은: " + width * height);
	}

	@Override
	public void circum() {
		System.out.println("가로 = " + width + "세로 = " + height+ "인 사각형의 둘레: " + 2*(width + height));
	};	 
}

class Circle extends Shape{
	int radius;

	//생성자 정의
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	// 메서드 오버라이딩
	@Override
	public void area() {
		System.out.println("반지름이 " + radius + "인 원의 면적: " + 3.14*radius*radius);
	}

	@Override
	public void circum() {
		System.out.println("반지름이 " + radius + "인 원의 둘레: " + 2*3.14*radius);
	}
	
}

// 별개 예제 - 형변환과 오버라이딩 
class Parent {
	String name = "부모";
	void tellName() {
		System.out.println(name);
	}
}

class Child extends Parent{
	int su = 2;
	void tellSu() {
		System.out.println(su);
	}
	
	// 오버라이딩 
	void tellName() {
		System.out.println("자식");
	}
}

public class AstractTest {

	public static void main(String[] args) {
		
		Parent p = new Child(); // 자동형변환 
		p.tellName(); // 자식: 타입이 Parent이지만, 호출하는 메서드가 오버라이딩 된 메서드이면 자식 메서드가 호출된다. 
		System.out.println(p.name); // 부모: 부모클래스의 변수 유지. (오버라이딩은 메서드만 해당되므로.) 오버라이딩 된 것이 아니라면 무조건 부모클래스 것을 가져온다. 
		////////////
		Shape s1 = new Rectangle(5, 6);  // 가로 5, 세로 6인 사각형 
		Shape s2 = new Circle(6);
		Shape s3 = new Circle(7);
		Shape s4 = new Rectangle(10, 15);

		Shape ar[] = new Shape[4];
//		Shape ar = new Shape();  // abstract 클래스는 직접적인 객체 생성 불가이다.
		ar[0] = s1;
		ar[1] = s2;
		ar[2] = s3;
		ar[3] = s4;
		
		for(int i = 0; i <ar.length; i++) {
			ar[i].area();
			ar[i].circum();
//			System.out.println(ar[i].radius);  // Shape 타입에는 radius가 없다. 따라서 불가 
			if(ar[i] instanceof Circle) {
				Circle c = (Circle)ar[i];  // 명시적인 형변환: 자식 클래스인 Circle 클래스의 필드, 메서드 사용하기 위해서 .
				System.out.println("원의 반지름: "+ c.radius);
			}
		}
		
	}

}
