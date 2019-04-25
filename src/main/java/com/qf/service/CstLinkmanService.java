package com.qf.service;

import com.qf.entity.CstLinkman;

import java.util.Map;

public interface CstLinkmanService {
    //查询公司联系人信息
    public Map<String,Object> findAllLinkman(int page,String cstno);
    //更新的时候绑定数据
    public CstLinkman findById(int lkmId);
    //更新
    public void update(CstLinkman cstLinkman);
}
