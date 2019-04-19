package com.qf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.CstLinkmanMapper;
import com.qf.entity.CstLinkman;
import com.qf.service.CstLinkmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class CstLinkmanServiceImpl implements CstLinkmanService {
    @Autowired
    private CstLinkmanMapper linkmanDao;
    @Override
    public Map<String, Object> findAllLinkman(int page,String cstno) {
        PageHelper.startPage(page,5);
        List<CstLinkman> list = linkmanDao.findAll(cstno);
        long total = ((Page) list).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("total",total);
        map.put("rows",list);
        return map;
    }
}
