package com.qf.controller;

import com.qf.common.JsonBean;
import com.qf.entity.CstActivity;
import com.qf.service.CstActivityService;
import com.qf.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    //在更新的时候查询单个数据
    @RequestMapping("activity/findAct.do")
    public JsonBean selectSingle(int atvId){
        CstActivity activity = activityService.findSingle(atvId);
        return JsonUtils.createJsonBean(1,activity);
    }

    //更新数据
    @RequestMapping("activity/update.do")
    public JsonBean update(CstActivity cstActivity){
        activityService.update(cstActivity);
        return JsonUtils.createJsonBean(1,null);
    }

    //添加
    @RequestMapping("activity/add.do")
    public JsonBean add(CstActivity cstActivity, String cstno){
        cstActivity.setAtvCustNo(cstno);
        cstActivity.setAtvFlag(0);
        activityService.add(cstActivity);
        return JsonUtils.createJsonBean(1,null);
    }

    //删除
    @RequestMapping("activity/delete.do")
    public JsonBean delete(CstActivity cstActivity,String cstno){
        cstActivity.setAtvCustNo(cstno);
        cstActivity.setAtvFlag(1);
        activityService.delete(cstActivity);
        return JsonUtils.createJsonBean(1,null);
    }


}
