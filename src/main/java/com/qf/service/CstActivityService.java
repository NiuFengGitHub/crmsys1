package com.qf.service;

import com.qf.entity.CstActivity;

import java.util.Map;

public interface CstActivityService {
    //查询所有根据客户编号
    public Map<String,Object> searchAll(int page,String custNo);

    //在更新的时候查询单个
    public CstActivity findSingle(int atvId);

    //更新数据
    public int update(CstActivity cstActivity);

    //添加
    public void add(CstActivity cstActivity);
}
