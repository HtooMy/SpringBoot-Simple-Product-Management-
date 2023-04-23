package com.YeeShin.YeeShinProductManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YeeShin.YeeShinProductManagementSystem.Model.BathProduct;
import com.YeeShin.YeeShinProductManagementSystem.Model.Phone;
import com.YeeShin.YeeShinProductManagementSystem.Repository.BathProductRepository;

@Service
public class BathProductService {

	@Autowired
	private BathProductRepository bathProductRepository;
	
	public List<BathProduct> showAllBathProduct(){
		return bathProductRepository.findAll();
	}
	
	public void saveProduct(BathProduct bathProduct) {
		bathProductRepository.save(bathProduct);
	}
	
	public Optional<BathProduct> findById(Integer id){
		return bathProductRepository.findById(id);
	}
	
	public void delete(Integer id) {
		bathProductRepository.deleteById(id);
	}
}
