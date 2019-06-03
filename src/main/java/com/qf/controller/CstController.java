package com.qf.controller;

import com.qf.common.JsonBean;
import com.qf.service.CstServices;
import com.qf.utils.JsonUtils;
import com.qf.vo.VServicedeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author feng
 * @create 2019-05-21 下午 7:40
 */
@RestController
public class CstController {
    @Autowired
    private CstServices cstServices;
    @RequestMapping("service/list.do")
    public JsonBean findList(int page){
        Map<String, Object> allService = cstServices.findAllService(page);
        return JsonUtils.createJsonBean(1,allService);
    }
    @RequestMapping("service/findByNo.do")
    public JsonBean findDealByNo(String no){
        VServicedeal byNo = cstServices.findByNo(no);
        return JsonUtils.createJsonBean(1,byNo);

    }
}
