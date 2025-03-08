package main;

import java.util.Scanner;

public class Future10Year extends PresentMe {
	Scanner s = new Scanner(System.in);
	String job; // 직업
	String work; // 하는일
	String salary; // 연봉
	
	public Future10Year() {
		
	}
	
	
	@Override
	public void add() { //등록하기
		System.out.println("현재의 이름을 입력하세요");
		String name = s.nextLine();
		System.out.println("현재의 나이를 입력하세요");
		int age = s.nextInt();
		s.nextLine();
		System.out.println("현재의 사는곳을 입력하세요");
		String adds = s.nextLine();
		super.name=name;
		super.age=age;
		super.adds=adds;
		boolean flag = true;
		while (flag) {
			System.out.println("10년뒤 미래입니다 등록메뉴를 선택해주세요");
			System.out.println("1.직업 2.하는일 3.연봉");
			int a = s.nextInt();
			s.nextLine();
			switch(a) {
			case 1 : jobAdd(); break;
			case 2 : workAdd(); break;
			case 3 : salary(); break;
			default : flag = false;
			}
		}
	}
	
	public void jobAdd() { // 직업등록
		System.out.println("10년후 직업을 등록해주세요");
		String job = s.nextLine();
		this.job=job;
	}
	public void workAdd() {
		System.out.println("10년후 하는일을 등록해주세요");
		String work = s.nextLine();
		this.work=work;
	}
	public void salary() {
		System.out.println("10년후 연봉을 등록해주세요");
		String salary = s.nextLine();
		this.salary=salary;
	}
	
	
	
	@Override
	public void prt() {
		// TODO Auto-generated method stub
		super.prt();
		System.out.println("10년후 직업 : "+job);
		System.out.println("10년후 일 : "+work);
		System.out.println("10년후 연봉 : "+salary);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
