package com.yanxin;

public class Student implements Comparable{
	private String name;
	private int age;
	private int cheng;
	public Student(String name,int age,int cheng){
		this.name=name;
		this.age=age;
		this.cheng=cheng;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	public int getCheng() {
		// TODO Auto-generated method stub
		return cheng;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student student = (Student)o;
		if(this.age>student.getAge()){
			return 1;
		}
		if(this.age==student.getAge()){
			return 0;
		}
		if(this.age<student.getAge()){
			return -1;
		}	
		return age;
	}
	
}
