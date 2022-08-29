package com.gd.hr.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gd.hr.service.ILocationService;
import com.gd.hr.vo.Location;

@Controller
public class LocationController {
	@Autowired ILocationService locationService;
	
	// 추가
	@GetMapping("/addLocation")
	public String addLocationForm(Model model) {
		Map<String, Object> map = locationService.addLocationForm();
		model.addAttribute("regionList", map.get("regionList"));
		// 디버깅
		System.out.println("LocationController.java addLocationForm model" + model);
		
		return "addLocation";
	}
	// 추가액션
	@PostMapping("/addLocation")
	public String addLocation(Location location) {
		// 디버깅
		System.out.println("LocationController.java addLocationForm : " + location);
		int row = locationService.addLocation(location);
		
		
		return "redirect:/locationList";
	}
}