package com.qf.dao;

import com.qf.entity.CstCustomer;
import com.qf.vo.VCustomer;
import com.qf.vo.VTable;

import java.util.List;

public interface CstCustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CstCustomer record);

    int insertSelective(CstCustomer record);

    CstCustomer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CstCustomer record);

    int updateByPrimaryKey(CstCustomer record);
    
    //查询所有
    public List<VCustomer> findAll();
    //条件查询
    public List<VCustomer> findByCondition(CstCustomer cstCustomer);

    //客户构成分析（统计报表）
    public List<VTable> findTable();
}