package com.qf.dao;

import com.qf.entity.CstLost;
import com.qf.vo.VLost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CstLostMapper {
    int deleteByPrimaryKey(Integer lstId);

    int insert(CstLost record);

    int insertSelective(CstLost record);

    CstLost selectByPrimaryKey(Integer lstId);

    int updateByPrimaryKeySelective(CstLost record);

    int updateByPrimaryKey(CstLost record);

    //查看即将流失客户
    public List<VLost> findAll();

    //根据id查询单个
    public VLost findById(int id);

    //条件查询
    public List<VLost> findByCondition(@Param("name") String name,@Param("managerId") int managerId,@Param("lstStatus") int lstStatus);
}