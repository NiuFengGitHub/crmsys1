package com.qf.controller;

import com.qf.common.JsonBean;
import com.qf.entity.SalChance;
import com.qf.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpSession;

import  com.qf.service.CstPlanService;

import java.util.Map;

@RestController
public class CstPlanController {
	@Autowired
	private CstPlanService planService;
	//
//	@RequestMapping("/list.do")
//	public  JsonBean findAll(int page) {
//		Map<String,Object> map =  planService.findAllPlan(page);
//		return JsonUtils.createJsonBean(1, map);
//	}
	@RequestMapping("/plan/list.do")
	public JsonBean findAll(int page, HttpSession session){
		Map<String, Object> map = planService.findAllPlan(page, session);
		return JsonUtils.createJsonBean(1,map);
	}

	//制定计划
	@RequestMapping("/plan/update.do")
	public JsonBean updateChance(SalChance salChance){
		planService.update(salChance);
		return JsonUtils.createJsonBean(1,null);
	}
	//执行计划
	@RequestMapping("/plan/exec.do")
	public JsonBean exec(int id){
		SalChance salChance = new SalChance();
		salChance.setChcId(id);
		salChance.setChcStatus(2);
		planService.update(salChance);
		return JsonUtils.createJsonBean(1,null);

	}

	@RequestMapping("/plan/makeIt.do")
	public JsonBean succ(int id){
		SalChance salChance = new SalChance();
		salChance.setChcId(id);
		salChance.setChcStatus(3);
		planService.update(salChance);
		return JsonUtils.createJsonBean(1,null);
	}

	//条件查询
	@RequestMapping("/plan/search.do")
	public JsonBean findByCondition(int page,SalChance salChance,HttpSession session){
		System.out.println(salChance.getChcCusrName());
		System.out.println(salChance.getChcLinkman());
		System.out.println(salChance.getChcCreateDate());
		Map<String, Object> map  = planService.findByCondition(page, session, salChance);
		return JsonUtils.createJsonBean(1,map);
	}

}
