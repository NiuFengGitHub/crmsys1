package com.qf.service;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface StorageService {
	public Map<String,Object> findAll(int page);
	//模糊查询
	public Map<String ,Object> searchByCondition(int page, String prodname, String prodtype, String prodbatch, String stkwarehouse);

}
