package it.jac.pw.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.jac.pw.dao.MovementRepository;
import it.jac.pw.dto.Response;
import it.jac.pw.dto.MovementDTO;
import it.jac.pw.entity.Movement;

@Service
public class MovementService {

	private static Logger log = LoggerFactory.getLogger(MovementService.class);

	@Autowired
	private MovementRepository movementRepository;

	public Response<Movement> createMovement(Movement movement) {

		Response<Movement> response = new Response<Movement>();

		try {

			response.setResult(this.movementRepository.save(movement));
			
			log.info("Movimento creato/modificato.");

		} catch (Exception e) {

			response.setError("Movimento non creato/modificato.");
			
			log.info("Movimento non creato/modificato.");

		}

		return response;

	}


	public Response<String> deleteMovement(Movement movement) {

		Response<String> response = new Response<String>();

		try {

			this.movementRepository.delete(movement);			

			response.setResult("Movimento eliminato.");
			
			log.info("Movimento eliminato.");

		} catch (Exception e) {

			response.setError("Movimento non eliminato.");

			log.info("Movimento non eliminato.");
			
		}

		return response;

	}


	public Response<List<MovementDTO>> findAllMovements() {

		Response<List<MovementDTO>> response = new Response<List<MovementDTO>>();

		List<MovementDTO> result = new ArrayList<>();

		try {

			Iterator<Movement> iterator = this.movementRepository.findAll().iterator();

			while(iterator.hasNext()) {

				Movement movement = iterator.next();
				result.add(MovementDTO.build(movement));

			}

			response.setResult(result);
			
			log.info("Lista movimenti.");

		} catch (Exception e) {

			response.setError("Nessun elemento trovato.");
			
			log.info("Nessun elemento trovato.");

		}

		return response;

	}

}
