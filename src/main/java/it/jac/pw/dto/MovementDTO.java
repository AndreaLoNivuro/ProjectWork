package it.jac.pw.dto;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import it.jac.pw.entity.Movement;
import lombok.Data;

@Data
public class MovementDTO {

	private int id;

	private String type;

	private float amount;

	private String category;

	private String description;
	
	private Date date;

	public static MovementDTO build(Movement movement) {

		MovementDTO result = new MovementDTO();
		BeanUtils.copyProperties(movement, result);

		return result;
	}

}
