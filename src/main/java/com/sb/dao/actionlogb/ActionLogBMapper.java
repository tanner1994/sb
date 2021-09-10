package com.sb.dao.actionlogb;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.actionlogb.model.ActionLogB;
import com.sb.dao.actionlogb.model.ActionLogBExample;

public interface ActionLogBMapper {
    int countByExample(ActionLogBExample example);

    int deleteByExample(ActionLogBExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActionLogB record);

    int insertSelective(ActionLogB record);

    List<ActionLogB> selectByExample(ActionLogBExample example);

    ActionLogB selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActionLogB record, @Param("example") ActionLogBExample example);

    int updateByExample(@Param("record") ActionLogB record, @Param("example") ActionLogBExample example);

    int updateByPrimaryKeySelective(ActionLogB record);

    int updateByPrimaryKey(ActionLogB record);
}
