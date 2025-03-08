package main;

public class AdminDAO {
	private String driver="oracle.jdbc.driver.OracleDriver"; // <-- 고정주소인지 알아보기
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // <-- DBMS주소 : 포트번호 : 데이터베이스 이름
	private Admin admin = new Admin();
	
	public AdminDAO() {
		init();
		
	}
	
	
	
	public void init() {
		try {
			Class.forName(driver); // ← 라이브러리 
			System.out.println("클래스 load 성공");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void say() {
		System.out.println("몇년후 미래를 저장하시겠습니까?");
		System.out.println("1.10년 2.20년");
	}
	
	
	
	
	
	
	
	
}
