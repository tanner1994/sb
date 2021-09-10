package com.sb.dao.securities;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.securities.model.Securities;
import com.sb.dao.securities.model.SecuritiesExample;

public interface SecuritiesMapper {
    int countByExample(SecuritiesExample example);

    int deleteByExample(SecuritiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Securities record);

    int insertSelective(Securities record);

    List<Securities> selectByExample(SecuritiesExample example);

    Securities selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Securities record, @Param("example") SecuritiesExample example);

    int updateByExample(@Param("record") Securities record, @Param("example") SecuritiesExample example);

    int updateByPrimaryKeySelective(Securities record);

    int updateByPrimaryKey(Securities record);
}
