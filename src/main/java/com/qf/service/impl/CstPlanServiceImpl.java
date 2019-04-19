package com.qf.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.CstPlanMapper;
import com.qf.entity.CstCustomer;
import com.qf.entity.CstPlan;
import com.qf.service.CstPlanService;

@Service
public class CstPlanServiceImpl implements CstPlanService {

	@Autowired
	private CstPlanMapper planDao;
	@Override
	public Map<String, Object> findAllPlan(int page) {
		PageHelper.startPage(page, 5);
		List<CstPlan> list = planDao.findAll();
		long total = ((Page)list).getTotal();
		Map<String,Object> map = new HashMap<>();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}

}
