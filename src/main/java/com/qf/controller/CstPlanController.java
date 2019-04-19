package com.qf.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qf.common.JsonBean;
import com.qf.service.CstPlanService;
import com.qf.utils.JsonUtils;

@Controller
@ResponseBody
@RequestMapping("/plan")
public class CstPlanController {
	@Autowired
	private CstPlanService planService;
	
	@RequestMapping("/list.do")
	public  JsonBean findAll(int page) {
		Map<String,Object> map =  planService.findAllPlan(page);
		return JsonUtils.createJsonBean(1, map);
	}
}
