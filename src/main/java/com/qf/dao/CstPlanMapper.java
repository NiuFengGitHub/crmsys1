package com.qf.dao;

import java.util.List;

import com.qf.entity.CstPlan;

public interface CstPlanMapper {
    int deleteByPrimaryKey(Integer plaId);

    int insert(CstPlan record);

    int insertSelective(CstPlan record);

    CstPlan selectByPrimaryKey(Integer plaId);

    int updateByPrimaryKeySelective(CstPlan record);

    int updateByPrimaryKey(CstPlan record);

    //查询所有
    public List<CstPlan> findAll();
    
}