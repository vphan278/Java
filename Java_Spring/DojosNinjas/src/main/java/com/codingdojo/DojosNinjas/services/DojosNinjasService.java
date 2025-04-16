package com.codingdojo.DojosNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.DojosNinjas.models.Dojo;
import com.codingdojo.DojosNinjas.models.Ninja;
import com.codingdojo.DojosNinjas.repositories.DojoRepository;
import com.codingdojo.DojosNinjas.repositories.NinjaRepository;

@Service
public class DojosNinjasService {

	private final DojoRepository dojoRepository;
	private final NinjaRepository ninjaRepository;
	
	public DojosNinjasService(DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
		this.dojoRepository = dojoRepository;
		this.ninjaRepository = ninjaRepository;
	}
	
	
	//List all dojos
	public List<Dojo>allDojo(){
		return dojoRepository.findAll();
	}
	
	//List all ninjas
	public List<Ninja>allNinja(){
		return ninjaRepository.findAll();
	}
	
	//Create  a dojo
	public Dojo createDojo(Dojo b) {
		return dojoRepository.save(b);
	}
	
	//Create a ninja
	public Ninja createNinja(Ninja b) {
		return ninjaRepository.save(b);
	}
	
	//find a Dojo
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}
		else {
			return null;
		}
	}
	
	//find a Ninja
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		}
		else {
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
	
}
