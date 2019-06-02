package com.qf.dao;

import com.qf.entity.CstPlan;
import com.qf.vo.VPlan;

import java.util.List;

public interface CstPlanMapper {
    int deleteByPrimaryKey(Integer plaId);

    int insert(CstPlan record);

    int insertSelective(CstPlan record);

    CstPlan selectByPrimaryKey(Integer plaId);

    int updateByPrimaryKeySelective(CstPlan record);

    int updateByPrimaryKey(CstPlan record);

    //查询所有
//    public List<CstPlan> findAll();

    //查询所有开发计划（客户开发计划中）,根据当前人的id去获取
    public List<VPlan> findAll(int id);
    
}