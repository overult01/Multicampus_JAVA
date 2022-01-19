package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

// jdbc실습 

/*  employees 테이블에서 6월 입사자의 사번, 이름, 급여, 입사일을 조회하여
 * Employee 객체로 생성한 후에 ArrayList로 저장하고 출력하는 자바 프로그램을 구현하시오. */

public class EmpDeptTest {

	public static void main(String[] args) {
		EmpDeptTest t = new EmpDeptTest();
		ArrayList<Employee> list = t.selectEmp("06");
		for(Employee e : list) {
			System.out.println(e.toString());
		}
	}//main
	

	ArrayList<Employee> selectEmp(String month) {
		//Employee들을 담을 배열 
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//DB연결 
			// DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/접속할 DB", "아이디", "비밀번호");		
			Connection conn = 
					DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "12345678");
					System.out.println("==DB연결성공==");
		
			// SQL문 
			String selectSQL = "select employee_id, first_name, salary, hire_date from employees where hire_date like '_____"+ month + "%' "; //like로 수정필요 
		
			// DB에 SQL문 보내기 
			Statement st = conn.createStatement();
		
			// SQL문 실행명령 
			ResultSet rs = st.executeQuery(selectSQL);
			
			while(rs.next()) {
				int id = rs.getInt("employee_id");
				String name = rs.getString("first_name");
				double salary = rs.getDouble("salary");  //자바에서는 소수점 1번째 자리까지만 가져온다. 소수점을 지정하고 싶으면 sql문 자체에 넣어줘야.
				String hire_date = rs.getString("hire_date");  // sql패키지의 Date타입 import	
				
				Employee emp = new Employee(id, name, salary, hire_date);
				list.add(emp);
			}
			rs.close();			
			st.close();
			conn.close();
			System.out.println("==mysql 연결해제 성공==");		
			return list;

		} 
		
		catch (Exception e) {
			e.printStackTrace();
			return list; // 실패시 빈 배열 반환
			
		}
	}
	
}//EmpDeptTest end

class Employee{
	
	private int employee_id;
	private String first_name;
	private double salary;
	private String hire_date; 
	

//	String d = rs.getString("hire-date");   // sql의 날짜 데이터도 String 타입으로 받을 수 있다.
	
	//생성자 추가(초기화)
	public Employee(int employee_id, String first_name, double salary, String hire_date) {
	super();
	this.employee_id = employee_id;
	this.first_name = first_name;
	this.salary = salary;
	this.hire_date = hire_date;
}
	
	public String toString() { 
		return employee_id + "\t" + first_name + "\t" + salary + "\t" + hire_date;
	}
}
