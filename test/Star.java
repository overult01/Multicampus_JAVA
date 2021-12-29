package test;

public class Star {

	public static void main(String[] args) {
		int star = 10;
		for ( int i = 1; i <= star; i++) {
			char c = 'a';
			for ( int j = 0; j <=i; j++) {				
				System.out.print((char)(c+j));
			}
			System.out.println();
		}
//		String vasket = "";
//		int star = (int)(Math.random() * 10) + 1;
//		for ( int i = 1; i <= star; i++) {
//			vasket += "*";
//			System.out.println(vasket);  // 자바는 문자열 곱하기가 안되어서 문자열 vasket에 담았다. 
//		}	

		
	}

}



//4. 2 ~ 10  줄 별모양 직각삼각형 출력
//반복문
//*
//**
//***
//****
//*****
//
