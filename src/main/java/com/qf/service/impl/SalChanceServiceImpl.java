package com.qf.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.SalChanceMapper;
import com.qf.entity.SalChance;
import com.qf.service.SalChanceService;

@Service
public class SalChanceServiceImpl implements SalChanceService{

	@Autowired
	private SalChanceMapper salChanceDao;


	@Override
	public Map<String, Object> findAllChance(int page) {
		PageHelper.startPage(page, 5);
		List<SalChance> list = salChanceDao.findAll();
		long total = ((Page)list).getTotal();
		Map<String,Object> map = new HashMap<>();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}


	@Override
	public void addChance(SalChance salChance) {
		salChanceDao.insertSelective(salChance);
	}


	@Override
	public void deleteChance(int chcId) {
		salChanceDao.delete(chcId);
	}

	//条件查询
	@Override
	public Map<String,Object> findByCondition(int page,String chcCusrName,String chcLinkman,Date  chcCreateDate) {
		PageHelper.startPage(page, 5);
		List<SalChance> list = salChanceDao.find(chcCusrName, chcLinkman, chcCreateDate);
		long total = ((Page)list).getTotal();
		Map<String,Object> map = new HashMap<>();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}

}
