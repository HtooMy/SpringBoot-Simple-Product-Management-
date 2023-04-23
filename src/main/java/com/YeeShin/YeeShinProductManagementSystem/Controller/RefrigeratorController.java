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

import com.YeeShin.YeeShinProductManagementSystem.Model.Refrigerator;
import com.YeeShin.YeeShinProductManagementSystem.Service.RefrigeratorService;

@Controller
public class RefrigeratorController {

	@Autowired
	private RefrigeratorService refrigeratorService;
	
	@GetMapping("/refrigerator")
	public String goPhone(Model model) {
		List<Refrigerator> refrigeratorList = refrigeratorService.showAllRefrigerator();
		model.addAttribute("refrigerators", refrigeratorList);
		return "refrigerator";
	}
	
	@PostMapping("/refrigerator/addNew")
	public String addNew(Refrigerator refrigerator) {
		refrigeratorService.saveProduct(refrigerator);
		return "redirect:/refrigerator";
	}
	
	@GetMapping("refrigerator/findById")
	@ResponseBody
	public Optional<Refrigerator> findById(Integer id) {
		return refrigeratorService.findById(id);
	}
	
	@RequestMapping(value="refrigerator/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Refrigerator refrigerator) {
		refrigeratorService.saveProduct(refrigerator);
		return "redirect:/refrigerator";
	}
	
	@RequestMapping(value="refrigerator/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		refrigeratorService.delete(id);
		return "redirect:/refrigerator";
	}
}
