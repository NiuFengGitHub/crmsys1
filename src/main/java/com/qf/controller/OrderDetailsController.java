package com.qf.controller;

import com.qf.common.JsonBean;
import com.qf.service.OrderDetailService;
import com.qf.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderDetailsController {
    @Autowired
    private OrderDetailService orderDetailService;
    @RequestMapping("/orderdetail/list.do")
    public JsonBean orderDetailList(int page,int id){
        Map<String, Object> map = orderDetailService.searchById(page, id);
        return JsonUtils.createJsonBean(1,map);

    }
}
