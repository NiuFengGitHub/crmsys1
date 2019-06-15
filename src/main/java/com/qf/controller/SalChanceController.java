package com.qf.controller;

import com.qf.common.JsonBean;
import com.qf.entity.SalChance;
import com.qf.service.SalChanceService;
import com.qf.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
public class SalChanceController {
	@Autowired
	private SalChanceService salChanceService;

	@RequestMapping("/saleChance/list.do")
	public JsonBean findAll(int page) {
		Map<String, Object> map = salChanceService.findAllChance(page);
		return JsonUtils.createJsonBean(1, map);
	}

	@RequestMapping("/saleChance/add.do")
	public JsonBean add(SalChance salChance) {
		Date time = new Date();
		salChance.setChcCreateDate(time);
		salChance.setChcStatus(1);
		salChance.setChcFlag(1); 
		if(salChance.getChcDueId()!=0) {
			//已经指派
			salChance.setChcStatus(2);
		}else {
			//未指派
			salChance.setChcStatus(1);
		}
		salChanceService.addChance(salChance);
		return JsonUtils.createJsonBean(1, null);
	}

	//删除
	@RequestMapping("/saleChance/delete.do")
	public JsonBean delete(int chcId) {
		salChanceService.deleteChance(chcId);
		return JsonUtils.createJsonBean(1, null);
	}

	@RequestMapping("/salChance/findByCondition.do")
	public JsonBean find(int page,String chcCusrName,String chcLinkman,String  chcCreateDate) {
		SimpleDateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		//将字符串转化为日期
		Map<String, Object> map = null;
		if(chcCreateDate!=null && chcCreateDate!="") {
			try {
				date = dfm.parse(chcCreateDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		map = salChanceService.findByCondition(page, chcCusrName, chcLinkman, date);
		return JsonUtils.createJsonBean(1, map);
	}

}
