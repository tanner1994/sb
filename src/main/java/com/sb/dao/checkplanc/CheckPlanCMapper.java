package com.sb.dao.checkplanc;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.checkplanc.model.CheckPlanC;
import com.sb.dao.checkplanc.model.CheckPlanCExample;

public interface CheckPlanCMapper {
    int countByExample(CheckPlanCExample example);

    int deleteByExample(CheckPlanCExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckPlanC record);

    int insertSelective(CheckPlanC record);

    List<CheckPlanC> selectByExample(CheckPlanCExample example);

    CheckPlanC selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckPlanC record, @Param("example") CheckPlanCExample example);

    int updateByExample(@Param("record") CheckPlanC record, @Param("example") CheckPlanCExample example);

    int updateByPrimaryKeySelective(CheckPlanC record);

    int updateByPrimaryKey(CheckPlanC record);
}
