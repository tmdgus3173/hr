package com.gd.hr.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gd.hr.mapper.ICountryMapper;
import com.gd.hr.mapper.IRegionMapper;
import com.gd.hr.vo.Country;
import com.gd.hr.vo.Region;

@Service
@Transactional
public class CountryService implements ICountryService {
	@Autowired ICountryMapper countryMapper;
	@Autowired IRegionMapper regionMapper;
	
	// 전체
	@Override
	public List<Map<String, Object>> getCountryList() {
		return countryMapper.selectCountryList();
	}
	// 추가
	@Override
	public List<Region> addCountryForm() {
		List<Region> regionList = regionMapper.selectRegionList();
		return regionList;
	}
	// 추가 액션
	@Override
	public int addCountry(Country country) {
		return countryMapper.insertCountry(country);
	}
	// 삭제 
	@Override
	public int removeCountry(String countryId) {
		return countryMapper.deleteCountry(countryId);
	}
	// 수정 
	@Override
	public int modifyCountry(Country country) {
		return countryMapper.updateCountry(country);
	}
	// 리스트원
	@Override
	public Map<String, Object> getCountryOne(String countryId) {
		return countryMapper.selectCountryOne(countryId);
	}
	@Override
	public List<Country> getCountryIdAndNameList(int regionId) {
		// TODO Auto-generated method stub
		return null;
	}
}