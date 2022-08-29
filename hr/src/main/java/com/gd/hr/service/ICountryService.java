package com.gd.hr.service;

import java.util.List;
import java.util.Map;

import com.gd.hr.vo.Country;
import com.gd.hr.vo.Region;

public interface ICountryService {
	
	// 리스트
	List<Map<String, Object>> getCountryList();
	// 추가
	List<Region> addCountryForm();
	// 추가
	int addCountry(Country country);
	// 삭제
	int removeCountry(String countryId);
	// 수정
	int modifyCountry(Country country);
	// 리스트원
	Map<String, Object> getCountryOne(String countryId);
	List<Country> getCountryIdAndNameList(int regionId);
	
}