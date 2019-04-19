package com.qf.service;

import java.util.Map;

import com.qf.entity.CstCustomer;

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

}
