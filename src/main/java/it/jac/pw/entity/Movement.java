package it.jac.pw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "movement")
@Data
public class Movement {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "amount")
	private String amount;

	@Column(name = "category")
	private String category;
	
	@Column(name = "description")
	private String description;

	@Override
	public String toString() {
		return "Movement [id = " + id + ", type = " + type + ", amount = " + amount + ", category = " + category + "]";
	}

}
