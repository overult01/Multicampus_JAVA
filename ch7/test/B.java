package test;

import multi.A;
import java.util.Date;
import java.util.ArrayList;

public class B {

	public static void main(String[] args) {
		A a1 = new A();  // 다른 패키지에 있으면 '패키지.클래스명'으로 호출해서 사용해야 한다.
		Date now = new Date(); // 현재시각. 클래스가 어느 패키지에 있는지 알려주어야.  
		System.out.println("현재시각 = " + now );
		ArrayList list = new ArrayList();
	}

}
