package com.YeeShin.YeeShinProductManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YeeShin.YeeShinProductManagementSystem.Model.Cycle;
import com.YeeShin.YeeShinProductManagementSystem.Repository.CycleRepository;

@Service
public class CycleService {

	@Autowired
	private CycleRepository cycleRepository;

	public List<Cycle> showAllcycle() {
		return cycleRepository.findAll();
	}

	public void saveProduct(Cycle cycle) {
		cycleRepository.save(cycle);
	}

	public Optional<Cycle> findById(Integer id) {
		return cycleRepository.findById(id);
	}

	public void delete(Integer id) {
		cycleRepository.deleteById(id);
	}
}
