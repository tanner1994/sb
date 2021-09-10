package com.sb.dao.tradecalendar;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.tradecalendar.model.TradeCalendar;
import com.sb.dao.tradecalendar.model.TradeCalendarExample;

public interface TradeCalendarMapper {
    int countByExample(TradeCalendarExample example);

    int deleteByExample(TradeCalendarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TradeCalendar record);

    int insertSelective(TradeCalendar record);

    List<TradeCalendar> selectByExample(TradeCalendarExample example);

    TradeCalendar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TradeCalendar record, @Param("example") TradeCalendarExample example);

    int updateByExample(@Param("record") TradeCalendar record, @Param("example") TradeCalendarExample example);

    int updateByPrimaryKeySelective(TradeCalendar record);

    int updateByPrimaryKey(TradeCalendar record);
}
