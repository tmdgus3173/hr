package com.gd.hr.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gd.hr.mapper.LocationMapper;
import com.gd.hr.mapper.IRegionMapper;
import com.gd.hr.vo.Location;
import com.gd.hr.vo.Region;

@Service
@Transactional
public class LocationService implements ILocationService {
	@Autowired LocationMapper locationMapper;
	@Autowired IRegionMapper regionMapper;
	
	// 추가
	@Override
	public Map<String, Object> addLocationForm() {
		Map<String, Object> resultMap = new HashMap<>();
		List<Region> regionList = regionMapper.selectRegionList();
		resultMap.put("regionList", regionList);
		return resultMap;
	}
	// 추가액숀
	@Override
	public int addLocation(Location location) {
		return locationMapper.insertLocation(location);
	}
}