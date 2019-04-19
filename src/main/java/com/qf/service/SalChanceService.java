package com.qf.service;

import java.util.Date;
import java.util.Map;

import com.qf.entity.SalChance;

public interface SalChanceService {
	//查询所有
	public Map<String,Object> findAllChance(int page);
	//添加
    public void addChance(SalChance salChance);
    //假删
    public void deleteChance(int chcId);
    public Map<String,Object> findByCondition(int page, String chcCusrName, String chcLinkman, Date chcCreateDate);

}
