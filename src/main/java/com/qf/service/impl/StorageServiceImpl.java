package com.qf.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.StorageMapper;
import com.qf.service.StorageService;
import com.qf.vo.VStorage;

@Service
public class StorageServiceImpl implements StorageService {
	
	@Autowired
	private StorageMapper storageDao;
	@Override
	public Map<String, Object> findAll(int page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, 5);
		List<VStorage> list = storageDao.find();
		for (VStorage vStorage : list) {
			System.out.println(vStorage.getStkarehouse());
		}
		 long total= ((Page)list).getTotal();
		Map<String ,Object> map = new HashMap<>();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	@Override
	public Map<String, Object> searchByCondition(int page, String prodname, String prodtype, String prodbatch,
			String stkwarehouse) {
		PageHelper.startPage(page, 5);
		System.out.println(stkwarehouse);
		List<VStorage> list = storageDao.findByCondition(prodname, prodtype, prodbatch, stkwarehouse);
		for (VStorage vStorage : list) {
			System.out.println(vStorage.getStkarehouse());
		}
	    long total = ((Page)list).getTotal();
	    Map<String ,Object> map = new HashMap<>();
	    map.put("total", total);
	    map.put("rows", list);
	    return map;
		
	}

}
