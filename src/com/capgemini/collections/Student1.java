package com.capgemini.collections;

public class Student1 implements Comparable<Student1>{
private int rollNo;
private String name;
private String branch;
public Student1() {
	super();
	
}
public Student1(int rollNo, String name, String branch) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.branch = branch;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}

@Override
public String toString() {
	return "Student1 [rollNo=" + rollNo + ", name=" + name + ", branch=" + branch + "]";
}
@Override
public int compareTo(Student1 o) {
	
	return Integer.compare(this.rollNo, o.rollNo);
}

}
