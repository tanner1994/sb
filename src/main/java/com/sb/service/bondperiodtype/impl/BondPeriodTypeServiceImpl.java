package com.sb.service.bondperiodtype.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.bondperiodtype.BondPeriodTypeMapper;
import com.sb.dao.bondperiodtype.model.BondPeriodType;
import com.sb.dao.bondperiodtype.model.BondPeriodTypeExample;
import com.sb.service.bondperiodtype.BondPeriodTypeService;

/**
 * 债券付息周期Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class BondPeriodTypeServiceImpl implements BondPeriodTypeService {

    @Autowired
    private BondPeriodTypeMapper bondPeriodTypeMapper;

    @Override
    public Integer create(BondPeriodType bondPeriodType) {
        bondPeriodTypeMapper.insertSelective(bondPeriodType);
        return bondPeriodType.getId();
    }

    @Override
    public void deleteById(Integer id) {
        bondPeriodTypeMapper.deleteByPrimaryKey(id);
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
    public void updateById(BondPeriodType bondPeriodType) {
        bondPeriodTypeMapper.updateByPrimaryKeySelective(bondPeriodType);
    }

    @Override
    public void updateByIdInBatch(List<BondPeriodType> bondPeriodTypes) {
        if (CollectionUtils.isEmpty(bondPeriodTypes))
            return;
        for (BondPeriodType bondPeriodType : bondPeriodTypes) {
            this.updateById(bondPeriodType);
        }
    }

    @Override
    public BondPeriodType findById(Integer id) {
        return bondPeriodTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public BondPeriodType findOne(BondPeriodType bondPeriodType) {
        ExampleBuilder<BondPeriodTypeExample, BondPeriodTypeExample.Criteria> builder =
            ExampleBuilder.create(BondPeriodTypeExample.class, BondPeriodTypeExample.Criteria.class);
        List<BondPeriodType> bondPeriodTypes =
            bondPeriodTypeMapper.selectByExample(builder.buildExamplePack(bondPeriodType).getExample());
        if (bondPeriodTypes.size() > 0) {
            return bondPeriodTypes.get(0);
        }
        return null;
    }

    @Override
    public List<BondPeriodType> findList(BondPeriodType bondPeriodType) {
        ExampleBuilder<BondPeriodTypeExample, BondPeriodTypeExample.Criteria> builder =
            ExampleBuilder.create(BondPeriodTypeExample.class, BondPeriodTypeExample.Criteria.class);
        return bondPeriodTypeMapper.selectByExample(builder.buildExamplePack(bondPeriodType).getExample());
    }

    @Override
    public PageData<BondPeriodType> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<BondPeriodTypeExample, BondPeriodTypeExample.Criteria> builder =
            ExampleBuilder.create(BondPeriodTypeExample.class, BondPeriodTypeExample.Criteria.class);
        ExampleBuilder.ExamplePack<BondPeriodTypeExample, BondPeriodTypeExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(bondPeriodTypeMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(BondPeriodType bondPeriodType) {
        ExampleBuilder<BondPeriodTypeExample, BondPeriodTypeExample.Criteria> builder =
            ExampleBuilder.create(BondPeriodTypeExample.class, BondPeriodTypeExample.Criteria.class);
        return bondPeriodTypeMapper.countByExample(builder.buildExamplePack(bondPeriodType).getExample());
    }
}
