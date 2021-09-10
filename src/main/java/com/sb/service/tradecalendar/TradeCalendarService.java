package com.sb.service.tradecalendar;

import java.util.List;

import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.dao.tradecalendar.model.TradeCalendar;

/**
 * 交易日历Service定义
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
public interface TradeCalendarService {

    /**
     * 创建
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    Integer create(TradeCalendar tradeCalendar);

    /**
     * 主键删除
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    void deleteById(Integer id);

    /**
     * 批量主键删除
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    void deleteByIdInBatch(List<Integer> ids);

    /**
     * 主键更新
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    void updateById(TradeCalendar tradeCalendar);

    /**
     * 批量主键更新
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    void updateByIdInBatch(List<TradeCalendar> tradeCalendars);

    /**
     * 主键查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    TradeCalendar findById(Integer id);

    /**
     * 条件查询单条记录
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    TradeCalendar findOne(TradeCalendar tradeCalendar);

    /**
     * 条件查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    List<TradeCalendar> findList(TradeCalendar tradeCalendar);

    /**
     * 分页查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    PageData<TradeCalendar> findPage(PageWrap<TradeCalendar> pageWrap);

    /**
     * 条件统计
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    long count(TradeCalendar tradeCalendar);
}
