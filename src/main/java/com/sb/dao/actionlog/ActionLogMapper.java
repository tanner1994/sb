package com.sb.dao.actionlog;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.actionlog.model.ActionLog;
import com.sb.dao.actionlog.model.ActionLogExample;

public interface ActionLogMapper {
    int countByExample(ActionLogExample example);

    int deleteByExample(ActionLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActionLog record);

    int insertSelective(ActionLog record);

    List<ActionLog> selectByExample(ActionLogExample example);

    ActionLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActionLog record, @Param("example") ActionLogExample example);

    int updateByExample(@Param("record") ActionLog record, @Param("example") ActionLogExample example);

    int updateByPrimaryKeySelective(ActionLog record);

    int updateByPrimaryKey(ActionLog record);
}
