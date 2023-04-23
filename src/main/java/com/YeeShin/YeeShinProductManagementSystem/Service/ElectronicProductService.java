package com.YeeShin.YeeShinProductManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YeeShin.YeeShinProductManagementSystem.Model.ElectronicProduct;
import com.YeeShin.YeeShinProductManagementSystem.Repository.ElectronicProductRepository;

@Service
public class ElectronicProductService {

	@Autowired
	private ElectronicProductRepository electronicProductRepository;
	
	public List<ElectronicProduct> showAllElectronicProduct(){
		return electronicProductRepository.findAll();
	}
	
	public void saveProduct(ElectronicProduct electronicProduct) {
		electronicProductRepository.save(electronicProduct);
	}
	
	public Optional<ElectronicProduct> findById(Integer id){
		return electronicProductRepository.findById(id);
	}
	
	public void delete(Integer id) {
		electronicProductRepository.deleteById(id);
	}
}
