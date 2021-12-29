package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		
		double[] num = new double[5];
		int size = 0;
		
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		num[2] = 30.0; size++;
		// 이러면 num[3] , num[4] 에는 0.0 이 들어감 
		
		
		double total = 1.0;
		for(int i = 0; i<size; i++) {
			System.out.println(num[i]);
			total *= num[i];
		}

		System.out.println("total: " + total);
	}

}