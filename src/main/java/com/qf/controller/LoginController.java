package com.qf.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qf.common.CommonInfo;
import com.qf.common.JsonBean;
import com.qf.entity.SysUser;
import com.qf.service.SysUserService;
import com.qf.utils.JsonUtils;
import com.qf.vo.VUser;

@Controller
@ResponseBody
public class LoginController {
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("/login.do")
	public JsonBean login(String name,String password,HttpSession session) {
		SysUser user = sysUserService.login(name, password);
		session.setAttribute(CommonInfo.Login_User, user);
		return JsonUtils.createJsonBean(1, null);
	}
	@RequestMapping("/getLogin.do")
	public  JsonBean getLogin(HttpSession session) {
		SysUser user = (SysUser) session.getAttribute(CommonInfo.Login_User);
		VUser vUser = sysUserService.findLoginUser(user.getUsrId());
		System.out.println(vUser.getUsrName());
		return JsonUtils.createJsonBean(1, vUser);
	}
	
	@RequestMapping("/logout.do")
	public JsonBean logOut(HttpSession session) {
		session.invalidate();
		return JsonUtils.createJsonBean(1, null);
		
	}
}


























