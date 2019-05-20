package com.qf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.OrdersLineMapper;
import com.qf.service.OrderDetailService;
import com.qf.vo.VOrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrdersLineMapper ordersLineDao;

    @Override
    public Map<String, Object> searchById(int page,int id) {
        PageHelper.startPage(page,5);
        List<VOrderDetails> list = ordersLineDao.findById(id);
        long total = ((Page) list).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("total",total);
        map.put("rows",list);
        return map;
    }
}
