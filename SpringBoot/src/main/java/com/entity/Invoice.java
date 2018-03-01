package com.entity;

import java.io.Serializable;
import java.util.Date;

public class Invoice implements Serializable {
	private static final long serialVersionUID = 1L;

	private Object billingAddress;

	private Object billingCity;

	private Object billingCountry;

	private Object billingPostalCode;

	private Object billingState;

	private int customerId;

	private Date invoiceDate;

	private int invoiceId;

	private Object total;

	public Invoice() {
	}

	public Object getBillingAddress() {
		return this.billingAddress;
	}

	public void setBillingAddress(Object billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Object getBillingCity() {
		return this.billingCity;
	}

	public void setBillingCity(Object billingCity) {
		this.billingCity = billingCity;
	}

	public Object getBillingCountry() {
		return this.billingCountry;
	}

	public void setBillingCountry(Object billingCountry) {
		this.billingCountry = billingCountry;
	}

	public Object getBillingPostalCode() {
		return this.billingPostalCode;
	}

	public void setBillingPostalCode(Object billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
	}

	public Object getBillingState() {
		return this.billingState;
	}

	public void setBillingState(Object billingState) {
		this.billingState = billingState;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public int getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Object getTotal() {
		return this.total;
	}

	public void setTotal(Object total) {
		this.total = total;
	}

}