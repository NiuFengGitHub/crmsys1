package com.qf.dao;

import com.qf.entity.SysUser;
import com.qf.vo.VUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer usrId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer usrId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    //根据id查找角色
    public VUser findLoginUser(int usrId);
    
//根据用户名查询
    SysUser selectByName(String name);
    public List<VUser> selectAll();
    //做批量添加一次插入好多条
    public void addBatch(List<SysUser> list);
    public SysUser findById(int id);
    //假删除,删除
    public void delete(int usrId);
  
    //条件查询
    public List<VUser> findByCondition(@Param("usrName") String usrName, @Param("roleName") String roleName, @Param("usrFlag") int usrFlag);
    
    //查找客户经理
    public List<SysUser> findByRoleId();

    //找销售经理
    public List<SysUser> findSaleRole();

    
    
}