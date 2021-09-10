package com.sb.dao.bondprofittype;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.bondprofittype.model.BondProfitType;
import com.sb.dao.bondprofittype.model.BondProfitTypeExample;

public interface BondProfitTypeMapper {
    int countByExample(BondProfitTypeExample example);

    int deleteByExample(BondProfitTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BondProfitType record);

    int insertSelective(BondProfitType record);

    List<BondProfitType> selectByExample(BondProfitTypeExample example);

    BondProfitType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BondProfitType record,
        @Param("example") BondProfitTypeExample example);

    int updateByExample(@Param("record") BondProfitType record, @Param("example") BondProfitTypeExample example);

    int updateByPrimaryKeySelective(BondProfitType record);

    int updateByPrimaryKey(BondProfitType record);
}
