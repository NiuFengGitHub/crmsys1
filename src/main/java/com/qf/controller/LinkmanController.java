package com.qf.controller;

import com.qf.common.JsonBean;
import com.qf.entity.CstLinkman;
import com.qf.service.CstLinkmanService;
import com.qf.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@ResponseBody
public class LinkmanController {
    @Autowired
    private CstLinkmanService linkmanService;
    @RequestMapping("/linkman/list.do")
    public JsonBean linkmanList(int page,String cstno){
        Map<String, Object> map = linkmanService.findAllLinkman(page, cstno);
        return JsonUtils.createJsonBean(1,map);
    }
    //绑定数据
    @RequestMapping("/linkman/find.do")
    public JsonBean find(int lkmId){
        CstLinkman linkman = linkmanService.findById(lkmId);
        return JsonUtils.createJsonBean(1,linkman);
    }

    //更新数据
    @RequestMapping("/linkman/update.do")
    public JsonBean updateMan(CstLinkman cstLinkman){
        linkmanService.update(cstLinkman);
        return  JsonUtils.createJsonBean(1,null);
    }

    //添加联系人
    @RequestMapping("/linkman/add.do")
    public JsonBean add(CstLinkman linkman,String cstno){
//        System.out.println(cstno);
        linkman.setLkmCustNo(cstno);
        linkman.setLkmFlag(0);
        linkmanService.addMan(linkman);
//        System.out.println(linkman.getLkmFlag());
        return JsonUtils.createJsonBean(1,null);
    }

    //删除
    @RequestMapping("/linkman/delete.do")
    public JsonBean delMan(int lkmId){
        linkmanService.deleteMan(lkmId);
        return JsonUtils.createJsonBean(1,null);
    }
}
