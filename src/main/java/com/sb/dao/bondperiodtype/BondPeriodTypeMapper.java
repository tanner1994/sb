package com.sb.dao.bondperiodtype;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.bondperiodtype.model.BondPeriodType;
import com.sb.dao.bondperiodtype.model.BondPeriodTypeExample;

public interface BondPeriodTypeMapper {
    int countByExample(BondPeriodTypeExample example);

    int deleteByExample(BondPeriodTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BondPeriodType record);

    int insertSelective(BondPeriodType record);

    List<BondPeriodType> selectByExample(BondPeriodTypeExample example);

    BondPeriodType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BondPeriodType record,
        @Param("example") BondPeriodTypeExample example);

    int updateByExample(@Param("record") BondPeriodType record, @Param("example") BondPeriodTypeExample example);

    int updateByPrimaryKeySelective(BondPeriodType record);

    int updateByPrimaryKey(BondPeriodType record);
}
