package com.sb.dao.capitalhis;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.capitalhis.model.CapitalHis;
import com.sb.dao.capitalhis.model.CapitalHisExample;

public interface CapitalHisMapper {
    int countByExample(CapitalHisExample example);

    int deleteByExample(CapitalHisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CapitalHis record);

    int insertSelective(CapitalHis record);

    List<CapitalHis> selectByExample(CapitalHisExample example);

    CapitalHis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CapitalHis record, @Param("example") CapitalHisExample example);

    int updateByExample(@Param("record") CapitalHis record, @Param("example") CapitalHisExample example);

    int updateByPrimaryKeySelective(CapitalHis record);

    int updateByPrimaryKey(CapitalHis record);
}
