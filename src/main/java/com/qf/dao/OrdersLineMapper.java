package com.qf.dao;

import com.qf.entity.OrdersLine;
import com.qf.vo.VOrderDetails;

import java.util.List;

public interface OrdersLineMapper {
    int deleteByPrimaryKey(Integer oddId);

    int insert(OrdersLine record);

    int insertSelective(OrdersLine record);

    OrdersLine selectByPrimaryKey(Integer oddId);

    int updateByPrimaryKeySelective(OrdersLine record);

    int updateByPrimaryKey(OrdersLine record);

    //订单明细
    public List<VOrderDetails> findById(int id);
}