package com.entity;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	private Object address;

	private Object birthDate;

	private Object city;

	private Object country;

	private Object email;

	private int employeeId;

	private Object fax;

	private Object firstName;

	private Object hireDate;

	private Object lastName;

	private Object phone;

	private Object postalCode;

	private int reportsTo;

	private Object state;

	private Object title;

	public Employee() {
	}

	public Object getAddress() {
		return this.address;
	}

	public void setAddress(Object address) {
		this.address = address;
	}

	public Object getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Object birthDate) {
		this.birthDate = birthDate;
	}

	public Object getCity() {
		return this.city;
	}

	public void setCity(Object city) {
		this.city = city;
	}

	public Object getCountry() {
		return this.country;
	}

	public void setCountry(Object country) {
		this.country = country;
	}

	public Object getEmail() {
		return this.email;
	}

	public void setEmail(Object email) {
		this.email = email;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Object getFax() {
		return this.fax;
	}

	public void setFax(Object fax) {
		this.fax = fax;
	}

	public Object getFirstName() {
		return this.firstName;
	}

	public void setFirstName(Object firstName) {
		this.firstName = firstName;
	}

	public Object getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(Object hireDate) {
		this.hireDate = hireDate;
	}

	public Object getLastName() {
		return this.lastName;
	}

	public void setLastName(Object lastName) {
		this.lastName = lastName;
	}

	public Object getPhone() {
		return this.phone;
	}

	public void setPhone(Object phone) {
		this.phone = phone;
	}

	public Object getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(Object postalCode) {
		this.postalCode = postalCode;
	}

	public int getReportsTo() {
		return this.reportsTo;
	}

	public void setReportsTo(int reportsTo) {
		this.reportsTo = reportsTo;
	}

	public Object getState() {
		return this.state;
	}

	public void setState(Object state) {
		this.state = state;
	}

	public Object getTitle() {
		return this.title;
	}

	public void setTitle(Object title) {
		this.title = title;
	}

}