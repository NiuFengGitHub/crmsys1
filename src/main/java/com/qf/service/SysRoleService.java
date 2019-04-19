package com.qf.service;

import java.util.List;
import java.util.Map;

import com.qf.entity.SysRole;

public interface SysRoleService {
	//查询所有（分页做查询）
	public Map<String,Object> findAll(int page);

	public Map<String,Object> findRoleByCondition(int page, String roleName);
	
	//找所有角色,在更新用户的时候使用
	public List<SysRole> findAllRole();
	//添加角色
	public void add(SysRole sysRole);
	//假删
	public void deleteRole(Integer roleId);
	//更新
	public  void update(SysRole sysRole);
	//更新时候查找
	public SysRole findById(Integer roleId);
}
