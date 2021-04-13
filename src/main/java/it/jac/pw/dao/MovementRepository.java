package it.jac.pw.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.jac.pw.entity.Movement;

@Repository
public interface MovementRepository extends CrudRepository<Movement, String> {
	
}