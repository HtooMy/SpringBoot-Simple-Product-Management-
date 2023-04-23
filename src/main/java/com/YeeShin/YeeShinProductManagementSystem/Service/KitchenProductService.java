package com.YeeShin.YeeShinProductManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YeeShin.YeeShinProductManagementSystem.Model.KitchenProduct;
import com.YeeShin.YeeShinProductManagementSystem.Repository.KitchenRepository;

@Service
public class KitchenProductService {

	@Autowired
	private KitchenRepository kitchenProductRepository;
	
	public List<KitchenProduct> showAllKitchenProduct(){
		return kitchenProductRepository.findAll();
	}
	
	public void saveProduct(KitchenProduct kitchenProduct) {
		kitchenProductRepository.save(kitchenProduct);
	}
	
	public Optional<KitchenProduct> findById(Integer id){
		return kitchenProductRepository.findById(id);
	}
	
	public void delete(Integer id) {
		kitchenProductRepository.deleteById(id);
	}
}
