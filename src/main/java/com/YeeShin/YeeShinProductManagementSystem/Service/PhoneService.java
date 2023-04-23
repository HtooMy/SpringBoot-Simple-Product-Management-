package com.YeeShin.YeeShinProductManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YeeShin.YeeShinProductManagementSystem.Model.Phone;
import com.YeeShin.YeeShinProductManagementSystem.Repository.PhoneRepository;

@Service
public class PhoneService {

	@Autowired
	private PhoneRepository phoneRepository;
	
	public List<Phone> showAllPhone(){
		return phoneRepository.findAll();
	}
	
	public void saveProduct(Phone phone) {
		phoneRepository.save(phone);
	}
	
	public Optional<Phone> findById(Integer id){
		return phoneRepository.findById(id);
	}
	
	public void delete(Integer id) {
		phoneRepository.deleteById(id);
	}
}
