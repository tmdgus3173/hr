package com.gd.hr.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.gd.hr.vo.Location;

@Mapper
public interface LocationMapper {
	
	int insertLocation(Location location);
}