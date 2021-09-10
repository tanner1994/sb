package com.sb.service.tradecalendar.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.tradecalendar.TradeCalendarMapper;
import com.sb.dao.tradecalendar.model.TradeCalendar;
import com.sb.dao.tradecalendar.model.TradeCalendarExample;
import com.sb.service.tradecalendar.TradeCalendarService;

/**
 * 交易日历Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class TradeCalendarServiceImpl implements TradeCalendarService {

    @Autowired
    private TradeCalendarMapper tradeCalendarMapper;

    @Override
    public Integer create(TradeCalendar tradeCalendar) {
        tradeCalendarMapper.insertSelective(tradeCalendar);
        return tradeCalendar.getId();
    }

    @Override
    public void deleteById(Integer id) {
        tradeCalendarMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<Integer> ids) {
        if (CollectionUtils.isEmpty(ids))
            return;
        for (Integer id : ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(TradeCalendar tradeCalendar) {
        tradeCalendarMapper.updateByPrimaryKeySelective(tradeCalendar);
    }

    @Override
    public void updateByIdInBatch(List<TradeCalendar> tradeCalendars) {
        if (CollectionUtils.isEmpty(tradeCalendars))
            return;
        for (TradeCalendar tradeCalendar : tradeCalendars) {
            this.updateById(tradeCalendar);
        }
    }

    @Override
    public TradeCalendar findById(Integer id) {
        return tradeCalendarMapper.selectByPrimaryKey(id);
    }

    @Override
    public TradeCalendar findOne(TradeCalendar tradeCalendar) {
        ExampleBuilder<TradeCalendarExample, TradeCalendarExample.Criteria> builder =
            ExampleBuilder.create(TradeCalendarExample.class, TradeCalendarExample.Criteria.class);
        List<TradeCalendar> tradeCalendars =
            tradeCalendarMapper.selectByExample(builder.buildExamplePack(tradeCalendar).getExample());
        if (tradeCalendars.size() > 0) {
            return tradeCalendars.get(0);
        }
        return null;
    }

    @Override
    public List<TradeCalendar> findList(TradeCalendar tradeCalendar) {
        ExampleBuilder<TradeCalendarExample, TradeCalendarExample.Criteria> builder =
            ExampleBuilder.create(TradeCalendarExample.class, TradeCalendarExample.Criteria.class);
        return tradeCalendarMapper.selectByExample(builder.buildExamplePack(tradeCalendar).getExample());
    }

    @Override
    public PageData<TradeCalendar> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<TradeCalendarExample, TradeCalendarExample.Criteria> builder =
            ExampleBuilder.create(TradeCalendarExample.class, TradeCalendarExample.Criteria.class);
        ExampleBuilder.ExamplePack<TradeCalendarExample, TradeCalendarExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(tradeCalendarMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(TradeCalendar tradeCalendar) {
        ExampleBuilder<TradeCalendarExample, TradeCalendarExample.Criteria> builder =
            ExampleBuilder.create(TradeCalendarExample.class, TradeCalendarExample.Criteria.class);
        return tradeCalendarMapper.countByExample(builder.buildExamplePack(tradeCalendar).getExample());
    }
}
