package com.qf.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qf.common.JsonBean;
import com.qf.service.StorageService;
import com.qf.utils.JsonUtils;

@RestController
public class StorageController {
	@Autowired
	private StorageService storageService;
	
	@RequestMapping("/storage/list.do")
	public JsonBean findAllStorage(int page) {
		Map<String, Object> map = storageService.findAll(page);
		
		return JsonUtils.createJsonBean(1, map);
	}
	
	//模糊查询
	@RequestMapping("/storage/search.do")
	public JsonBean search(int page, String prodname, String prodtype, String prodbatch,
			String stkwarehouse) {
		System.out.println(page);
		System.out.println(prodname);
		System.out.println(prodtype);
		System.out.println(prodbatch);
		System.out.println(stkwarehouse);
		
		Map<String, Object> map = storageService.searchByCondition(page, prodname, prodtype, prodbatch, stkwarehouse);
		return JsonUtils.createJsonBean(1, map);
		
	}
		
}
