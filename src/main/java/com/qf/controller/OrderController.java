package com.qf.controller;

import com.qf.common.JsonBean;
import com.qf.service.OrderService;
import com.qf.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/order/list.do")
    public JsonBean OrderList(int page,String custNo){
        System.out.println(page);
        Map<String, Object> map = orderService.searchAll(page, custNo);
        return JsonUtils.createJsonBean(1,map);

    }
}
