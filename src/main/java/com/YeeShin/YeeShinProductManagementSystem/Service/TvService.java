package com.YeeShin.YeeShinProductManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.YeeShin.YeeShinProductManagementSystem.Model.TV;
import com.YeeShin.YeeShinProductManagementSystem.Repository.TvRepository;

@Service
public class TvService {
	
	@Autowired
	private TvRepository tvRepository;
	
	public List<TV> showAllRefrigerator(){
		return tvRepository.findAll();
	}
	
	public void saveProduct(TV  tv) {
		tvRepository.save(tv);
	}
	
	public Optional<TV> findById(Integer id){
		return tvRepository.findById(id);
	}
	
	public void delete(Integer id) {
		tvRepository.deleteById(id);
	}
}
