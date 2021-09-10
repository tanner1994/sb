package com.sb.service.trademarket.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.trademarket.TradeMarketMapper;
import com.sb.dao.trademarket.model.TradeMarket;
import com.sb.dao.trademarket.model.TradeMarketExample;
import com.sb.service.trademarket.TradeMarketService;

/**
 * 行情Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class TradeMarketServiceImpl implements TradeMarketService {

    @Autowired
    private TradeMarketMapper tradeMarketMapper;

    @Override
    public Integer create(TradeMarket tradeMarket) {
        tradeMarketMapper.insertSelective(tradeMarket);
        return tradeMarket.getId();
    }

    @Override
    public void deleteById(Integer id) {
        tradeMarketMapper.deleteByPrimaryKey(id);
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
    public void updateById(TradeMarket tradeMarket) {
        tradeMarketMapper.updateByPrimaryKeySelective(tradeMarket);
    }

    @Override
    public void updateByIdInBatch(List<TradeMarket> tradeMarkets) {
        if (CollectionUtils.isEmpty(tradeMarkets))
            return;
        for (TradeMarket tradeMarket : tradeMarkets) {
            this.updateById(tradeMarket);
        }
    }

    @Override
    public TradeMarket findById(Integer id) {
        return tradeMarketMapper.selectByPrimaryKey(id);
    }

    @Override
    public TradeMarket findOne(TradeMarket tradeMarket) {
        ExampleBuilder<TradeMarketExample, TradeMarketExample.Criteria> builder =
            ExampleBuilder.create(TradeMarketExample.class, TradeMarketExample.Criteria.class);
        List<TradeMarket> tradeMarkets =
            tradeMarketMapper.selectByExample(builder.buildExamplePack(tradeMarket).getExample());
        if (tradeMarkets.size() > 0) {
            return tradeMarkets.get(0);
        }
        return null;
    }

    @Override
    public List<TradeMarket> findList(TradeMarket tradeMarket) {
        ExampleBuilder<TradeMarketExample, TradeMarketExample.Criteria> builder =
            ExampleBuilder.create(TradeMarketExample.class, TradeMarketExample.Criteria.class);
        return tradeMarketMapper.selectByExample(builder.buildExamplePack(tradeMarket).getExample());
    }

    @Override
    public PageData<TradeMarket> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<TradeMarketExample, TradeMarketExample.Criteria> builder =
            ExampleBuilder.create(TradeMarketExample.class, TradeMarketExample.Criteria.class);
        ExampleBuilder.ExamplePack<TradeMarketExample, TradeMarketExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(tradeMarketMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(TradeMarket tradeMarket) {
        ExampleBuilder<TradeMarketExample, TradeMarketExample.Criteria> builder =
            ExampleBuilder.create(TradeMarketExample.class, TradeMarketExample.Criteria.class);
        return tradeMarketMapper.countByExample(builder.buildExamplePack(tradeMarket).getExample());
    }
}
