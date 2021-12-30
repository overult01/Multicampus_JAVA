package test;

// static 예제 
// 회원 관리 프로그램

class Member {
	
	//<변수>
	static String id;  // 여기에서는 1명의 사용자 id로 계속 확인할 것. 클래스 내에서 공유되어야 (클래스 메소드)
	static int password;
	static String name;
	static int age;
	
	//<메소드>
	//회원 가입
	//void insert(아이디 암호 이름 나이)
//	"test", 1234, "이자바", 25
	//가입 완료되었습니다.
	static void insert(String id, int password, String name, int age) {
		Member.id = id;  // 클래스 변수(static). 공유용 
		Member.password = password;
		Member.name = name;
		Member.age = age;
		
		System.out.println("가입 완료되었습니다.");
	}
	
	//로그인
	//void login(아이디 암호)
	//매개변수 아이디 암호
	//필드변수 아이디 암호
	//일치하면 로그인되었습니다.
	//일치하지 않으면 로그인 정보를 확인하세요
	//==> mem.login("test", 4321); "로그인 정보를 확인하세요"
	// mem.login("test", 1234);"로그인되었습니다."	
	void login(String id2, int password2) {
		
		if (id2 == Member.id && password2 == Member.password) {
			System.out.println("로그인되었습니다.");
		}
		else {
			System.out.println("로그인 정보를 확인하세요.");
		}
		
	}
	
	//암호 수정
	//void setPassword(암호)
	//필드변수 (=인스턴스변수나클래스변수) 암호를 매개변수 암호값으로 변경	
	void setPassword(int password) {
		Member.password = password;
	}
	

	//자기 정보 조회
	//void getMyInfo()
	//아이디 암호 이름 나이 출력
	void getMyInfo() {
		System.out.println("아이디: " + Member.id + ", 암호: " + Member.password + ", 이름: " + Member.name + ", 나이: " + Member.age);
	}
	
	//로그아웃
	//String logout()
	//로그아웃되었습니다. 출력하고
	//필드변수 아이디=null, 암호=-1, 이름=null, 나이=-1 값으로 변경하고
	//아이디값 리턴.
	String logout() {
		System.out.println("로그아웃되었습니다.");
		Member.id = null;
		Member.password = -1;
		Member.name = null;
		Member.age = -1;
		return null;
		
	}
}

public class MemberTest {

	public static void main(String[] args) {
		
		Member.insert("test", 1234, "이자바", 25);
		
		Member mem = new Member();
		mem.login("test", 4321);
		mem.login("test", 1234);
		mem.setPassword(1111);
		mem.getMyInfo();
		String id  = mem.logout();
		if(id == null){
		System.out.println("다시 로그인하셔야 합니다.");
		}

	}
}
