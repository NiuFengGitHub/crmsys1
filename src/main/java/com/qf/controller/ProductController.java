package com.qf.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qf.common.JsonBean;
import com.qf.service.ProductService;
import com.qf.utils.JsonUtils;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/product/list.do")
	public JsonBean findAllProduct(int page) {
		Map<String, Object> map = productService.findAll(page);
		return JsonUtils.createJsonBean(1, map);
	}
	
	@RequestMapping("/product/search.do")
	public JsonBean search(int page , String prodName, String prodType, String prodBatch) {
		Map<String, Object> map = productService.searchByCondition(page, prodName, prodType, prodBatch);
		return JsonUtils.createJsonBean(1, map);
	}
}
