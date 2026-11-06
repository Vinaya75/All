package com.model;

public class Student {
	private int rollno;
	private String name;
	private String gender;
	private String course;
	private String address;
	/*public Student()
	{
	
	}*/
	public Student(int rollno,String name, String gender, String course, String address) {
		this.rollno=rollno;
		this.name=name;
		this.gender=gender;
		this.course=course;
		this.address=address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
