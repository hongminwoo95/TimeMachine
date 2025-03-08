package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin  {
	Scanner s = new Scanner(System.in);
	
	ArrayList<PresentMe> FList = new ArrayList<>();
	
	public Admin() {
		boolean flag = true;
		while (flag) {
			System.out.println("타임머신을 활용하여 미래를 조회를 해보시겠습니까?");
			System.out.println("미래는 10년, 20년의 미래를 확인할수 있습니다");
			System.out.println("1.등록 2.미래조회 3.종료");
			String a = s.nextLine();
			switch(a) {
			case "1" : add(); break;
			case "2" : prt(); break;
			default : flag=false;
			}
			System.out.println("종료합니다");
		}
	}
	public void add() { // 등록
		System.out.println("1.10년후, 2.20년후");
		int q = s.nextInt();
		s.nextLine();
		PresentMe a = null;
		switch (q) {
		case 1 : a = new Future10Year(); break;
		case 2 : a = new Future20Year(); break;
		}
		a.add();
		FList.add(a);
	}
	
	public void prt() {
		for(PresentMe uu : FList) {
			uu.prt();
		}
	}
	
}
