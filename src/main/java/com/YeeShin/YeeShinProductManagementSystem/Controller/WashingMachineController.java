package com.YeeShin.YeeShinProductManagementSystem.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.YeeShin.YeeShinProductManagementSystem.Model.WashingMachine;
import com.YeeShin.YeeShinProductManagementSystem.Service.WashingMachineService;


@Controller
public class WashingMachineController {

	@Autowired
	private WashingMachineService washingMachineService;
	
	@GetMapping("/washingMachine")
	public String gowashingMachine(Model model) {
		List<WashingMachine> washingMachineList = washingMachineService.showAllWashingMachine();
		model.addAttribute("washingMachines", washingMachineList);
		return "washingMachine";
	}
	
	@PostMapping("/washingMachine/addNew")
	public String addNew(WashingMachine washingMachine) {
		washingMachineService.saveProduct(washingMachine);
		return "redirect:/washingMachine";
	}
	
	@GetMapping("washingMachine/findById")
	@ResponseBody
	public Optional<WashingMachine> findById(Integer id) {
		return washingMachineService.findById(id);
	}
	
	@RequestMapping(value="washingMachine/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(WashingMachine washingMachine) {
		washingMachineService.saveProduct(washingMachine);
		return "redirect:/washingMachine";
	}
	
	@RequestMapping(value="washingMachine/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		washingMachineService.delete(id);
		return "redirect:/washingMachine";
	}
}
