package com.qf.dao;

import java.util.List;

import com.qf.entity.SysRole;
import com.qf.entity.SysRoleRight;
import com.qf.vo.VMenuInfo;

public interface SysRoleRightMapper {
    int deleteByPrimaryKey(Integer rfId);

    int insert(SysRoleRight record);

    int insertSelective(SysRoleRight record);

    SysRoleRight selectByPrimaryKey(Integer rfId);

    int updateByPrimaryKeySelective(SysRoleRight record);

    int updateByPrimaryKey(SysRoleRight record);
    //添加
    

    
    
    
    
    
    
    
}