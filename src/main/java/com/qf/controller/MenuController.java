package com.qf.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qf.common.CommonInfo;
import com.qf.common.JsonBean;
import com.qf.entity.SysUser;
import com.qf.service.SysRightService;
import com.qf.utils.JsonUtils;
import com.qf.vo.VMenuInfo;
//替代@Controller  @ResponseBody
@RestController
public class MenuController {
	@Autowired
	private SysRightService sysRightService;
	@RequestMapping("/menu.do")
	public JsonBean findMenu(HttpSession session) {
		SysUser user = (SysUser) session.getAttribute(CommonInfo.Login_User);
		List<VMenuInfo> list = sysRightService.findMenu(user.getUsrRoleId());

		return JsonUtils.createJsonBean(1, list);
	}

}
