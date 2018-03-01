package com.entity;

import java.io.Serializable;

public class InvoiceItem implements Serializable {
	private static final long serialVersionUID = 1L;

	private int invoiceId;

	private int invoiceLineId;

	private int quantity;

	private int trackId;

	private Object unitPrice;

	public InvoiceItem() {
	}

	public int getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getInvoiceLineId() {
		return this.invoiceLineId;
	}

	public void setInvoiceLineId(int invoiceLineId) {
		this.invoiceLineId = invoiceLineId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTrackId() {
		return this.trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

	public Object getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Object unitPrice) {
		this.unitPrice = unitPrice;
	}

}