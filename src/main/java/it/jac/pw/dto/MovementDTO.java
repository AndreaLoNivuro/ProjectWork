package it.jac.pw.dto;

import org.springframework.beans.BeanUtils;

import it.jac.pw.entity.Movement;
import lombok.Data;

@Data
public class MovementDTO {

	private String id;

	private String type;

	private String amount;

	private String category;

	private String description;

	public static MovementDTO build(Movement movement) {

		MovementDTO result = new MovementDTO();
		BeanUtils.copyProperties(movement, result);

		return result;
	}

}
