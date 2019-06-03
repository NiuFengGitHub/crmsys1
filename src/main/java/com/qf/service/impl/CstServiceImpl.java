package com.qf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.CstService;
import com.qf.service.CstServices;
import com.qf.vo.VService;
import com.qf.vo.VServicedeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author feng
 * @create 2019-05-21 下午 7:03
 */
@Service
public class CstServiceImpl implements CstServices{

    @Autowired
    private CstService cstService;


    @Override
    public Map<String, Object> findAllService(int page) {
        PageHelper.startPage(page,5);
        List<VService> service = cstService.findService();

        long count = ((Page)service).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("total",count);
        map.put("rows",service);
        return map;
    }

    @Override
    public VServicedeal findByNo(String no) {
        return cstService.findByNo(no);
    }
}
