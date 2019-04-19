package com.qf.service;

import java.util.List;
import java.util.Map;

import com.qf.entity.BaseDict;

public interface BaseDictService {
	public Map<String ,Object> findByPage(int page);
	public Map<String ,Object> findDataByCondition(int page, String type, String item);
	public BaseDict  findById(Integer dictId);
	//更新数据
	public int update(BaseDict baseDict);
	//添加
	public void add(BaseDict baseDict);
	//查询所有加载信息时候使用
	public List<BaseDict> findAllBase();
}
