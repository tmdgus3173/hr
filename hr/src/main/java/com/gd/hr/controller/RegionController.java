package com.gd.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gd.hr.service.IRegionService;
import com.gd.hr.vo.Region;

@Controller
public class RegionController {
	@Autowired IRegionService regionService; // <- new RegionService()
	
	// 기본 CRUD
	
	// addRegion form
	@GetMapping("/addRegion") // form
	public String addRegion() {
		return "addRegion";
	}
	
	// addRegion action
	@PostMapping("/addRegion") // action // 혹시 매핑이 중복되면 톰캣이 실행되지 않는다.
	public String addRegion(Region region) { // @RequestParam(value = "regionId", defaultValue = "1") int regionId -> int regionId = request.getParameter("regionId")
		// 디버깅
		System.out.println(region);
		
		int row = regionService.addRegion(region);
		// 디버깅
		System.out.println(row + " <-- add row");
		
		return "redirect:/regionList"; // regionList redirect
	}
	
	// regionList
	// @RequestMapping(method = GET) GET, POST, T(total)
	@GetMapping("/regionList")
	public String regionList(Model model) { // 뷰 이름만 리턴 (모델을 따로 보내야 함 - 파라미터로), 같이 보낼때 ModelAndVeiw
		List<Region> list = regionService.getRegionList();
		
		model.addAttribute("list", list); // request.setAttribute("list", list) 와 비슷한 역할
		
		// 디버깅
		System.out.println(list);
		
		return "regionList"; // forward 역할
	}
	
	// remove action
	@GetMapping("/removeRegion")
	public String removeRegion(@RequestParam(value = "regionId") int regionId) { // 형변환
		
		int row = regionService.removeRegion(regionId);
		// 디버깅
		System.out.println(row + " <-- remove row");
		
		return "redirect:/regionList";
	}
	
	// modify form
	@GetMapping("/modifyRegion") 
	public String modifyRegion(Model model, @RequestParam(value = "regionId") int regionId) {
		Region region = regionService.getRegionOne(regionId);
		model.addAttribute("region", region);
		
		return "modifyRegion";
	}
	
	// modify action
	@PostMapping("/modifyRegion") 
	public String modifyRegion(Region region) {
		int row = regionService.modifyRegion(region);
		// 디버깅
		System.out.println(row + " <-- modify row");
		
		return "redirect:/regionList";
	}
}