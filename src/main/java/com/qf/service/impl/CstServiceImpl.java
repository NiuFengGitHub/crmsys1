package com.qf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.common.CommonInfo;
import com.qf.dao.CstService;
import com.qf.dao.CstserviceMapper;
import com.qf.entity.Cstservice;
import com.qf.entity.SysUser;
import com.qf.service.CstServiceService;
import com.qf.vo.VService;
import com.qf.vo.VServicedeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author feng
 * @create 2019-05-21 下午 7:03
 */
@Service
public class CstServiceImpl implements CstServiceService {
    //自动的
    @Autowired
    private CstserviceMapper cstserviceMapper;

    @Autowired
    private CstService cstService;


    @Override
    public Map<String, Object> findAllService(int page) {
        PageHelper.startPage(page,5);
        List<VService> service = cstService.findService();

        long count = ((Page)service).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("total",count);
        map.put("rows",service);
        return map;
    }

    @Override
    public VServicedeal findByNo(Integer id) {
        return cstService.findByNo(id);
    }

    @Override
    public void updateById(VServicedeal servicedeal) {
        cstService.update(servicedeal);
    }

    @Override
    public Map<String, Object> searchByCondition(int page, VService vService) {
        PageHelper.startPage(page,5);
        System.out.println(vService.getCustname());
        System.out.println(vService.getCreatetime());
        System.out.println(vService.getSertype());
        List<VService> service = cstService.findByCondition(vService);
        long count = ((Page)service).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("total",count);
        map.put("rows",service);
        return map;
    }

    @Override
    public void add(Cstservice cstservice, HttpSession session) {
        SysUser user = (SysUser) session.getAttribute(CommonInfo.Login_User);
        cstservice.setSvrCreateId(user.getUsrId());
        cstservice.setSvrCreateDate(new Date());
        cstservice.setSvrStatus("新创建");
        cstservice.setSvrFlag(0);
        cstserviceMapper.insertSelective(cstservice);

    }
    //分配
    @Override
    public void distribute(Cstservice cstservice) {
        cstservice.setSvrDueDate(new Date());
        cstserviceMapper.updateByPrimaryKeySelective(cstservice);

    }

    @Override
    public void delete(Cstservice cstservice) {
        //0为正常状态，1为删除状态
        cstservice.setSvrFlag(1);
        cstserviceMapper.updateByPrimaryKeySelective(cstservice);
    }
    //f服务处理
    @Override
    public void deal(Cstservice cstservice) {
        cstservice.setSvrDealDate(new Date());
        System.out.println(cstservice.getSvrDealDate());
        cstserviceMapper.updateByPrimaryKeySelective(cstservice);

    }


}
