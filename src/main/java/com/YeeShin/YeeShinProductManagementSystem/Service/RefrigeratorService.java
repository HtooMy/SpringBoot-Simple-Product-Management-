package com.YeeShin.YeeShinProductManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.YeeShin.YeeShinProductManagementSystem.Model.Refrigerator;
import com.YeeShin.YeeShinProductManagementSystem.Repository.RefrigeratorRepository;

@Service
public class RefrigeratorService {

	@Autowired
	private RefrigeratorRepository refrigeratorRepository;
	
	public List<Refrigerator> showAllRefrigerator(){
		return refrigeratorRepository.findAll();
	}
	
	public void saveProduct(Refrigerator  refrigerator) {
		refrigeratorRepository.save(refrigerator);
	}
	
	public Optional<Refrigerator> findById(Integer id){
		return refrigeratorRepository.findById(id);
	}
	
	public void delete(Integer id) {
		refrigeratorRepository.deleteById(id);
	}
}
