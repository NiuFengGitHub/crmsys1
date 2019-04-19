package com.qf.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qf.common.JsonBean;
import com.qf.service.SysRightService;
import com.qf.utils.JsonUtils;

@RestController
public class RightController {
	@Autowired
	private SysRightService sysRightService;
	@RequestMapping("/right/list.do")
	public JsonBean findAll(Integer page) {
		Map<String, Object> map = sysRightService.findByPage(page);
		return JsonUtils.createJsonBean(1, map);
	}
	

}
