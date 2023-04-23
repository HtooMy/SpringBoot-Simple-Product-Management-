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
import com.YeeShin.YeeShinProductManagementSystem.Model.TV;
import com.YeeShin.YeeShinProductManagementSystem.Service.TvService;

@Controller
public class TvController {

	@Autowired
	private TvService tvService;
	
	@GetMapping("/tv")
	public String goPhone(Model model) {
		List<TV> tvList = tvService.showAllRefrigerator();
		model.addAttribute("tvs", tvList);
		return "tv";
	}
	
	@PostMapping("/tv/addNew")
	public String addNew(TV tv) {
		tvService.saveProduct(tv);
		return "redirect:/tv";
	}
	
	@GetMapping("tv/findById")
	@ResponseBody
	public Optional<TV> findById(Integer id) {
		return tvService.findById(id);
	}
	
	@RequestMapping(value="tv/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(TV tv) {
		tvService.saveProduct(tv);
		return "redirect:/tv";
	}
	
	@RequestMapping(value="tv/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		tvService.delete(id);
		return "redirect:/tv";
	}
}
