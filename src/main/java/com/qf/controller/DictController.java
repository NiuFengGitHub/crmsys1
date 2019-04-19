package com.qf.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qf.common.JsonBean;
import com.qf.entity.BaseDict;
import com.qf.service.BaseDictService;
import com.qf.utils.JsonUtils;

@RestController
@RequestMapping("/dict")
public class DictController {
	@Autowired
	private BaseDictService dictService;
	@RequestMapping("/list.do")
	public JsonBean findByPage(int page) {
		if(page<=0) {
			page = 1;
		}
		Map<String , Object> map = dictService.findByPage(page);
		return JsonUtils.createJsonBean(1, map);
	}
	
	@RequestMapping("/findByCondition.do")
	public JsonBean findByCondition(int page,String type, String item) {
		if(page<=0) {
			page = 1;
		}
		Map<String, Object> map = dictService.findDataByCondition(page, type, item);
		return JsonUtils.createJsonBean(1, map);
	}
	
	@RequestMapping("/search.do")
	public JsonBean findDictById(Integer dictId) {
		BaseDict dict = dictService.findById(dictId);
		return JsonUtils.createJsonBean(1, dict);
	}
	
	@RequestMapping("/update.do")
	public  JsonBean updateBaseDict(BaseDict baseDict) {
		dictService.update(baseDict);
		return JsonUtils.createJsonBean(1, null);
	}
	
	@RequestMapping("/add.do")
	public JsonBean addDict(BaseDict baseDict) {
		dictService.add(baseDict);
		return JsonUtils.createJsonBean(1, null);
	}
	//加载信息使用
	@RequestMapping("/load.do")
	public JsonBean loadBase() {
		List<BaseDict> list = dictService.findAllBase();
		return JsonUtils.createJsonBean(1, list);
	}
}
















