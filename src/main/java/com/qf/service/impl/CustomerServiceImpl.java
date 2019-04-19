package com.qf.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.CstCustomerMapper;
import com.qf.entity.CstCustomer;
import com.qf.service.CustomerService;
import com.qf.vo.VCustomer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CstCustomerMapper customerDao;
	@Override
	public Map<String, Object> findAllCus(int page) {
		PageHelper.startPage(page,5);
		List<VCustomer> list = customerDao.findAll();
		long total = ((Page)list).getTotal();
		Map<String,Object> map = new HashMap<>();
		map.put("total", total);
		map.put("rows", list);
		return map; 
	}
	@Override
	public CstCustomer findByID(int id) {
		// TODO Auto-generated method stub
		return customerDao.selectByPrimaryKey(id);
	}
	@Override
	public void update(CstCustomer cstCustomer) {
		// TODO Auto-generated method stub
		customerDao.updateByPrimaryKeySelective(cstCustomer);
	}
	@Override
	public void add(CstCustomer cstCustomer) {
		// TODO Auto-generated method stub
		customerDao.insertSelective(cstCustomer);
		
	}
	@Override
	public Map<String, Object> searchByCondition(int page, CstCustomer cstCustomer) {
		PageHelper.startPage(page,5);
		List<VCustomer> list = customerDao.findByCondition(cstCustomer);
		long total = ((Page)list).getTotal();
		Map<String ,Object> map = new HashMap<>();
		map.put("total", total);
		map.put("list", list);
		return map;
	}

}
