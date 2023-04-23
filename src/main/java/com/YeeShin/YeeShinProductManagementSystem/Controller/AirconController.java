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

import com.YeeShin.YeeShinProductManagementSystem.Model.Aircon;
import com.YeeShin.YeeShinProductManagementSystem.Service.AirconService;

@Controller
public class AirconController {

	@Autowired
	private AirconService airconService;

	@GetMapping("/aircon")
	public String goaircon(Model model) {
		List<Aircon> airconList = airconService.showAllAircon();
		model.addAttribute("aircons", airconList);
		return "aircon";
	}

	@PostMapping("/aircon/addNew")
	public String addNew(Aircon aircon) {
		airconService.saveProduct(aircon);
		return "redirect:/aircon";
	}

	@GetMapping("aircon/findById")
	@ResponseBody
	public Optional<Aircon> findById(Integer id) {
		return airconService.findById(id);
	}

	@RequestMapping(value = "aircon/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Aircon aircon) {
		airconService.saveProduct(aircon);
		return "redirect:/aircon";
	}

	@RequestMapping(value = "aircon/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer id) {
		airconService.delete(id);
		return "redirect:/aircon";
	}
}
