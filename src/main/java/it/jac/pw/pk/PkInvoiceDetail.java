package it.jac.pw.pk;

import java.io.Serializable;

import lombok.Data;

@Data
public  class PkInvoiceDetail implements Serializable {

	private int codInvoice;
	
	private int line;	

}