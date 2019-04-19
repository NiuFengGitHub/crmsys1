package com.qf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qf.entity.Storage;
import com.qf.vo.VStorage;

public interface StorageMapper {
    int deleteByPrimaryKey(Integer stkId);

    int insert(Storage record);

    int insertSelective(Storage record);

    Storage selectByPrimaryKey(Integer stkId);

    int updateByPrimaryKeySelective(Storage record);

    int updateByPrimaryKey(Storage record);
    
    //查询所有库存
    public List<VStorage> find();
    
    public List<VStorage> findByCondition(@Param("prodname") String prodname, @Param("prodtype") String prodtype, @Param("prodbatch") String prodbatch, @Param("stkwarehouse") String stkwarehouse);
    
}