package com.YeeShin.YeeShinProductManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YeeShin.YeeShinProductManagementSystem.Model.Generator;
import com.YeeShin.YeeShinProductManagementSystem.Repository.GeneratorRepository;

@Service
public class GeneratorService {

	@Autowired
	private GeneratorRepository generatorRepository;
	
	public List<Generator> showAllGenerator(){
		return generatorRepository.findAll();
	}
	
	public void saveProduct(Generator generator) {
		generatorRepository.save(generator);
	}
	
	public Optional<Generator> findById(Integer id){
		return generatorRepository.findById(id);
	}
	
	public void delete(Integer id) {
		generatorRepository.deleteById(id);
	}
}
