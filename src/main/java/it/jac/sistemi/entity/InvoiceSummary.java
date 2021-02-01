package it.jac.sistemi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import it.jac.sistemi.pk.PkInvoiceSummary;
import lombok.Data;

@Entity
@Table(name = "invoices_summary")
@IdClass(PkInvoiceSummary.class)
@Data
public  class InvoiceSummary {

	@Id
	@Column(name = "cod_invoice")
	private int codInvoice;

	@Id
	@Column(name = "total_amount")
	private float totalAmount;
	
	@Column(name = "payment")
	private String payment;
	
	@Column(name = "currency")
	private int currency;
	
	@Column(name = "vat")
	private float vat;
	
	@Column(name = "taxable")
	private float taxable;

	@Override
	public String toString() {
		return "Invoice summary [cod invoice = " + codInvoice + ", total amount = " + totalAmount + "]";
	}
	
}
