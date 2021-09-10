package com.sb.service.capitalhis.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.capitalhis.CapitalHisMapper;
import com.sb.dao.capitalhis.model.CapitalHis;
import com.sb.dao.capitalhis.model.CapitalHisExample;
import com.sb.service.capitalhis.CapitalHisService;

/**
 * 证券历史属性Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class CapitalHisServiceImpl implements CapitalHisService {

    @Autowired
    private CapitalHisMapper capitalHisMapper;

    @Override
    public Integer create(CapitalHis capitalHis) {
        capitalHisMapper.insertSelective(capitalHis);
        return capitalHis.getId();
    }

    @Override
    public void deleteById(Integer id) {
        capitalHisMapper.deleteByPrimaryKey(id);
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
    public void updateById(CapitalHis capitalHis) {
        capitalHisMapper.updateByPrimaryKeySelective(capitalHis);
    }

    @Override
    public void updateByIdInBatch(List<CapitalHis> capitalHiss) {
        if (CollectionUtils.isEmpty(capitalHiss))
            return;
        for (CapitalHis capitalHis : capitalHiss) {
            this.updateById(capitalHis);
        }
    }

    @Override
    public CapitalHis findById(Integer id) {
        return capitalHisMapper.selectByPrimaryKey(id);
    }

    @Override
    public CapitalHis findOne(CapitalHis capitalHis) {
        ExampleBuilder<CapitalHisExample, CapitalHisExample.Criteria> builder =
            ExampleBuilder.create(CapitalHisExample.class, CapitalHisExample.Criteria.class);
        List<CapitalHis> capitalHiss =
            capitalHisMapper.selectByExample(builder.buildExamplePack(capitalHis).getExample());
        if (capitalHiss.size() > 0) {
            return capitalHiss.get(0);
        }
        return null;
    }

    @Override
    public List<CapitalHis> findList(CapitalHis capitalHis) {
        ExampleBuilder<CapitalHisExample, CapitalHisExample.Criteria> builder =
            ExampleBuilder.create(CapitalHisExample.class, CapitalHisExample.Criteria.class);
        return capitalHisMapper.selectByExample(builder.buildExamplePack(capitalHis).getExample());
    }

    @Override
    public PageData<CapitalHis> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<CapitalHisExample, CapitalHisExample.Criteria> builder =
            ExampleBuilder.create(CapitalHisExample.class, CapitalHisExample.Criteria.class);
        ExampleBuilder.ExamplePack<CapitalHisExample, CapitalHisExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(capitalHisMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(CapitalHis capitalHis) {
        ExampleBuilder<CapitalHisExample, CapitalHisExample.Criteria> builder =
            ExampleBuilder.create(CapitalHisExample.class, CapitalHisExample.Criteria.class);
        return capitalHisMapper.countByExample(builder.buildExamplePack(capitalHis).getExample());
    }
}
