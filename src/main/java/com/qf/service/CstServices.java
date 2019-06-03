package com.qf.service;

import com.qf.vo.VServicedeal;

import java.util.Map;

/**
 * @author feng
 * @create 2019-05-21 下午 7:01
 */

public interface CstServices {
    //查询所有
    Map<String,Object> findAllService(int page);
    //
    VServicedeal findByNo(String no);

}
