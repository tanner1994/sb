package com.sb.dao.businesstype;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.businesstype.model.BusinessType;
import com.sb.dao.businesstype.model.BusinessTypeExample;

public interface BusinessTypeMapper {
    int countByExample(BusinessTypeExample example);

    int deleteByExample(BusinessTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessType record);

    int insertSelective(BusinessType record);

    List<BusinessType> selectByExample(BusinessTypeExample example);

    BusinessType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessType record, @Param("example") BusinessTypeExample example);

    int updateByExample(@Param("record") BusinessType record, @Param("example") BusinessTypeExample example);

    int updateByPrimaryKeySelective(BusinessType record);

    int updateByPrimaryKey(BusinessType record);
}
