package com.qf.dao;

import com.qf.entity.Orders;

import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer odrId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer odrId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
    //根据客户编号查找所有订单
    public List<Orders> findAll(String custNo);
}