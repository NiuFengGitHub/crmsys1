package com.qf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.CstActivityMapper;
import com.qf.entity.CstActivity;
import com.qf.service.CstActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CstActivityServiceImpl implements CstActivityService {
    @Autowired
    private CstActivityMapper activityDao;

    @Override
    public Map<String, Object> searchAll(int page,String custNo) {
        PageHelper.startPage(page,5);
        List<CstActivity> list = activityDao.findAll(custNo);
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("totol",total);
        map.put("rows",list);
        return map;
    }

    @Override
    public CstActivity findSingle(int atvId) {
        return activityDao.selectByPrimaryKey(atvId);
    }

    @Override
    public int update(CstActivity cstActivity) {
        return activityDao.updateByPrimaryKeySelective(cstActivity);
    }
}
