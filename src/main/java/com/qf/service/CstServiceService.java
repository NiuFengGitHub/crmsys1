package com.qf.service;

import com.qf.entity.Cstservice;
import com.qf.vo.VService;
import com.qf.vo.VServicedeal;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author feng
 * @create 2019-05-21 下午 7:01
 */

public interface CstServiceService {
    //查询所有
    Map<String,Object> findAllService(int page);
    //
    VServicedeal findByNo(Integer id);

    //更新数据
    public  void updateById(VServicedeal servicedeal);

    //条件查询
    public Map<String,Object> searchByCondition(int page,VService vService);

    //添加服务
    public void add(Cstservice cstservice, HttpSession session);

    //创建分配
    public void distribute(Cstservice cstservice);


    //删除服务
    public void delete(Cstservice cstservice);

    //服务处理
    public void deal(Cstservice cstservice);

    //统计报表
    public Map<String,Object> searchAllTable(int page);

}
