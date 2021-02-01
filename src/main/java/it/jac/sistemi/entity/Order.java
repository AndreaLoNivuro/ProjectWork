package it.jac.sistemi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import it.jac.sistemi.pk.PkOrder;
import lombok.Data;

@Entity
@Table(name = "order")
@IdClass(PkOrder.class)
@Data
public  class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_order")
	private int codOrder;

	@Id
	@Column(name = "cod_client")
	private int codClient;

	@Override
	public String toString() {
		return "Order [cod client = " + codClient + ", cod Order = " + codOrder + "]";
	}
	
}
