package com.qf.controller;

import com.qf.common.JsonBean;
import com.qf.entity.CstLost;
import com.qf.service.CstLostService;
import com.qf.utils.JsonUtils;
import com.qf.vo.VLost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
public class CstLostController {
    @Autowired
    private CstLostService lostService;
    @RequestMapping("/lost/list.do")
    public JsonBean lostList(int page){
        Map<String, Object> map = lostService.searchAll(page);
        return JsonUtils.createJsonBean(1,map);
    }

    @RequestMapping("/lost/find.do")
    public JsonBean findLost(int lstId){
        VLost vLost = lostService.searchById(lstId);
        return JsonUtils.createJsonBean(1,vLost);
    }
    //更新
    @RequestMapping("/lost/update.do")
    public JsonBean updateById(CstLost cstLost){
        lostService.update(cstLost);
        return JsonUtils.createJsonBean(1,null);
    }

    @RequestMapping("/lost/sure.do")
    public JsonBean sureLost(CstLost cstLost){
        cstLost.setLstLostDate(new Date());
        lostService.update(cstLost);
        return JsonUtils.createJsonBean(1,null);
    }


}
