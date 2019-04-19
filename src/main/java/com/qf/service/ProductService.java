package com.qf.service;

import java.util.Map;



public interface ProductService {
	//查询所有
	public Map<String ,Object> findAll(int page);
	//模糊查询
	public Map<String,Object> searchByCondition(int page, String prodName, String prodType, String prodBatch);
	

}
