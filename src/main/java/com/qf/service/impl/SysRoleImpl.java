package com.qf.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.SysRoleMapper;
import com.qf.entity.BaseDict;
import com.qf.entity.SysRole;
import com.qf.service.SysRoleService;
import com.qf.vo.VUser;
@Service
public class SysRoleImpl implements SysRoleService {
	//注入dao对象
	@Autowired
	private SysRoleMapper sysRoleDao;

	@Override
	public Map<String, Object> findAll(int page) {
		//mybatis内部会进行分页查询
		//PageHelper和查询操作之前不要有其他逻辑
		PageHelper.startPage(page,5);
		//list中存放的是分页后的数据 
		List<SysRole> list = sysRoleDao.findAll();
		 //获取总条数
		 long total = ((Page) list).getTotal();
		 Map<String ,Object> map = new HashMap<>();
		 map.put("total", total);  //总条数
		 map.put("rows", list);  //当前页显示的记录
		 return map;
	}

	@Override
	public Map<String, Object> findRoleByCondition(int page, String roleName) {
		PageHelper.startPage(page,5);
		List<SysRole> list = sysRoleDao.findByCondition(roleName);
		long count = ((Page)list).getTotal();
		Map<String,Object> map = new HashMap<>();
		map.put("total", count);
		map.put("rows", list);
		return map;
	}

	@Override
	public List<SysRole> findAllRole() {
		// TODO Auto-generated method stub
		return sysRoleDao.findAll();
	}

	@Override
	public void add(SysRole sysRole) {
		sysRoleDao.insertSelective(sysRole);
	}

	@Override
	public void deleteRole(Integer roleId) {
		// TODO Auto-generated method stub
		sysRoleDao.delete(roleId);
	}

	@Override
	public void update(SysRole sysRole) {
		sysRoleDao.updateByPrimaryKeySelective(sysRole);
		
	}

	@Override
	public SysRole findById(Integer roleId) {
		// TODO Auto-generated method stub
		return sysRoleDao.selectByPrimaryKey(roleId);
	}

}
