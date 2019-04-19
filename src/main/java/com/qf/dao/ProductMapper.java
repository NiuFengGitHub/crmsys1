package com.qf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qf.entity.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer prodId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer prodId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
    //查询所有
    public List<Product> findAll();
    //模糊查询
    public List<Product> findByCondition(@Param("prodName") String prodName, @Param("prodType") String prodType, @Param("prodBatch") String prodBatch);
}





















