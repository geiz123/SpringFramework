package com.entity;

import java.io.Serializable;

public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	private Object address;

	private Object city;

	private Object company;

	private Object country;

	private int customerId;

	private Object email;

	private Object fax;

	private Object firstName;

	private Object lastName;

	private Object phone;

	private Object postalCode;

	private Object state;

	private int supportRepId;

	public Customer() {
	}

	public Object getAddress() {
		return this.address;
	}

	public void setAddress(Object address) {
		this.address = address;
	}

	public Object getCity() {
		return this.city;
	}

	public void setCity(Object city) {
		this.city = city;
	}

	public Object getCompany() {
		return this.company;
	}

	public void setCompany(Object company) {
		this.company = company;
	}

	public Object getCountry() {
		return this.country;
	}

	public void setCountry(Object country) {
		this.country = country;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Object getEmail() {
		return this.email;
	}

	public void setEmail(Object email) {
		this.email = email;
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

	public Object getState() {
		return this.state;
	}

	public void setState(Object state) {
		this.state = state;
	}

	public int getSupportRepId() {
		return this.supportRepId;
	}

	public void setSupportRepId(int supportRepId) {
		this.supportRepId = supportRepId;
	}

}