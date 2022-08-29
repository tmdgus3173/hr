package com.gd.hr.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gd.hr.service.ICountryService;
import com.gd.hr.vo.Country;

@RestController 
public class CountryRestControllser {
	@Autowired ICountryService countryService;
	
	@GetMapping("/rest/getCountryList")
	public List<Country> restGetCountryList(@RequestParam(value = "regionId") int regionId){
		List<Country> list = countryService.getCountryIdAndNameList(regionId);
		return list;
	}
}