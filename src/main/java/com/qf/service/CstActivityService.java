package com.qf.service;

import java.util.Map;

public interface CstActivityService {
    //查询所有根据客户编号
    public Map<String,Object> searchAll(int page,String custNo);
}
