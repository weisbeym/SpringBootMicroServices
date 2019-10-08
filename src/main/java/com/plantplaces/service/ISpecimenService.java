package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;


/**
 * CRUD operations for specimens
 * @author yismo
 *
 */
public interface ISpecimenService {

	/**
	 * GET specimens from persistence layer
	 * @param id a unique lookup
	 * @return a specimen with a matching id
	 */
	SpecimenDTO fetchById(int id);

	/**
	 * Persistence of the given DTO
	 * @param specimenDTO 
	 */
	void save(SpecimenDTO specimenDTO);

}