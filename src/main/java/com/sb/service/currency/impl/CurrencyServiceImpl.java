package com.sb.service.currency.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.currency.CurrencyMapper;
import com.sb.dao.currency.model.Currency;
import com.sb.dao.currency.model.CurrencyExample;
import com.sb.service.currency.CurrencyService;

/**
 * 币种Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    private CurrencyMapper currencyMapper;

    @Override
    public Integer create(Currency currency) {
        currencyMapper.insertSelective(currency);
        return currency.getId();
    }

    @Override
    public void deleteById(Integer id) {
        currencyMapper.deleteByPrimaryKey(id);
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
    public void updateById(Currency currency) {
        currencyMapper.updateByPrimaryKeySelective(currency);
    }

    @Override
    public void updateByIdInBatch(List<Currency> currencys) {
        if (CollectionUtils.isEmpty(currencys))
            return;
        for (Currency currency : currencys) {
            this.updateById(currency);
        }
    }

    @Override
    public Currency findById(Integer id) {
        return currencyMapper.selectByPrimaryKey(id);
    }

    @Override
    public Currency findOne(Currency currency) {
        ExampleBuilder<CurrencyExample, CurrencyExample.Criteria> builder =
            ExampleBuilder.create(CurrencyExample.class, CurrencyExample.Criteria.class);
        List<Currency> currencys = currencyMapper.selectByExample(builder.buildExamplePack(currency).getExample());
        if (currencys.size() > 0) {
            return currencys.get(0);
        }
        return null;
    }

    @Override
    public List<Currency> findList(Currency currency) {
        ExampleBuilder<CurrencyExample, CurrencyExample.Criteria> builder =
            ExampleBuilder.create(CurrencyExample.class, CurrencyExample.Criteria.class);
        return currencyMapper.selectByExample(builder.buildExamplePack(currency).getExample());
    }

    @Override
    public PageData<Currency> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<CurrencyExample, CurrencyExample.Criteria> builder =
            ExampleBuilder.create(CurrencyExample.class, CurrencyExample.Criteria.class);
        ExampleBuilder.ExamplePack<CurrencyExample, CurrencyExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(currencyMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Currency currency) {
        ExampleBuilder<CurrencyExample, CurrencyExample.Criteria> builder =
            ExampleBuilder.create(CurrencyExample.class, CurrencyExample.Criteria.class);
        return currencyMapper.countByExample(builder.buildExamplePack(currency).getExample());
    }
}
