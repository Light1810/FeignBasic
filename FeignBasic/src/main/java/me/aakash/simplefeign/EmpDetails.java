package me.aakash.simplefeign;

public class EmpDetails {
	
	private String name;
	private String number;
	private int age;
	private String dept;
	
	public EmpDetails(String name, String number, int age, String dept) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.dept = dept;
	}
	public EmpDetails() {
		super();
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	
	

}
