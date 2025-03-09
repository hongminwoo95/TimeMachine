package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin  {
	
	private ArrayList<PresentMe> FList = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	public ArrayList<PresentMe> getFList() {
		return FList;
	}
	public void setFList(ArrayList<PresentMe> fList) {
		FList = fList;
	}
	public Admin() {
		boolean flag = true;
		while (flag) {
			System.out.println();
			System.out.println("당신의 미래를 그려보시겠습니까?");
			System.out.println("10년, 20년 뒤 미래를 직접 선택할수 있습니다");
			System.out.println();
			System.out.println("1.미래등록 2.미래조회 3.미래수정 4.미래저장<유료>(!저장시 본인의 미래는 확정됩니다!)");
			String a = s.nextLine();
			switch(a) {
			case "1" : add(); break; // 미래 등록
			case "2" : prt(); break; // 미래 전체조회
			case "3" : modify();break; // 미래 분류별 수정
			case "4" : break;
			default : flag=false;
			}
		}
	}
	public void add() { // 등록
		System.out.println("미래를 등록하시겠습니까?");
		System.out.println("1.등록 2.취소");
		PresentMe presentme = null;
		int q = s.nextInt();
		s.nextLine();
			switch (q) {
			case 1 : 
				presentme = new Future20YearDTO();
				presentme.add();
				FList.add(presentme);
				break;
			}
	}
	public void modify() { // 수정1
		System.out.println("본인 인증이 필요합니다");
		System.out.println("이름을 입력해주세요");
		String name = s.nextLine();
		System.out.println("생년월일 6자리를 입력해주세요");
		int age = s.nextInt();
		s.nextLine();
		System.out.println("코드KEY를 입력해주세요");
		String key = s.nextLine();
		for (PresentMe uu : FList) {
			if(uu.getName().equals(name)  && uu.getAge()==age && uu.getKey().equals(key)) {
				modify1(uu);
				break;
			}else {
				System.out.println("!!!등록된 정보를 찾을수 없습니다 정보를 등록후 이용바랍니다!!!");
			}
		}
	}
	public void modify1(PresentMe uu) { // 수정2
		System.out.println("미래를 수정하시겠습니까?");
		System.out.println("1.수정 2.뒤로가기");
		int q = s.nextInt();
		s.nextLine();
		PresentMe presentme = uu; // <--- ArrayList 0번인덱스 객체주소를 유지해서 서브클래스 접근
		switch (q) {
		case 1 : presentme.modify(); break;
		}
	}
	public void prt() { // 출력
		System.out.println("본인 인증이 필요합니다");
		System.out.println("이름을 입력해주세요");
		String name = s.nextLine();
		System.out.println("생년월일 6자리를 입력해주세요");
		int age = s.nextInt();
		s.nextLine();
		System.out.println("코드KEY를 입력해주세요");
		String key = s.nextLine();
		for(PresentMe uu : FList) {
			if(uu.getName().equals(name) && uu.getAge()==age && uu.getKey().equals(key)) {
				uu.prt();
			}
		}
	}
}    
