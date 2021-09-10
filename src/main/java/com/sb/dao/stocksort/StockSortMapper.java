package com.sb.dao.stocksort;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.stocksort.model.StockSort;
import com.sb.dao.stocksort.model.StockSortExample;

public interface StockSortMapper {
    int countByExample(StockSortExample example);

    int deleteByExample(StockSortExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockSort record);

    int insertSelective(StockSort record);

    List<StockSort> selectByExample(StockSortExample example);

    StockSort selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockSort record, @Param("example") StockSortExample example);

    int updateByExample(@Param("record") StockSort record, @Param("example") StockSortExample example);

    int updateByPrimaryKeySelective(StockSort record);

    int updateByPrimaryKey(StockSort record);
}
