package com.YeeShin.YeeShinProductManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YeeShin.YeeShinProductManagementSystem.Model.Aircon;
import com.YeeShin.YeeShinProductManagementSystem.Repository.AirconRepository;

@Service
public class AirconService {

	@Autowired
	private AirconRepository airconRepository;
	
	public List<Aircon> showAllAircon(){
		return airconRepository.findAll();
	}
	
	public void saveProduct(Aircon aircon) {
		airconRepository.save(aircon);
	}
	
	public Optional<Aircon> findById(Integer id){
		return airconRepository.findById(id);
	}
	
	public void delete(Integer id) {
		airconRepository.deleteById(id);
	}
}
