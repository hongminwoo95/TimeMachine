package main;

import java.util.Scanner;

public class Future10YearDTO extends PresentMe {
	Scanner s = new Scanner(System.in);
	String job; // 직업
	String work; // 하는일
	String salary; // 연봉
	
	public Future10YearDTO() {
		
	}
	@Override
	public void add() { //등록하기
		System.out.println("등록할 현재의 이름을 입력하세요");
		String name = s.nextLine();
		System.out.println("등록할 현재의 생년월일 6자리를 입력하세요");
		int age = s.nextInt();
		s.nextLine();
		System.out.println("등록할 현재의 사는곳을 입력하세요");
		String adds = s.nextLine();
		super.name=name;
		super.age=age;
		super.adds=adds;
		System.out.println("10년뒤 미래입니다 등록메뉴는 총 3가지입니다 직업,직업(업무),연봉");
		jobAdd();
		workAdd();
		salary();
		System.out.println("등록이 완료되었습니다");
		
	}
	public void jobAdd() { // 직업등록
		System.out.println("1.10년뒤 미래 직업을 등록해주세요");
		String job = s.nextLine();
		this.job=job;
	}
	public void workAdd() {
		System.out.println("2.10년뒤 미래 직업의업무를 등록해주세요");
		String work = s.nextLine();
		this.work=work;
	}
	public void salary() {
		System.out.println("3.10년뒤 미래 연봉을 등록해주세요");
		String salary = s.nextLine();
		this.salary=salary;
	}
	@Override
	public void modify() { // 미래 분류별 수정
		boolean flag = true;
		while (flag) {
			System.out.println("10년뒤 미래를 수정합니다 수정하고싶은 목록을 선택해주세요");
			System.out.println("1.직업 2.하는일 3.연봉 4.뒤로가기");
			int a = s.nextInt();
			s.nextLine();
			switch(a) {
//			case 1 : sjobAdd(); break;  <-----------------수정중
//			case 2 : sworkAdd(); break;
//			case 3 : ssalary(); break;
			default : flag = false;
			}
		}
	}
//	public void sjobAdd() {  <--------ArrayList 0번인덱스에서 setter 사용법 알아내서 적용해야함 여기서부터 수정하기
//		System.out.println("1.수정할 미래 직업을 등록해주세요");
//		Admin admin = new Admin();
//		
//		
//		
//		
//	}
//	public void sworkAdd() {
//		System.out.println("2.수정할 미래 직업의업무를 등록해주세요");
//		String work = s.nextLine();
//		this.work=work;
//	}
//	public void ssalary() {
//		System.out.println("3.수정할 미래 연봉을 등록해주세요");
//		String salary = s.nextLine();
//		this.salary=salary;
//	}
	@Override
	public void prt() {
		// TODO Auto-generated method stub
		super.prt();
		System.out.println("--------10년뒤 미래------");
		System.out.println("10년후 직업 : "+job);
		System.out.println("10년후 일 : "+work);
		System.out.println("10년후 연봉 : "+salary);
		System.out.println("------------------------");
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
