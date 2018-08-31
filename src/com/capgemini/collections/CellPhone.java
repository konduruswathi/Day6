package com.capgemini.collections;

import java.util.Objects;

public class CellPhone {
private String company;
private String model;
private String description;
private String operatingSystem;
private double price;
public CellPhone() {
	super();
	
}
public CellPhone(String company, String model, String description, String operatingSystem, double price) {
	super();
	this.company = company;
	this.model = model;
	this.description = description;
	operatingSystem = operatingSystem;
	this.price = price;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getOperatingSystem() {
	return operatingSystem;
}
public void setOperatingSystem(String operatingSystem) {
	operatingSystem = operatingSystem;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "CellPhone [company=" + company + ", model=" + model + ", description=" + description + ", OperatingSystem="
			+ operatingSystem + ", price=" + price + "]";
}
@Override
public int hashCode() {
	return Objects.hash(company,model,operatingSystem);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CellPhone other = (CellPhone) obj;
	return this.company==other.company && this.model==other.model&&this.operatingSystem==operatingSystem;
}
}