package com.qf.service;

import java.util.Map;

public interface OrderService {
    //根据公司标号去查询所有历史订单
    public Map<String ,Object> searchAll(int page, String  custNo);
 }
