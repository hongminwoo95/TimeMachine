package main;

public abstract class PresentMe {
	private String name;
	private int age;
	private String key = null;

	public PresentMe() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public abstract void add();
		
	public void prt() {
		System.out.println("--------현재 인적사항------");
		System.out.println("이름 : "+name);
		System.out.println("생년월일 : "+age);
	}
	
	public abstract void modify();
	
}
