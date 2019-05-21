package com.qf.service;

import com.qf.entity.CstLost;
import com.qf.vo.VLost;

import java.util.Map;

public interface CstLostService {
    //查询所有
    public Map<String,Object> searchAll(int page);

    //根据Id查询单个
    public VLost searchById(int id);

    //更新
    public int  update(CstLost cstLost);

    //条件查询
    public Map<String,Object> searchByCondition(int page,String name,int managerId,int lstStatus);
}
