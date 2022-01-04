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
		System.out.println("가로 = " + width + "세로 = " + height+ "사각형의 둘레: " + 2*(width + height));
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

public class AstractTest {

	public static void main(String[] args) {
		Shape s1 = new Rectangle(5, 6);  // 가로 5, 세로 6인 사각형 
		Shape s2 = new Circle(6);
		s1.area();
		s1.circum();
		s2.area();
		s2.circum();
	}

}
