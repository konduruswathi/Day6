package com.capgemini.collections;

import java.util.Objects;

public class School {
private String name;
private String city;
private String schoolDistrict;
private int gradeSchoolRanking;
public School() {
	super();
	
}
public School(String name, String city, String schoolDistrict, int gradeSchoolRanking) {
	super();
	this.name = name;
	this.city = city;
	this.schoolDistrict = schoolDistrict;
	this.gradeSchoolRanking = gradeSchoolRanking;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getSchoolDistrict() {
	return schoolDistrict;
}
public void setSchoolDistrict(String schoolDistrict) {
	this.schoolDistrict = schoolDistrict;
}
public int getGradeSchoolRanking() {
	return gradeSchoolRanking;
}
public void setGradeSchoolRanking(int gradeSchoolRanking) {
	this.gradeSchoolRanking = gradeSchoolRanking;
}
@Override
public String toString() {
	return "School [name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict + ", gradeSchoolRanking="
			+ gradeSchoolRanking + "]";
}
@Override
public int hashCode() {
	return Objects.hash(name,city,schoolDistrict);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	School other = (School) obj;
	return this.name==other.name && this.city==other.city&&this.schoolDistrict==other.schoolDistrict;
}

}
