package com.qf.dao;

import com.qf.entity.CstLinkman;

import java.util.List;

public interface CstLinkmanMapper {
    int deleteByPrimaryKey(Integer lkmId);

    int insert(CstLinkman record);

    int insertSelective(CstLinkman record);
    //更新的时候绑定数据
    CstLinkman selectByPrimaryKey(Integer lkmId);

    int updateByPrimaryKeySelective(CstLinkman record);

    int updateByPrimaryKey(CstLinkman record);
    //根据客户no查询联系人信息

    public List<CstLinkman> findAll( String cstno);

}