package com.YeeShin.YeeShinProductManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YeeShin.YeeShinProductManagementSystem.Model.WashingMachine;
import com.YeeShin.YeeShinProductManagementSystem.Repository.WashingMachineRepository;

@Service
public class WashingMachineService {

	@Autowired
	private WashingMachineRepository washingMachineRepository;
	
	public List<WashingMachine> showAllWashingMachine(){
		return washingMachineRepository.findAll();
	}
	
	public void saveProduct(WashingMachine washingMachine) {
		washingMachineRepository.save(washingMachine);
	}
	
	public Optional<WashingMachine> findById(Integer id){
		return washingMachineRepository.findById(id);
	}
	
	public void delete(Integer id) {
		washingMachineRepository.deleteById(id);
	}
}
