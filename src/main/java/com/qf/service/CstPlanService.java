package com.qf.service;

import com.qf.entity.SalChance;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Service
public interface CstPlanService {
	//插叙所有
	public  Map<String ,Object> findAllPlan(int page, HttpSession session);

	//更新(制定计划)
	public int update(SalChance salChance);
	

}
