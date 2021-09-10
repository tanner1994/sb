package com.sb.dao.costplan;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.costplan.model.CostPlan;
import com.sb.dao.costplan.model.CostPlanExample;

public interface CostPlanMapper {
    int countByExample(CostPlanExample example);

    int deleteByExample(CostPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CostPlan record);

    int insertSelective(CostPlan record);

    List<CostPlan> selectByExample(CostPlanExample example);

    CostPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CostPlan record, @Param("example") CostPlanExample example);

    int updateByExample(@Param("record") CostPlan record, @Param("example") CostPlanExample example);

    int updateByPrimaryKeySelective(CostPlan record);

    int updateByPrimaryKey(CostPlan record);
}
