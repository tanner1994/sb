package com.sb.service.bondpaytype.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.bondpaytype.BondPayTypeMapper;
import com.sb.dao.bondpaytype.model.BondPayType;
import com.sb.dao.bondpaytype.model.BondPayTypeExample;
import com.sb.service.bondpaytype.BondPayTypeService;

/**
 * 债券还本付息方式Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class BondPayTypeServiceImpl implements BondPayTypeService {

    @Autowired
    private BondPayTypeMapper bondPayTypeMapper;

    @Override
    public Integer create(BondPayType bondPayType) {
        bondPayTypeMapper.insertSelective(bondPayType);
        return bondPayType.getId();
    }

    @Override
    public void deleteById(Integer id) {
        bondPayTypeMapper.deleteByPrimaryKey(id);
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
    public void updateById(BondPayType bondPayType) {
        bondPayTypeMapper.updateByPrimaryKeySelective(bondPayType);
    }

    @Override
    public void updateByIdInBatch(List<BondPayType> bondPayTypes) {
        if (CollectionUtils.isEmpty(bondPayTypes))
            return;
        for (BondPayType bondPayType : bondPayTypes) {
            this.updateById(bondPayType);
        }
    }

    @Override
    public BondPayType findById(Integer id) {
        return bondPayTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public BondPayType findOne(BondPayType bondPayType) {
        ExampleBuilder<BondPayTypeExample, BondPayTypeExample.Criteria> builder =
            ExampleBuilder.create(BondPayTypeExample.class, BondPayTypeExample.Criteria.class);
        List<BondPayType> bondPayTypes =
            bondPayTypeMapper.selectByExample(builder.buildExamplePack(bondPayType).getExample());
        if (bondPayTypes.size() > 0) {
            return bondPayTypes.get(0);
        }
        return null;
    }

    @Override
    public List<BondPayType> findList(BondPayType bondPayType) {
        ExampleBuilder<BondPayTypeExample, BondPayTypeExample.Criteria> builder =
            ExampleBuilder.create(BondPayTypeExample.class, BondPayTypeExample.Criteria.class);
        return bondPayTypeMapper.selectByExample(builder.buildExamplePack(bondPayType).getExample());
    }

    @Override
    public PageData<BondPayType> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<BondPayTypeExample, BondPayTypeExample.Criteria> builder =
            ExampleBuilder.create(BondPayTypeExample.class, BondPayTypeExample.Criteria.class);
        ExampleBuilder.ExamplePack<BondPayTypeExample, BondPayTypeExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(bondPayTypeMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(BondPayType bondPayType) {
        ExampleBuilder<BondPayTypeExample, BondPayTypeExample.Criteria> builder =
            ExampleBuilder.create(BondPayTypeExample.class, BondPayTypeExample.Criteria.class);
        return bondPayTypeMapper.countByExample(builder.buildExamplePack(bondPayType).getExample());
    }
}
