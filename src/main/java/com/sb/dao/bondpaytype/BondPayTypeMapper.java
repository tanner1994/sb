package com.sb.dao.bondpaytype;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.bondpaytype.model.BondPayType;
import com.sb.dao.bondpaytype.model.BondPayTypeExample;

public interface BondPayTypeMapper {
    int countByExample(BondPayTypeExample example);

    int deleteByExample(BondPayTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BondPayType record);

    int insertSelective(BondPayType record);

    List<BondPayType> selectByExample(BondPayTypeExample example);

    BondPayType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BondPayType record, @Param("example") BondPayTypeExample example);

    int updateByExample(@Param("record") BondPayType record, @Param("example") BondPayTypeExample example);

    int updateByPrimaryKeySelective(BondPayType record);

    int updateByPrimaryKey(BondPayType record);
}
