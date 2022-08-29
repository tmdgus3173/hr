package com.gd.hr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gd.hr.vo.Region;

@Mapper // --> @Repository public class XXX implements RegionMapper {...}
public interface IRegionMapper {
	// 기본 CRUD
	List<Region> selectRegionList(); // 리스트
	int insertRegion(Region region); // 삽입
	int deleteRegion(int regionId); // 삭제
	int updateRegion(Region region); // 수정액션
	Region selectRegionOne(int regionId); // 수정폼
}