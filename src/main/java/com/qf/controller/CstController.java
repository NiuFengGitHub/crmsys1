package com.qf.controller;

import com.qf.common.JsonBean;
import com.qf.entity.Cstservice;
import com.qf.service.CstServiceService;
import com.qf.utils.JsonUtils;
import com.qf.vo.VService;
import com.qf.vo.VServicedeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author feng
 * @create 2019-05-21 下午 7:40
 */
@RestController
public class CstController {

    @Autowired
    private CstServiceService cstServices;
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
//        System.out.println(vService.getCustname());
//        System.out.println(vService.getSertype());
//        System.out.println(vService.getCreatetime());
        Map<String, Object> map = cstServices.searchByCondition(page, vService);

        return JsonUtils.createJsonBean(1,map);
    }

    //添加
    @RequestMapping("service/add.do")
    public JsonBean add(Cstservice cstservice, HttpSession session){
        cstServices.add(cstservice,session);
        return JsonUtils.createJsonBean(1,null);
    }

    //创建分配
    @RequestMapping("service/distribute.do")
    public JsonBean dis(Cstservice cstservice){
//        System.out.println(cstservice.getSvrDueId());
        cstServices.distribute(cstservice);
        return JsonUtils.createJsonBean(1,null);
    }

    //删除
    @RequestMapping("service/del.do")
    public  JsonBean del(Cstservice cstservice){
        cstServices.delete(cstservice);
        return JsonUtils.createJsonBean(1,null);
    }

    //服务处理
    @RequestMapping("service/dealService.do")
    public JsonBean deal(Cstservice cstservice,int id){
        cstservice.setSvrId(id);
        cstServices.deal(cstservice);
        return JsonUtils.createJsonBean(1,null);
    }

    //统计 报表
    @RequestMapping("/service/table.do")
    public  JsonBean findTable(int page){
        Map<String, Object> map = cstServices.searchAllTable(page);
        return JsonUtils.createJsonBean(1,map);

    }

}
