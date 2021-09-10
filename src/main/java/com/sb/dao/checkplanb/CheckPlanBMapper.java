package com.sb.dao.checkplanb;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.checkplanb.model.CheckPlanB;
import com.sb.dao.checkplanb.model.CheckPlanBExample;

public interface CheckPlanBMapper {
    int countByExample(CheckPlanBExample example);

    int deleteByExample(CheckPlanBExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckPlanB record);

    int insertSelective(CheckPlanB record);

    List<CheckPlanB> selectByExample(CheckPlanBExample example);

    CheckPlanB selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckPlanB record, @Param("example") CheckPlanBExample example);

    int updateByExample(@Param("record") CheckPlanB record, @Param("example") CheckPlanBExample example);

    int updateByPrimaryKeySelective(CheckPlanB record);

    int updateByPrimaryKey(CheckPlanB record);
}
