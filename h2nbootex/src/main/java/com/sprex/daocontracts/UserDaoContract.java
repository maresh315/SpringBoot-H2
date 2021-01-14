package com.sprex.daocontracts;

import javax.transaction.Transactional;

import com.sprex.models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserDaoContract extends CrudRepository<User, Integer>{
	
	/**
	 * Generally this can be kept blank unless
	 * 	you need to implement further functionality
	 * 	besides the simple CRUD methods.
	 * That being:
	 * 			- (C)reate .save
	 * 			- (R)ead .findById
	 * 			- (U)pdate ,save
	 * 			- (D)elete .delete
	 * 
	 * Also, if you do not need further implementation
	 * 	then you can skip a service file entirely and 
	 * 	go directly to the controller class utilizing
	 * 	the Dao Contract.
	 */
	
}
