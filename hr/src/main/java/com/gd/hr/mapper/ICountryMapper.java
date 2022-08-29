package com.gd.hr.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gd.hr.vo.Country;

@Mapper
public interface ICountryMapper {

	// 리스트
	List<Map<String, Object>> selectCountryList();
	// 추가 
	int insertCountry(Country country);
	// 삭제 
	int deleteCountry(String countryId);
	// 수정 
	int updateCountry(Country country);
	// 리스트원 
	Map<String, Object> selectCountryOne(String countryId);
}