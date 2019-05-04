package com.qf.dao;

import com.qf.entity.CstActivity;

import java.util.List;

public interface CstActivityMapper {
    int deleteByPrimaryKey(Integer atvId);

    int insert(CstActivity record);

    int insertSelective(CstActivity record);

    CstActivity selectByPrimaryKey(Integer atvId);

    int updateByPrimaryKeySelective(CstActivity record);

    int updateByPrimaryKey(CstActivity record);

    //根据客户编号去找交往记录
    public List<CstActivity> findAll(String custNo);
}