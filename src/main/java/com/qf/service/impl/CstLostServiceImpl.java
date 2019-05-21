package com.qf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.CstLostMapper;
import com.qf.entity.CstLost;
import com.qf.service.CstLostService;
import com.qf.vo.VLost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CstLostServiceImpl implements CstLostService {
    @Autowired
    private CstLostMapper lostDao;

    @Override
    public Map<String,Object> searchAll(int page) {
        PageHelper.startPage(page,5);
        List<VLost> list = lostDao.findAll();
        long total = ((Page) list).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("total",total);
        map.put("rows",list);
        return map;
    }

    @Override
    public VLost searchById(int id) {
        return lostDao.findById(id);
    }

    @Override
    public int  update(CstLost cstLost) {
        return lostDao.updateByPrimaryKeySelective(cstLost);
    }

    @Override
    public Map<String, Object> searchByCondition(int page,String name, int managerId, int lstStatus) {
        PageHelper.startPage(page,5);
        List<VLost> list = lostDao.findByCondition(name, managerId, lstStatus);
        long total = ((Page) list).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("total",total);
        map.put("rows",list);
        return map;
    }
}
