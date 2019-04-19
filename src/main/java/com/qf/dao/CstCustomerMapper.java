package com.qf.dao;

import java.util.List;

import com.qf.entity.CstCustomer;
import com.qf.vo.VCustomer;

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
}