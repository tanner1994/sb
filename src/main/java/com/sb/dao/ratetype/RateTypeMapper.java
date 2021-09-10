package com.sb.dao.ratetype;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.ratetype.model.RateType;
import com.sb.dao.ratetype.model.RateTypeExample;

public interface RateTypeMapper {
    int countByExample(RateTypeExample example);

    int deleteByExample(RateTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RateType record);

    int insertSelective(RateType record);

    List<RateType> selectByExample(RateTypeExample example);

    RateType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RateType record, @Param("example") RateTypeExample example);

    int updateByExample(@Param("record") RateType record, @Param("example") RateTypeExample example);

    int updateByPrimaryKeySelective(RateType record);

    int updateByPrimaryKey(RateType record);
}
