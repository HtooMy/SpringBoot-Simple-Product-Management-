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

import com.YeeShin.YeeShinProductManagementSystem.Model.Furniture;
import com.YeeShin.YeeShinProductManagementSystem.Service.FurnitureService;

@Controller
public class FurnitureController {

	@Autowired
	private FurnitureService furnitureService;
	
	@GetMapping("/furniture")
	public String gofurniture(Model model) {
		List<Furniture> furnitureList = furnitureService.showAllFurniture();
		model.addAttribute("furnitures", furnitureList);
		return "furniture";
	}
	
	@PostMapping("/furniture/addNew")
	public String addNew(Furniture furniture) {
		furnitureService.saveProduct(furniture);
		return "redirect:/furniture";
	}
	
	@GetMapping("furniture/findById")
	@ResponseBody
	public Optional<Furniture> findById(Integer id) {
		return furnitureService.findById(id);
	}
	
	@RequestMapping(value="furniture/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Furniture furniture) {
		furnitureService.saveProduct(furniture);
		return "redirect:/furniture";
	}
	
	@RequestMapping(value="furniture/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		furnitureService.delete(id);
		return "redirect:/furniture";
	}
}
