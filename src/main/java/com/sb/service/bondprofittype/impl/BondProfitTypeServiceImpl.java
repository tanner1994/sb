package com.sb.service.bondprofittype.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.bondprofittype.BondProfitTypeMapper;
import com.sb.dao.bondprofittype.model.BondProfitType;
import com.sb.dao.bondprofittype.model.BondProfitTypeExample;
import com.sb.service.bondprofittype.BondProfitTypeService;

/**
 * 债券收益方式Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class BondProfitTypeServiceImpl implements BondProfitTypeService {

    @Autowired
    private BondProfitTypeMapper bondProfitTypeMapper;

    @Override
    public Integer create(BondProfitType bondProfitType) {
        bondProfitTypeMapper.insertSelective(bondProfitType);
        return bondProfitType.getId();
    }

    @Override
    public void deleteById(Integer id) {
        bondProfitTypeMapper.deleteByPrimaryKey(id);
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
    public void updateById(BondProfitType bondProfitType) {
        bondProfitTypeMapper.updateByPrimaryKeySelective(bondProfitType);
    }

    @Override
    public void updateByIdInBatch(List<BondProfitType> bondProfitTypes) {
        if (CollectionUtils.isEmpty(bondProfitTypes))
            return;
        for (BondProfitType bondProfitType : bondProfitTypes) {
            this.updateById(bondProfitType);
        }
    }

    @Override
    public BondProfitType findById(Integer id) {
        return bondProfitTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public BondProfitType findOne(BondProfitType bondProfitType) {
        ExampleBuilder<BondProfitTypeExample, BondProfitTypeExample.Criteria> builder =
            ExampleBuilder.create(BondProfitTypeExample.class, BondProfitTypeExample.Criteria.class);
        List<BondProfitType> bondProfitTypes =
            bondProfitTypeMapper.selectByExample(builder.buildExamplePack(bondProfitType).getExample());
        if (bondProfitTypes.size() > 0) {
            return bondProfitTypes.get(0);
        }
        return null;
    }

    @Override
    public List<BondProfitType> findList(BondProfitType bondProfitType) {
        ExampleBuilder<BondProfitTypeExample, BondProfitTypeExample.Criteria> builder =
            ExampleBuilder.create(BondProfitTypeExample.class, BondProfitTypeExample.Criteria.class);
        return bondProfitTypeMapper.selectByExample(builder.buildExamplePack(bondProfitType).getExample());
    }

    @Override
    public PageData<BondProfitType> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<BondProfitTypeExample, BondProfitTypeExample.Criteria> builder =
            ExampleBuilder.create(BondProfitTypeExample.class, BondProfitTypeExample.Criteria.class);
        ExampleBuilder.ExamplePack<BondProfitTypeExample, BondProfitTypeExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(bondProfitTypeMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(BondProfitType bondProfitType) {
        ExampleBuilder<BondProfitTypeExample, BondProfitTypeExample.Criteria> builder =
            ExampleBuilder.create(BondProfitTypeExample.class, BondProfitTypeExample.Criteria.class);
        return bondProfitTypeMapper.countByExample(builder.buildExamplePack(bondProfitType).getExample());
    }
}
