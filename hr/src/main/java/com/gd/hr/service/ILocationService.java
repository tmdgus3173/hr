package com.gd.hr.service;

import java.util.Map;

import com.gd.hr.vo.Location;

public interface ILocationService {
	Map<String, Object> addLocationForm();
	
	int addLocation(Location location);
}