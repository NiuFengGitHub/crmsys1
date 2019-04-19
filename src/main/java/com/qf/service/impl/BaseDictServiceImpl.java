package com.qf.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.BaseDictMapper;
import com.qf.entity.BaseDict;
import com.qf.service.BaseDictService;

@Service
public class BaseDictServiceImpl implements BaseDictService {
	@Autowired
	private BaseDictMapper dictDao;

	@Override
	public Map<String, Object> findByPage(int page) {
		PageHelper.startPage(page,5);
		List<BaseDict> list = dictDao.findAll();
		long count = ((Page)list).getTotal();
		Map<String ,Object> map = new HashMap<>();
		map.put("total", count);
		map.put("rows", list);
		return map;
		
	}

	@Override
	public Map<String, Object> findDataByCondition(int page,String type, String item) {
		PageHelper.startPage(page,5);
		List<BaseDict> list = dictDao.findByCondition(type, item);
		long count = ((Page)list).getTotal();
		Map<String,Object> map = new HashMap<>();
		map.put("total", count);
		map.put("rows", list);
		return map;
	}

	@Override
	public BaseDict findById(Integer dictId) {
		return dictDao.selectByPrimaryKey(dictId);
	}

	@Override
	public int update(BaseDict baseDict) {
		// TODO Auto-generated method stub
		return dictDao.updateByPrimaryKeySelective(baseDict);
	}

	@Override
	public void add(BaseDict baseDict) {
		dictDao.insertSelective(baseDict);
		
	}

	@Override
	public List<BaseDict> findAllBase() {
		// TODO Auto-generated method stub
		return dictDao.findAll();
	}
}





























