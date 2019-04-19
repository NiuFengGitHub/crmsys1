package com.qf.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qf.entity.SalChance;

public interface SalChanceMapper {
    int deleteByPrimaryKey(Integer chcId);

    int insert(SalChance record);

    int insertSelective(SalChance record);

    SalChance selectByPrimaryKey(Integer chcId);

    int updateByPrimaryKeySelective(SalChance record);

    int updateByPrimaryKey(SalChance record);
    
    //查询所有
    public List<SalChance> findAll();
    //假删
    public void delete(int chcId);
    //条件查询
    public List<SalChance> find(@Param("chcCusrName") String chcCusrName,
                                @Param("chcLinkman") String chcLinkman, @Param("chcCreateDate") Date chcCreateDate);
    

}