package com.qf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qf.entity.BaseDict;

public interface BaseDictMapper {
    int deleteByPrimaryKey(Integer dictId);

    int insert(BaseDict record);

    int insertSelective(BaseDict record);

    BaseDict selectByPrimaryKey(Integer dictId);

    int updateByPrimaryKeySelective(BaseDict record);

    int updateByPrimaryKey(BaseDict record);
    //
    public List<BaseDict> findAll();
    //模糊查询
    public List<BaseDict> findByCondition(@Param("type") String type, @Param("item") String item);
    
    

}