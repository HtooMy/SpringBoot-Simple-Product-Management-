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

import com.YeeShin.YeeShinProductManagementSystem.Model.KitchenProduct;
import com.YeeShin.YeeShinProductManagementSystem.Service.KitchenProductService;


@Controller
public class KitchenProductController {

	@Autowired
	private KitchenProductService kitchenProductService;
	
	@GetMapping("/kitchen-product")
	public String gokitchenproduct(Model model) {
		List<KitchenProduct> kitchenProductList = kitchenProductService.showAllKitchenProduct();
		model.addAttribute("kitchenProducts", kitchenProductList);
		return "kitchen-product";
	}
	
	@PostMapping("/kitchen-product/addNew")
	public String addNew(KitchenProduct kitchenProduct) {
		kitchenProductService.saveProduct(kitchenProduct);
		return "redirect:/kitchen-product";
	}
	
	@GetMapping("kitchen-product/findById")
	@ResponseBody
	public Optional<KitchenProduct> findById(Integer id) {
		return kitchenProductService.findById(id);
	}
	
	@RequestMapping(value="kitchen-product/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(KitchenProduct kitchenProduct) {
		kitchenProductService.saveProduct(kitchenProduct);
		return "redirect:/kitchen-product";
	}
	
	@RequestMapping(value="kitchen-product/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		kitchenProductService.delete(id);
		return "redirect:/kitchen-product";
	}
}
