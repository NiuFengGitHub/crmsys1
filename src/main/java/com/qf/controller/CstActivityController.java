package com.qf.controller;

import com.qf.common.JsonBean;
import com.qf.service.CstActivityService;
import com.qf.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CstActivityController {
    @Autowired
    private CstActivityService activityService;
    @GetMapping("activity/list.do")
    public JsonBean ActivityList(int page,String cstno){
        Map<String, Object> map = activityService.searchAll(page, cstno);
        return  JsonUtils.createJsonBean(1,map);
    }
}
