package main;

import java.util.Scanner;

public class Future20YearDTO extends Future10YearDTO {
	Scanner s = new Scanner(System.in);
	
	private String job; // 직업
	private String work; // 하는일
	private String salary; // 연봉
	public Future20YearDTO() {
		
	}
	@Override
	public void add() {
		super.add();
		System.out.println("20년뒤 미래를 등록하시겠습니까?");
		System.out.println("1.등록 2.취소");
		int num = s.nextInt();
		s.nextLine();
		switch(num) {
		case 1: add20(); break;
		}
	}
	public void add20() {
		System.out.println("20년뒤 미래입니다 등록메뉴는 총 3가지입니다 직업,직업(업무),연봉");
		jobAdd1();
		workAdd1();
		salary1();
		System.out.println("20년뒤 미래가 등록 되었습니다");
		System.out.println();
	}
	public void jobAdd1() {
		// TODO Auto-generated method stub
		System.out.println("1.20년뒤 미래 직업을 등록해주세요");
		String job = s.nextLine();
		this.job=job;
	}
	public void workAdd1() {
		System.out.println("2.20년뒤 미래 직업의업무를 등록해주세요");
		String work = s.nextLine();
		this.work=work;
	}
	public void salary1() {
		System.out.println("3.20년뒤 미래 연봉을 등록해주세요");
		String salary = s.nextLine();
		this.salary=salary;
	}
	@Override
	public void modify() {
		super.modify();
		boolean flag = true;
		while(flag) {
			System.out.println("20년뒤 미래를 수정합니다 수정하고싶은 목록을 선택해주세요");
			System.out.println("1.직업 2.하는일 3.연봉 4.뒤로가기");
			int a = s.nextInt();
			s.nextLine();
			switch(a) {
			case 1 : jobAdd2(); break;  
			case 2 : workAdd2(); break;
			case 3 : salary2(); break;
			default : flag = false;
			}
		}
	}
	public void jobAdd2() {
		// TODO Auto-generated method stub
		System.out.println("1.수정할 20년뒤 미래 직업을 등록해주세요");
		String job = s.nextLine();
		this.job=job;
	}
	public void workAdd2() {
		System.out.println("2.수정할 10년뒤 미래 직업의업무를 등록해주세요");
		String work = s.nextLine();
		this.work=work;
	}
	public void salary2() {
		System.out.println("3.수정할 10년뒤 미래 연봉을 등록해주세요");
		String salary = s.nextLine();
		this.salary=salary;
	}
	@Override
	public void prt() {
		// TODO Auto-generated method stub
		super.prt();
		System.out.println("--------20년뒤 미래------");
		System.out.println("20년후 직업 : "+job);
		System.out.println("20년후 업무 : "+work);
		System.out.println("20년후 연봉 : "+salary);
		System.out.println("------------------------");
	}
	

	
	
}
