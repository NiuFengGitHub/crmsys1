package com.qf.dao;

import java.util.List;

import com.qf.entity.SysRight;
import com.qf.vo.VMenuInfo;
import com.qf.vo.VRight;

public interface SysRightMapper {
    int deleteByPrimaryKey(Integer rightCode);

    int insert(SysRight record);

    int insertSelective(SysRight record);

    SysRight selectByPrimaryKey(Integer rightCode);

    int updateByPrimaryKeySelective(SysRight record);

    int updateByPrimaryKey(SysRight record);
    
    //自己添加的

    public List<VMenuInfo> selectMenu(int roleId);
    //权限管理，，，权限表自连接查询
    public List<VRight> findAll(); 
}