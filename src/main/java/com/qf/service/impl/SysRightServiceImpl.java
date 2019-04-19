package com.qf.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.SysRightMapper;
import com.qf.service.SysRightService;
import com.qf.vo.VMenuInfo;
import com.qf.vo.VRight;
@Service
public class SysRightServiceImpl implements SysRightService {
	@Autowired
	private SysRightMapper rightDao;
	@Override
	public List<VMenuInfo> findMenu(int rid) {
		// TODO Auto-generated method stub
		return rightDao.selectMenu(rid);
	}
	@Override
	public Map<String ,Object> findByPage(int page) {
		PageHelper.startPage(page,5);
		List<VRight> list = rightDao.findAll();
	     long count = ((Page)list).getTotal();
	     Map<String ,Object> map = new HashMap<>();
	     map.put("total", count);
	     map.put("rows", list);
	     return map;
	     
	     
	}

}
