package com.qf.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qf.common.JsonBean;
import com.qf.entity.SysRole;
import com.qf.service.SysRoleService;
import com.qf.utils.JsonUtils;

//或者写RestController
@Controller
@ResponseBody
public class SysRoleController {
	//注入业务层对象
	@Autowired
	private SysRoleService roleService;

	@RequestMapping("/role/list.do")
	public JsonBean findByPage(int page) {
		Map<String, Object> map = roleService.findAll(page);
		return JsonUtils.createJsonBean(1, map);
	}

	@RequestMapping("/role/search.do")
	public JsonBean searchRole(int page,String roleName) {
		if(page<=0) {
			page = 1;
		}
		Map<String, Object> map = roleService.findRoleByCondition(page, roleName);
		return JsonUtils.createJsonBean(1, map);
	}
	//在更新用户的时候用到
	@RequestMapping("/role/findall.do")
	public JsonBean findAllRole() {
		List<SysRole> list = roleService.findAllRole();
		return JsonUtils.createJsonBean(1, list);
	}
	//添加角色
	@RequestMapping("/role/add.do")
	public  JsonBean add(SysRole sysRole) {
		roleService.add(sysRole);
		return JsonUtils.createJsonBean(1, null);
	}
	
	//假删
	@RequestMapping("/role/delete.do")
	public JsonBean delete(Integer roleId) {
		roleService.deleteRole(roleId);
		return JsonUtils.createJsonBean(1, null);
	}
	
	//更新时候绑定数据用
	@RequestMapping("/role/searchrole.do")
	public JsonBean search(Integer roleId) {
		SysRole role = roleService.findById(roleId);
		return JsonUtils.createJsonBean(1, role);
	}
	
	@RequestMapping("/role/update.do")
	public JsonBean updateRole(SysRole sysRole) {
		roleService.update(sysRole);
		return JsonUtils.createJsonBean(1, null);
	}
}
