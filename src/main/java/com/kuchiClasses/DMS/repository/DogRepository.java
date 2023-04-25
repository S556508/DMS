package com.kuchiClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kuchiClasses.DMS.Models.Dog;

/**
 * @author Yudu Eswar Vinay Pratap Kumar Kuchi - S555080
 *
 */

public interface DogRepository extends CrudRepository<Dog, Integer> {
		List<Dog> findByName(String name);
}
