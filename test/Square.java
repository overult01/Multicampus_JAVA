package test;

public class Square {

	public static void main(String[] args) {
		int top = (int)(Math.random() * 100) + 1 ; // 1 ~ 100
		int bottom = (int)(Math.random() * 100) + 1 ; // 1 ~ 100
		int tall = (int)(Math.random() * 100) + 1 ; // 1 ~ 100
		double size = (double)((top + bottom) * tall /2);
		System.out.println("윗변: " + top + ", 아랫변: " + bottom + ", 높이: " + tall + ", 면적(실수): " + size);
	}

}

//3.
//사다리꼴 면적 실수: 300.xxx
//윗변 : 정수  = 10
//아랫변 : 정수 = 15
//높이 : 정수 = 12
// 사다리꼴 면적(윗변,아랫변, 높이)
//사다리꼴의 면적은 실수가 나오게 
//[(윗변 + 아랫변) × 높이 ÷ 2]