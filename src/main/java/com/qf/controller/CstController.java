package com.qf.controller;

import com.qf.common.JsonBean;
import com.qf.service.CstServices;
import com.qf.utils.JsonUtils;
import com.qf.vo.VService;
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
    public JsonBean findDealByNo(Integer id){
        VServicedeal byNo = cstServices.findByNo(id);
        return JsonUtils.createJsonBean(1,byNo);

    }

    //更新数据也就是增加结果信息
    @RequestMapping("service/deal.do")
    public JsonBean update(VServicedeal servicedeal){
        cstServices.updateById(servicedeal);
        return JsonUtils.createJsonBean(1,null);
    }

    //条件查询
    @RequestMapping("service/searchByCondition.do")
    public JsonBean searchByCondition(int page, VService vService){
        System.out.println(vService.getCustname());
        System.out.println(vService.getSertype());
        System.out.println(vService.getCreatetime());
        Map<String, Object> map = cstServices.searchByCondition(page, vService);

        return JsonUtils.createJsonBean(1,map);
    }
}
