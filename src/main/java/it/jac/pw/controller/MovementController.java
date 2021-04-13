package it.jac.pw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.jac.pw.service.MovementService;
import it.jac.pw.dto.Response;
import it.jac.pw.entity.Movement;

@RestController
@RequestMapping("/movement")
public class MovementController {
	
	private static Logger log = LoggerFactory.getLogger(MovementController.class);

	@Autowired
	private MovementService movementService;
	
	@PostMapping("/create")
	public Response<?> createMovement(
			@RequestBody Movement movement
			) {
		
		log.info("Richiesta di create Movement.");

		return movementService.createMovement(movement);

	}
	
	@GetMapping(path="/findAll")
	public Response<?> findAllMovements() {
		
		log.info("Richiesta di find all Movements.");
		
		return movementService.findAllMovements();
		
	}
	
	@PostMapping(path = "/delete")
	public Response<?> deleteMovement(
			@RequestBody Movement movement
			) {

		log.info("Richiesta di delete Movement.");

		return movementService.deleteMovement(movement);
		
	}

}
