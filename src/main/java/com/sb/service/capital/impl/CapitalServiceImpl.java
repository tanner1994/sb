package com.sb.service.capital.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.capital.CapitalMapper;
import com.sb.dao.capital.model.Capital;
import com.sb.dao.capital.model.CapitalExample;
import com.sb.service.capital.CapitalService;

/**
 * 股本Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class CapitalServiceImpl implements CapitalService {

    @Autowired
    private CapitalMapper capitalMapper;

    @Override
    public Integer create(Capital capital) {
        capitalMapper.insertSelective(capital);
        return capital.getId();
    }

    @Override
    public void deleteById(Integer id) {
        capitalMapper.deleteByPrimaryKey(id);
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
    public void updateById(Capital capital) {
        capitalMapper.updateByPrimaryKeySelective(capital);
    }

    @Override
    public void updateByIdInBatch(List<Capital> capitals) {
        if (CollectionUtils.isEmpty(capitals))
            return;
        for (Capital capital : capitals) {
            this.updateById(capital);
        }
    }

    @Override
    public Capital findById(Integer id) {
        return capitalMapper.selectByPrimaryKey(id);
    }

    @Override
    public Capital findOne(Capital capital) {
        ExampleBuilder<CapitalExample, CapitalExample.Criteria> builder =
            ExampleBuilder.create(CapitalExample.class, CapitalExample.Criteria.class);
        List<Capital> capitals = capitalMapper.selectByExample(builder.buildExamplePack(capital).getExample());
        if (capitals.size() > 0) {
            return capitals.get(0);
        }
        return null;
    }

    @Override
    public List<Capital> findList(Capital capital) {
        ExampleBuilder<CapitalExample, CapitalExample.Criteria> builder =
            ExampleBuilder.create(CapitalExample.class, CapitalExample.Criteria.class);
        return capitalMapper.selectByExample(builder.buildExamplePack(capital).getExample());
    }

    @Override
    public PageData<Capital> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<CapitalExample, CapitalExample.Criteria> builder =
            ExampleBuilder.create(CapitalExample.class, CapitalExample.Criteria.class);
        ExampleBuilder.ExamplePack<CapitalExample, CapitalExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(capitalMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Capital capital) {
        ExampleBuilder<CapitalExample, CapitalExample.Criteria> builder =
            ExampleBuilder.create(CapitalExample.class, CapitalExample.Criteria.class);
        return capitalMapper.countByExample(builder.buildExamplePack(capital).getExample());
    }
}
