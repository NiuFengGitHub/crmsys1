package com.qf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qf.entity.SysRole;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
    
    //添加
    public List<SysRole> findAll();
    //按照条件查询
    public List<SysRole> findByCondition(@Param("roleName") String roleName);
    //假删
    public void delete(Integer roleId);
    
    

}