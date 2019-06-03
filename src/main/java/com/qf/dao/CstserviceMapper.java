package com.qf.dao;

import com.qf.entity.Cstservice;

public interface CstserviceMapper {
    int deleteByPrimaryKey(Integer svrId);

    int insert(Cstservice record);

    int insertSelective(Cstservice record);

    Cstservice selectByPrimaryKey(Integer svrId);

    int updateByPrimaryKeySelective(Cstservice record);

    int updateByPrimaryKey(Cstservice record);
}