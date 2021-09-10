package com.sb.dao.capital;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.capital.model.Capital;
import com.sb.dao.capital.model.CapitalExample;

public interface CapitalMapper {
    int countByExample(CapitalExample example);

    int deleteByExample(CapitalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Capital record);

    int insertSelective(Capital record);

    List<Capital> selectByExample(CapitalExample example);

    Capital selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Capital record, @Param("example") CapitalExample example);

    int updateByExample(@Param("record") Capital record, @Param("example") CapitalExample example);

    int updateByPrimaryKeySelective(Capital record);

    int updateByPrimaryKey(Capital record);
}
