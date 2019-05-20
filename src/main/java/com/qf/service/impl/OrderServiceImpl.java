package com.qf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.OrdersMapper;
import com.qf.entity.Orders;
import com.qf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService
{
    @Autowired
    private OrdersMapper orderDao;
    @Override
    public Map<String,Object> searchAll(int page, String custNo) {
        PageHelper.startPage(page,5);
        List<Orders> list = orderDao.findAll(custNo);
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("total",total);
        map.put("rows",list);
        return map;
    }
}
