package com.YeeShin.YeeShinProductManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YeeShin.YeeShinProductManagementSystem.Model.Safe;
import com.YeeShin.YeeShinProductManagementSystem.Repository.SafeRepository;

@Service
public class SafeService {

	@Autowired
	private SafeRepository safeRepository;
	
	public List<Safe> showAllsafe(){
		return safeRepository.findAll();
	}
	
	public void saveProduct(Safe safe) {
		safeRepository.save(safe);
	}
	
	public Optional<Safe> findById(Integer id){
		return safeRepository.findById(id);
	}
	
	public void delete(Integer id) {
		safeRepository.deleteById(id);
	}
}
