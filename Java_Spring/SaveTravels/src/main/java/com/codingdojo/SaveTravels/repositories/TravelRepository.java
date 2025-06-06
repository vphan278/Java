package com.codingdojo.SaveTravels.repositories;

import java.util.List;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.SaveTravels.models.Travel;

@Repository
public interface TravelRepository extends CrudRepository<Travel, Long> {

  List<Travel> findAll();

  Optional<Travel> findById(Long id);

}