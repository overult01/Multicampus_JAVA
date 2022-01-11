package ch15;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

// File 클래스(읽기, 쓰기는 불가. 하지만 파일 또는 디렉토리에 대한 정보줄 수 있음)

// 참고: .. 은 상위폴더, .는 현재 폴더를 의미. 
public class FileInfo {

	public static void main(String[] args) throws IOException { // 메인메서드에서 에러 Throws -> JVM 예외처리 방법대로 하겠다(사용자가 원하는 대로 처리불가) 
		File f = new File(args[0]);
		System.out.println("경로 = " + f.getCanonicalPath());

		if (f.exists()) { // exists(): 파일 또는 디렉토리가 있는지 boolean 
			if(f.isFile()) { // isFile: 파일이면 true, 디렉토리면 false
				System.out.println("파일명 = " + f.getName());
				System.out.println("파일읽기 가능여부 = " + f.canRead());
				System.out.println("파일쓰기 가능여부 = " + f.canWrite());
				System.out.println("파일실행 가능여부 = " + f.canExecute());
//				System.out.println("파일 최종 수정시각 = " + f.lastModified());
				System.out.println("파일크기(byte단위) = " + f.length());
				long last = f.lastModified(); // 1/1000초 숫자
//				Date d = new Date(); // 현재시각 객체
				Date d = new Date(last); // 제시된 시각에 대한 객체 // 출력: Tue Jan 11 14:55:40 KST 2022
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy 년도 MM월 dd일 E 요일 HH 시 mm 분 ss 초");
				System.out.println("파일 최종 수정시각= " + sdf.format(d));  // 2022 년도 01월 11일 화 요일 15 시 00 분 37 초 
			
				
				// 파일명 확장자 출력(직접 작성 코드)
				String totalname = f.getName();
			
				String[] arr = totalname.split("[.]"); // 정규 표현식과 관련된 부분 ( . 하나만 찍으면 모든 것을 뜻한다) 
				System.out.println("파일 확장자 = " + arr[1]);
			
				
			}
			else {
				System.out.println("디렉토리명= " + f.getName());
				String[] details = f.list();  // 디렉토리니까 list 출력 가능.
				System.out.println("세부목록은 다음과 같습니다.");
				for(String s : details) {
					System.out.println(s);
				}
			}
			System.out.println("==============");
		}
		else {
			System.out.println(args[0] + "파일이나 디렉토리 없습니다.");
		}
		
		// 확장자 구분 
		File f2 = new File("a.bb.ccc.txt");
		String totalname = f2.getName();

		// 강사님 방법 1
		/* while(true) {
			int location = totalname.indexOf("."); // 없으면 -1 출력 
			totalname = totalname.substring(location + 1); //bb.ccc.txt
			System.out.println(totalname);
			if(location < 0) {
				break;  // indexOf가 -1이면 찾는 것이 없다는 뜻. 
			}
		} */

		// 강사님 방법 2		
//		int location = totalname.lastIndexOf(".");
//		System.out.println("확장자 = " + totalname.substring(location + 1));
	}

}
