package com.qf.controller;

import com.qf.common.JsonBean;
import com.qf.entity.SysUser;
import com.qf.service.SysUserService;
import com.qf.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
//作用相当于其他两个@controller + @responseBody
@RestController
public class UserController {
	@Autowired
	private SysUserService userService;
	@RequestMapping("/user/list.do")
	public JsonBean findByPage(int page) {
		Map<String, Object> map = userService.findAllUser(page);
		return JsonUtils.createJsonBean(1, map);
	}
	//根据Id查找用户
	@RequestMapping("/user/find.do")
	public JsonBean findUser(int usrId) {
		System.out.println("1"+usrId);
		SysUser user = userService.findUserById(usrId);
		return JsonUtils.createJsonBean(1, user);
	}
	@RequestMapping("/user/update.do")
	public JsonBean update(int usrId,String usrName,int usrRoleId ,int usrFlag) {
		SysUser sysUser = new SysUser();
		sysUser.setUsrId(usrId);
		sysUser.setUsrName(usrName);
		sysUser.setUsrRoleId(usrRoleId);
		sysUser.setUsrFlag(usrFlag);
		userService.updateUser(sysUser);
		return JsonUtils.createJsonBean(1, null);
	}
	
	@RequestMapping("/user/delete.do")
	public JsonBean delete(int usrId) {
		userService.deleteUsr(usrId);
		return JsonUtils.createJsonBean(1, null);
	}
	
	@RequestMapping("/user/search.do")
	public JsonBean search(int page,String usrName,String roleName,Integer usrFlag) {
		System.out.println(usrName);
		System.out.println(roleName);
		System.out.println(usrFlag);
		Map<String, Object> map = userService.findUserByCondition(page, usrName, roleName, usrFlag);
		return JsonUtils.createJsonBean(1, map);
		
	}
	
	@RequestMapping("/user/findId.do")
	public JsonBean searchByRoleId() {
		List<SysUser> list = userService.findUserByRoleId();
		return JsonUtils.createJsonBean(1, list);
	}

	//销售经理加载
	@RequestMapping("/saleRole/list.do")
	public JsonBean searchSaleRole(){
		List<SysUser> list = userService.searchSaleRole();
		return JsonUtils.createJsonBean(1,list);

	}
	

}
