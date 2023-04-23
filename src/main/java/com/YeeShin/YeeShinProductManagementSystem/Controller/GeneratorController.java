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

import com.YeeShin.YeeShinProductManagementSystem.Model.Generator;
import com.YeeShin.YeeShinProductManagementSystem.Service.GeneratorService;

@Controller
public class GeneratorController {

	@Autowired
	private GeneratorService generatorService;
	
	@GetMapping("/generator")
	public String gogenerator(Model model) {
		List<Generator> generatorList = generatorService.showAllGenerator();
		model.addAttribute("generators", generatorList);
		return "generator";
	}
	
	@PostMapping("/generator/addNew")
	public String addNew(Generator generator) {
		generatorService.saveProduct(generator);
		return "redirect:/generator";
	}
	
	@GetMapping("generator/findById")
	@ResponseBody
	public Optional<Generator> findById(Integer id) {
		return generatorService.findById(id);
	}
	
	@RequestMapping(value="generator/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Generator generator) {
		generatorService.saveProduct(generator);
		return "redirect:/generator";
	}
	
	@RequestMapping(value="generator/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		generatorService.delete(id);
		return "redirect:/generator";
	}
}
