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

import com.YeeShin.YeeShinProductManagementSystem.Model.Cycle;
import com.YeeShin.YeeShinProductManagementSystem.Service.CycleService;

@Controller
public class CycleController {

	@Autowired
	private CycleService cycleService;
	
	@GetMapping("/cycle")
	public String gocycle(Model model) {
		List<Cycle> cycleList = cycleService.showAllcycle();
		model.addAttribute("cycles", cycleList);
		return "cycle";
	}
	
	@PostMapping("/cycle/addNew")
	public String addNew(Cycle cycle) {
		cycleService.saveProduct(cycle);
		return "redirect:/cycle";
	}
	
	@GetMapping("cycle/findById")
	@ResponseBody
	public Optional<Cycle> findById(Integer id) {
		return cycleService.findById(id);
	}
	
	@RequestMapping(value="cycle/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Cycle cycle) {
		cycleService.saveProduct(cycle);
		return "redirect:/cycle";
	}
	
	@RequestMapping(value="cycle/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		cycleService.delete(id);
		return "redirect:/cycle";
	}
}
