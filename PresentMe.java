package main;

public abstract class PresentMe {
	String name;
	int age;
	String adds;
	
	public PresentMe() {
		
	}
	
	public  abstract void add(); 
		
	public void prt() {
		System.out.println("현재 인적사항");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("주소 ㅣ "+adds);
		System.out.println("-----------------------");
	}
	
}
