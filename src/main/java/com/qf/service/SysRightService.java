package com.qf.service;

import java.util.List;
import java.util.Map;

import com.qf.vo.VMenuInfo;
import com.qf.vo.VRight;

public interface SysRightService {
	public List<VMenuInfo> findMenu(int rid);
	//权限管理
	public Map<String,Object> findByPage(int page);

}
