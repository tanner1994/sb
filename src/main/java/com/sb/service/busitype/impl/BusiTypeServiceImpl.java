package com.sb.service.busitype.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.busitype.BusiTypeMapper;
import com.sb.dao.busitype.model.BusiType;
import com.sb.dao.busitype.model.BusiTypeExample;
import com.sb.service.busitype.BusiTypeService;

/**
 * 业务分类Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class BusiTypeServiceImpl implements BusiTypeService {

    @Autowired
    private BusiTypeMapper busiTypeMapper;

    @Override
    public Integer create(BusiType busiType) {
        busiTypeMapper.insertSelective(busiType);
        return busiType.getId();
    }

    @Override
    public void deleteById(Integer id) {
        busiTypeMapper.deleteByPrimaryKey(id);
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
    public void updateById(BusiType busiType) {
        busiTypeMapper.updateByPrimaryKeySelective(busiType);
    }

    @Override
    public void updateByIdInBatch(List<BusiType> busiTypes) {
        if (CollectionUtils.isEmpty(busiTypes))
            return;
        for (BusiType busiType : busiTypes) {
            this.updateById(busiType);
        }
    }

    @Override
    public BusiType findById(Integer id) {
        return busiTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public BusiType findOne(BusiType busiType) {
        ExampleBuilder<BusiTypeExample, BusiTypeExample.Criteria> builder =
            ExampleBuilder.create(BusiTypeExample.class, BusiTypeExample.Criteria.class);
        List<BusiType> busiTypes = busiTypeMapper.selectByExample(builder.buildExamplePack(busiType).getExample());
        if (busiTypes.size() > 0) {
            return busiTypes.get(0);
        }
        return null;
    }

    @Override
    public List<BusiType> findList(BusiType busiType) {
        ExampleBuilder<BusiTypeExample, BusiTypeExample.Criteria> builder =
            ExampleBuilder.create(BusiTypeExample.class, BusiTypeExample.Criteria.class);
        return busiTypeMapper.selectByExample(builder.buildExamplePack(busiType).getExample());
    }

    @Override
    public PageData<BusiType> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<BusiTypeExample, BusiTypeExample.Criteria> builder =
            ExampleBuilder.create(BusiTypeExample.class, BusiTypeExample.Criteria.class);
        ExampleBuilder.ExamplePack<BusiTypeExample, BusiTypeExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(busiTypeMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(BusiType busiType) {
        ExampleBuilder<BusiTypeExample, BusiTypeExample.Criteria> builder =
            ExampleBuilder.create(BusiTypeExample.class, BusiTypeExample.Criteria.class);
        return busiTypeMapper.countByExample(builder.buildExamplePack(busiType).getExample());
    }
}
