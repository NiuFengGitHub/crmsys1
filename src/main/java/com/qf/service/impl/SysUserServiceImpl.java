package com.qf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.SysUserMapper;
import com.qf.entity.SysUser;
import com.qf.service.SysUserService;
import com.qf.vo.VUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysUserServiceImpl implements SysUserService {
	@Autowired
	private SysUserMapper userDao;
	@Override
	public SysUser login(String name, String password) {
		// TODO Auto-generated method stub
		SysUser user = userDao.selectByName(name);
		if(user==null){
			throw  new RuntimeException("用户不存在,请检查用户名是否输入正确");
		}
		if(!user.getUsrPassword().equals(password)) {
			throw new RuntimeException("密码错误");
		}
		return user;
	}
	@Override
	public Map<String ,Object> findAllUser(int page) {
		//mybatis内部会进行分页查询
		//PageHelper和查询操作之前不要有其他逻辑
		PageHelper.startPage(page,10);
		//list中存放的是分页后的数据 
		List<VUser> list = userDao.selectAll();
		//获取总条数
		long total = ((Page) list).getTotal();
		Map<String ,Object> map = new HashMap<>();
		map.put("total", total);  //总条数
		map.put("rows", list);  //当前页显示的记录
		return map;
	}
	
	
	@Override
	public void addUsrBatch(List<SysUser> list) {
		//每100条记录进行一次批量操作
		int count = 1;
		List<SysUser> tempList =  new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			tempList.add(list.get(i));
			if(count % 100 != 0) {
				count++;
			}else {
				userDao.addBatch(tempList);
				tempList.clear();
				count = 1;
			}
		}
		if(tempList.size()!=0) {
			userDao.addBatch(tempList);
		}
	}
	@Override
	public SysUser findUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}
	@Override
	public int updateUser(SysUser sysUser) {
		// TODO Auto-generated method stub
		return userDao.updateByPrimaryKeySelective(sysUser);
	}
	@Override
	public void deleteUsr(int usrId) {
		userDao.delete(usrId);
		
	}
	@Override
	public VUser findLoginUser(int id) {
		// TODO Auto-generated method stub
		return userDao.findLoginUser(id);
	}
	@Override
	public Map<String, Object> findUserByCondition(int page, String usrName, String roleName,Integer usrFlag) {
		//mybatis内部会进行分页查询
				//PageHelper和查询操作之前不要有其他逻辑
				PageHelper.startPage(page,5);
				//list中存放的是分页后的数据 
				List<VUser> list = userDao.findByCondition(usrName, roleName, usrFlag);
				
				//获取总条数
				long total = ((Page) list).getTotal();
				Map<String ,Object> map = new HashMap<>();
				map.put("total", total);  //总条数
				map.put("rows", list);  //当前页显示的记录
				return map;
	}
	@Override
	public List<SysUser> findUserByRoleId() {
		// TODO Auto-generated method stub
		return userDao.findByRoleId();
	}
	//销售经理
	@Override
	public List<SysUser> searchSaleRole() {
		return userDao.findSaleRole();
	}

}
