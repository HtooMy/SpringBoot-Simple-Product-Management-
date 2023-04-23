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

import com.YeeShin.YeeShinProductManagementSystem.Model.ElectronicProduct;
import com.YeeShin.YeeShinProductManagementSystem.Service.ElectronicProductService;



@Controller
public class ElectronicProductController {

	@Autowired
	private ElectronicProductService electronicProductService;
	
	@GetMapping("/electronic-product")
	public String goelectronicproduct(Model model) {
		List<ElectronicProduct> electronicproductList = electronicProductService.showAllElectronicProduct();
		model.addAttribute("electronicproducts", electronicproductList);
		return "electronic-product";
	}
	
	@PostMapping("/electronic-product/addNew")
	public String addNew(ElectronicProduct electronicproduct) {
		electronicProductService.saveProduct(electronicproduct);
		return "redirect:/electronic-product";
	}
	
	@GetMapping("electronic-product/findById")
	@ResponseBody
	public Optional<ElectronicProduct> findById(Integer id) {
		return electronicProductService.findById(id);
	}
	
	@RequestMapping(value="electronic-product/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(ElectronicProduct electronicproduct) {
		electronicProductService.saveProduct(electronicproduct);
		return "redirect:/electronic-product";
	}
	
	@RequestMapping(value="electronic-product/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		electronicProductService.delete(id);
		return "redirect:/electronic-product";
	}
}
