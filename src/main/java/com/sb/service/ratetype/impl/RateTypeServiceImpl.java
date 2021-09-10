package com.sb.service.ratetype.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.ratetype.RateTypeMapper;
import com.sb.dao.ratetype.model.RateType;
import com.sb.dao.ratetype.model.RateTypeExample;
import com.sb.service.ratetype.RateTypeService;

/**
 * 利率类型Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class RateTypeServiceImpl implements RateTypeService {

    @Autowired
    private RateTypeMapper rateTypeMapper;

    @Override
    public Integer create(RateType rateType) {
        rateTypeMapper.insertSelective(rateType);
        return rateType.getId();
    }

    @Override
    public void deleteById(Integer id) {
        rateTypeMapper.deleteByPrimaryKey(id);
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
    public void updateById(RateType rateType) {
        rateTypeMapper.updateByPrimaryKeySelective(rateType);
    }

    @Override
    public void updateByIdInBatch(List<RateType> rateTypes) {
        if (CollectionUtils.isEmpty(rateTypes))
            return;
        for (RateType rateType : rateTypes) {
            this.updateById(rateType);
        }
    }

    @Override
    public RateType findById(Integer id) {
        return rateTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public RateType findOne(RateType rateType) {
        ExampleBuilder<RateTypeExample, RateTypeExample.Criteria> builder =
            ExampleBuilder.create(RateTypeExample.class, RateTypeExample.Criteria.class);
        List<RateType> rateTypes = rateTypeMapper.selectByExample(builder.buildExamplePack(rateType).getExample());
        if (rateTypes.size() > 0) {
            return rateTypes.get(0);
        }
        return null;
    }

    @Override
    public List<RateType> findList(RateType rateType) {
        ExampleBuilder<RateTypeExample, RateTypeExample.Criteria> builder =
            ExampleBuilder.create(RateTypeExample.class, RateTypeExample.Criteria.class);
        return rateTypeMapper.selectByExample(builder.buildExamplePack(rateType).getExample());
    }

    @Override
    public PageData<RateType> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<RateTypeExample, RateTypeExample.Criteria> builder =
            ExampleBuilder.create(RateTypeExample.class, RateTypeExample.Criteria.class);
        ExampleBuilder.ExamplePack<RateTypeExample, RateTypeExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(rateTypeMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(RateType rateType) {
        ExampleBuilder<RateTypeExample, RateTypeExample.Criteria> builder =
            ExampleBuilder.create(RateTypeExample.class, RateTypeExample.Criteria.class);
        return rateTypeMapper.countByExample(builder.buildExamplePack(rateType).getExample());
    }
}
