package com.qf.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qf.common.JsonBean;
import com.qf.entity.CstCustomer;
import com.qf.service.CustomerService;
import com.qf.utils.JsonUtils;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping("/cus/list.do")
	public JsonBean findAll(int page) {
		Map<String, Object> map = customerService.findAllCus(page);
		return JsonUtils.createJsonBean(1, map);
	}

	//更新时候绑定数据
	@RequestMapping("/cus/find.do")
	public JsonBean find(int id) {
		CstCustomer customer = customerService.findByID(id);
		return JsonUtils.createJsonBean(1, customer);
	}

	//更新数据
	@RequestMapping("/cus/update.do")
	public JsonBean updateCustomer(CstCustomer cstCustomer) {
		customerService.update(cstCustomer);
		return JsonUtils.createJsonBean(1, null);
	}
	//添加数据
	@RequestMapping("/cus/add.do")
	public JsonBean add(CstCustomer cstCustomer) {
		cstCustomer.setCustStatus(0);
		System.out.println(cstCustomer.getCustStatus());
		customerService.add(cstCustomer);
		return JsonUtils.createJsonBean(1, null);
		
	}
	//模糊查询
	@RequestMapping("/cus/search.do")
	public JsonBean findByCondition(int page,String custName,String custRegion,Integer custManagerId,Integer custLevel) {
		CstCustomer cstCustomer = new CstCustomer();
		cstCustomer.setCustName(custName);
		cstCustomer.setCustRegion(custRegion);
		cstCustomer.setCustManagerId(custManagerId);
		cstCustomer.setCustLevel(custLevel);
		Map<String, Object> map = customerService.searchByCondition(page, cstCustomer);
		return JsonUtils.createJsonBean(1, map);
	}
}
