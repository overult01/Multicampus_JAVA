package ch7;

class Product {
	private int code; // default제어자: 같은 패키지에서만 사용 가능 
	private String name; // private 제어자: 내 클래스 안에서만 사용 가능 
	private double price;
	private int amount;
	public int getCode() {
		return code;
	}
	
	// setter, getter 메서드: private 을 사용한 변수일 때, 다른 클래스에서 변수를 직접 접근하지 못하도록. setter로는 수정, getter로는 조회 
	public void setCode(int code) { // setter 메서드 : 값변경
		this.code = code;
	}
	public String getName() { // getter 메서드: 값 조회
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

public class ProductTest {
	public static void main(String args[]) {
		Product p = new Product();
//		p.name; // private 제어자가 붙으면 외부 클래스에서 호출 불가(같은 패키지 안에 있어도)\System.out.println(p.getCode());
		p.setCode(200);
		System.out.println(p.getCode());
		p.setName("상품명");
		p.setPrice(12390.5);
		p.setAmount(100);
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println(p.getAmount());
	}

}
