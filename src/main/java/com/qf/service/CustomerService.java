package com.qf.service;

import com.qf.entity.CstCustomer;

import java.util.Map;

public interface CustomerService {
	public Map<String,Object> findAllCus(int page);
	//更新是根据Id查询，绑定数据
	public CstCustomer findByID(int id);
	//更新数据
	public void update(CstCustomer cstCustomer);
	//增加客户信息
	public void add(CstCustomer cstCustomer);
	//条件查询
	public Map<String ,Object> searchByCondition(int page, CstCustomer cstCustomer);


	//统计报表
	public Map<String, Object> searchTable(int page);
}
