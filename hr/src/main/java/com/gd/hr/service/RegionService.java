package com.gd.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gd.hr.mapper.IRegionMapper;
import com.gd.hr.vo.Region;

@Service
@Transactional
public class RegionService implements IRegionService {
	// DI : 객체를 직접 생성하지 않고 스프링 프레임워크를 통해(bean객체) 주입받는다.
	// Interface 타입을 사용 (디커플링, 결합도를 낮춘다)
	@Autowired IRegionMapper regionMapper;
	
	// 기본 CRUD
	@Override
	public List<Region> getRegionList() { // 리스트
		return regionMapper.selectRegionList();
	}
	@Override
	public int addRegion(Region region) { // 삽입
		return regionMapper.insertRegion(region);
	}
	@Override
	public int removeRegion(int regionId) { // 삭제
		return regionMapper.deleteRegion(regionId);
	}
	@Override
	public int modifyRegion(Region region) { // 수정액션
		return regionMapper.updateRegion(region);
	}
	@Override
	public Region getRegionOne(int regionId) { // 수정폼
		return regionMapper.selectRegionOne(regionId);
	}
}