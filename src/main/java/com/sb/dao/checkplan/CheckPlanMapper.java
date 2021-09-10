package com.sb.dao.checkplan;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.checkplan.model.CheckPlan;
import com.sb.dao.checkplan.model.CheckPlanExample;

public interface CheckPlanMapper {
    int countByExample(CheckPlanExample example);

    int deleteByExample(CheckPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckPlan record);

    int insertSelective(CheckPlan record);

    List<CheckPlan> selectByExample(CheckPlanExample example);

    CheckPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckPlan record, @Param("example") CheckPlanExample example);

    int updateByExample(@Param("record") CheckPlan record, @Param("example") CheckPlanExample example);

    int updateByPrimaryKeySelective(CheckPlan record);

    int updateByPrimaryKey(CheckPlan record);
}
