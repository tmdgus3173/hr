package com.gd.hr.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gd.hr.service.ICountryService;
import com.gd.hr.vo.Country;
import com.gd.hr.vo.Region;

@Controller
public class CountryController {
	@Autowired ICountryService countryService;
	
	// 리스트
	@GetMapping("/countryList")
	public String countryList(Model model) {
		List<Map<String, Object>> countryList = countryService.getCountryList();		
		return "countryList";
	}
	
	// 추가
	@GetMapping("/addCountry")
	public String addCountryForm(Model model) {
		
		List<Region> regionList = countryService.addCountryForm();
				
		return "addCountry";
	}
	
	// 추가액션
	@PostMapping("/addCountry")
	public String addCountry(Country country) {
		int row = countryService.addCountry(country);
		
		return "redirect:/countryList";
	}
	
	// 수정
	@GetMapping("/modifyCountry")
	public String modifyCountry(Model model, @RequestParam(value = "countryId") String countryId) {
		Map<String, Object> countryMap = countryService.getCountryOne(countryId);
	
		List<Region> regionList = countryService.addCountryForm();
			
		return "modifyCountry";
	}
	
	// 수정액션
	@PostMapping("/modifyCountry")
	public String modifyCountry(Country country) {
		int row = countryService.modifyCountry(country);
				
		return "redirect:/countryList";
	}
	// 삭제
	@GetMapping("/removeCountry")
	public String removeCountry(@RequestParam(value = "countryId") String countryId) {
		int row = countryService.removeCountry(countryId);
		
				
		return "redirect:/countryList";
	}
}