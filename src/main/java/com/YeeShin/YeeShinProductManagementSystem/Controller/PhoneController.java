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

import com.YeeShin.YeeShinProductManagementSystem.Model.Phone;
import com.YeeShin.YeeShinProductManagementSystem.Service.PhoneService;

@Controller
public class PhoneController {

	@Autowired
	private PhoneService phoneService;
	
	@GetMapping("/phone")
	public String goPhone(Model model) {
		List<Phone> phoneList = phoneService.showAllPhone();
		model.addAttribute("phones", phoneList);
		return "phone";
	}
	
	@PostMapping("/phone/addNew")
	public String addNew(Phone phone) {
		phoneService.saveProduct(phone);
		return "redirect:/phone";
	}
	
	@GetMapping("phone/findById")
	@ResponseBody
	public Optional<Phone> findById(Integer id) {
		return phoneService.findById(id);
	}
	
	@RequestMapping(value="phone/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Phone phone) {
		phoneService.saveProduct(phone);
		return "redirect:/phone";
	}
	
	@RequestMapping(value="phone/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		phoneService.delete(id);
		return "redirect:/phone";
	}
}
