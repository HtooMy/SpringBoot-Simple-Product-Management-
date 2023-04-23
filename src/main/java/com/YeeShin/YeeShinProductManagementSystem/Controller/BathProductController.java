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

import com.YeeShin.YeeShinProductManagementSystem.Model.BathProduct;
import com.YeeShin.YeeShinProductManagementSystem.Service.BathProductService;

@Controller
public class BathProductController {

	@Autowired
	private BathProductService bathProductService;
	
	@GetMapping("/bathproduct")
	public String goBathProduct(Model model) {
		List<BathProduct> bathProductList = bathProductService.showAllBathProduct();
		model.addAttribute("bathProducts", bathProductList);
		return "bathproduct";
	}
	
	@PostMapping("/bathproduct/addNew")
	public String addNew(BathProduct bathProduct) {
		bathProductService.saveProduct(bathProduct);
		return "redirect:/bathproduct";
	}
	
	@GetMapping("bathproduct/findById")
	@ResponseBody
	public Optional<BathProduct> findById(Integer id) {
		return bathProductService.findById(id);
	}
	
	@RequestMapping(value="bathproduct/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(BathProduct bathProduct) {
		bathProductService.saveProduct(bathProduct);
		return "redirect:/BathProduct";
	}
	
	@RequestMapping(value="bathproduct/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		bathProductService.delete(id);
		return "redirect:/bathproduct";
	}
}
