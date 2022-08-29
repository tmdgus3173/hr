package com.gd.hr.service;

import java.util.List;

import com.gd.hr.vo.Region;

public interface IRegionService {
	// 기본 CRUD
	List<Region> getRegionList(); // 리스트
	int addRegion(Region region); // 삽입
	int removeRegion(int regionId); // 삭제
	int modifyRegion(Region region); // 수정액션
	Region getRegionOne(int regionId); // 수정폼
}