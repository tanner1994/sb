package com.sb.dao.trademarket;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.trademarket.model.TradeMarket;
import com.sb.dao.trademarket.model.TradeMarketExample;

public interface TradeMarketMapper {
    int countByExample(TradeMarketExample example);

    int deleteByExample(TradeMarketExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TradeMarket record);

    int insertSelective(TradeMarket record);

    List<TradeMarket> selectByExample(TradeMarketExample example);

    TradeMarket selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TradeMarket record, @Param("example") TradeMarketExample example);

    int updateByExample(@Param("record") TradeMarket record, @Param("example") TradeMarketExample example);

    int updateByPrimaryKeySelective(TradeMarket record);

    int updateByPrimaryKey(TradeMarket record);
}
