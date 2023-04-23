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

import com.YeeShin.YeeShinProductManagementSystem.Model.Safe;
import com.YeeShin.YeeShinProductManagementSystem.Service.SafeService;

@Controller
public class SafeController {

	@Autowired
	private SafeService safeService;
	
	@GetMapping("/safe")
	public String gosafe(Model model) {
		List<Safe> safeList = safeService.showAllsafe();
		model.addAttribute("safes", safeList);
		return "safe";
	}
	
	@PostMapping("/safe/addNew")
	public String addNew(Safe safe) {
		safeService.saveProduct(safe);
		return "redirect:/safe";
	}
	
	@GetMapping("safe/findById")
	@ResponseBody
	public Optional<Safe> findById(Integer id) {
		return safeService.findById(id);
	}
	
	@RequestMapping(value="safe/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Safe safe) {
		safeService.saveProduct(safe);
		return "redirect:/safe";
	}
	
	@RequestMapping(value="safe/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		safeService.delete(id);
		return "redirect:/safe";
	}
}
