package com.qf.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qf.common.JsonBean;
import com.qf.entity.SysUser;
import com.qf.service.SysUserService;
import com.qf.utils.ImportExcel;
import com.qf.utils.JsonUtils;

@Controller
@ResponseBody
public class ImportExcelController {
	//为什么注入空
	@Autowired
	private SysUserService userService = null;
	@RequestMapping("/import.do")
	public JsonBean importExcel(@RequestParam MultipartFile excelFile) {
		try {
			
			String filename = excelFile.getOriginalFilename();
			//获取上传文件的输入流
			InputStream inputStream = excelFile.getInputStream();
			//调用工具类中的方法，读取excel文件中数据
			List<Map<String,Object>> sourseList= ImportExcel.readExcel(filename, inputStream);
			//	将对象先转为json格式字符串，然后再转为List<SysUser>对象
			ObjectMapper objMapper = new ObjectMapper();
	        String infos = objMapper.writeValueAsString(sourseList);
	        //json字符串转为 
	        List<SysUser> list = objMapper.readValue(infos,new TypeReference<List<SysUser>>(){});
	        //批量添加
	        userService.addUsrBatch(list);
	        return JsonUtils.createJsonBean(1, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return JsonUtils.createJsonBean(0, e.getMessage());
		}
		
	}
}
