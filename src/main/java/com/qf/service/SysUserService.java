package com.qf.service;

import com.qf.entity.SysUser;
import com.qf.vo.VUser;

import java.util.List;
import java.util.Map;

public interface SysUserService {
	public SysUser login(String name, String password);
	
	public Map<String,Object> findAllUser(int page);
	
	public void addUsrBatch(List<SysUser> list);
	//根据Id查找用户
	public SysUser findUserById(int id);
	
	public int updateUser(SysUser sysUser);
	//假删
	public void deleteUsr(int usrId);
	//登录信息
	public VUser findLoginUser(int id);
	//分页模糊查询
	public Map<String,Object> findUserByCondition(int page, String usrName, String roleName, Integer usrFlag);
	
	//创建销售机会的时候，找所有的客户经理，进行机会分配
	public List<SysUser> findUserByRoleId();

	//制定开发计划的时候，找所有的销售经理，进行机会分配
	public List<SysUser> searchSaleRole();

}
