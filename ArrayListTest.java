package array;

import java.util.ArrayList;

// ArrayList 클래스 
public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));  // ArrayList 에서는 인덱스 연산자를 제공하지 않음. 
		}
	}

}
