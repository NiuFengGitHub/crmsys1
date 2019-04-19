package com.qf.service;

import java.util.Map;

public interface CstLinkmanService {
    //查询公司联系人信息
    public Map<String,Object> findAllLinkman(int page,String cstno);
}
