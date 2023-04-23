package com.YeeShin.YeeShinProductManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YeeShin.YeeShinProductManagementSystem.Model.Furniture;
import com.YeeShin.YeeShinProductManagementSystem.Repository.FurnitureRepository;

@Service
public class FurnitureService {

	@Autowired
	private FurnitureRepository furnitureRepository;
	
	public List<Furniture> showAllFurniture(){
		return furnitureRepository.findAll();
	}
	
	public void saveProduct(Furniture furniture) {
		furnitureRepository.save(furniture);
	}
	
	public Optional<Furniture> findById(Integer id){
		return furnitureRepository.findById(id);
	}
	
	public void delete(Integer id) {
		furnitureRepository.deleteById(id);
	}
}
