package com.qf.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.ProductMapper;
import com.qf.entity.Product;
import com.qf.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductMapper productDao;

	@Override
	public Map<String, Object> findAll(int page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, 5);
		List<Product> list = productDao.findAll();
		long total = ((Page) list).getTotal();
		Map<String ,Object> map = new HashMap<String ,Object>();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}

	@Override
	public Map<String, Object> searchByCondition(int page, String prodName, String prodType, String prodBatch) {
		PageHelper.startPage(page, 5);
		List<Product> list = productDao.findByCondition(prodName, prodType, prodBatch);
		long total = ((Page) list).getTotal();
		Map<String,Object> map = new HashMap<>();
		map.put("total", total);
		map.put("rows", list);
		return map;
	
	}

}
