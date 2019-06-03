package com.qf.dao;

import com.qf.vo.VService;
import com.qf.vo.VServicedeal;

import java.util.List;

/**
 * @author feng
 * @create 2019-05-21 下午 5:54
 */
public interface CstService {
    List<VService> findService();
    VServicedeal findByNo(Integer id);
    //更新数据
    public void update(VServicedeal servicedeal);

}
