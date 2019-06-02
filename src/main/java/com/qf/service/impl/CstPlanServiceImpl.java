package com.qf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.common.CommonInfo;
import com.qf.dao.CstPlanMapper;
import com.qf.dao.SalChanceMapper;
import com.qf.entity.SalChance;
import com.qf.entity.SysUser;
import com.qf.service.CstPlanService;
import com.qf.vo.VPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CstPlanServiceImpl implements CstPlanService {

	@Autowired
	private CstPlanMapper planDao;
	@Autowired
	private SalChanceMapper salChanceDao;
//	@Override
//	public Map<String, Object> findAllPlan(int page) {
//		PageHelper.startPage(page, 5);
//		List<CstPlan> list = planDao.findAll();
//		long total = ((Page)list).getTotal();
//		Map<String,Object> map = new HashMap<>();
//		map.put("total", total);
//		map.put("rows", list);
//		return map;
//	}


	@Override
	public Map<String, Object> findAllPlan(int page, HttpSession session){
		SysUser user = (SysUser) session.getAttribute(CommonInfo.Login_User);
		PageHelper.startPage(page,5);
		Integer id = user.getUsrId();
		List<VPlan> list = planDao.findAll(id);
		long total = ((Page) list).getTotal();
		Map<String,Object> map = new HashMap<>();
		map.put("total",total);
		map.put("rows",list);
		return map;
	}

	@Override
	public int update(SalChance salChance) {
		return salChanceDao.updateByPrimaryKeySelective(salChance);
	}
}
