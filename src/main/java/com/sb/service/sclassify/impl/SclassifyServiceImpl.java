package com.sb.service.sclassify.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.sclassify.SclassifyMapper;
import com.sb.dao.sclassify.model.Sclassify;
import com.sb.dao.sclassify.model.SclassifyExample;
import com.sb.service.sclassify.SclassifyService;

/**
 * 证券分类Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class SclassifyServiceImpl implements SclassifyService {

    @Autowired
    private SclassifyMapper sclassifyMapper;

    @Override
    public Integer create(Sclassify sclassify) {
        sclassifyMapper.insertSelective(sclassify);
        return sclassify.getId();
    }

    @Override
    public void deleteById(Integer id) {
        sclassifyMapper.deleteByPrimaryKey(id);
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
    public void updateById(Sclassify sclassify) {
        sclassifyMapper.updateByPrimaryKeySelective(sclassify);
    }

    @Override
    public void updateByIdInBatch(List<Sclassify> sclassifys) {
        if (CollectionUtils.isEmpty(sclassifys))
            return;
        for (Sclassify sclassify : sclassifys) {
            this.updateById(sclassify);
        }
    }

    @Override
    public Sclassify findById(Integer id) {
        return sclassifyMapper.selectByPrimaryKey(id);
    }

    @Override
    public Sclassify findOne(Sclassify sclassify) {
        ExampleBuilder<SclassifyExample, SclassifyExample.Criteria> builder =
            ExampleBuilder.create(SclassifyExample.class, SclassifyExample.Criteria.class);
        List<Sclassify> sclassifys = sclassifyMapper.selectByExample(builder.buildExamplePack(sclassify).getExample());
        if (sclassifys.size() > 0) {
            return sclassifys.get(0);
        }
        return null;
    }

    @Override
    public List<Sclassify> findList(Sclassify sclassify) {
        ExampleBuilder<SclassifyExample, SclassifyExample.Criteria> builder =
            ExampleBuilder.create(SclassifyExample.class, SclassifyExample.Criteria.class);
        return sclassifyMapper.selectByExample(builder.buildExamplePack(sclassify).getExample());
    }

    @Override
    public PageData<Sclassify> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<SclassifyExample, SclassifyExample.Criteria> builder =
            ExampleBuilder.create(SclassifyExample.class, SclassifyExample.Criteria.class);
        ExampleBuilder.ExamplePack<SclassifyExample, SclassifyExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(sclassifyMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Sclassify sclassify) {
        ExampleBuilder<SclassifyExample, SclassifyExample.Criteria> builder =
            ExampleBuilder.create(SclassifyExample.class, SclassifyExample.Criteria.class);
        return sclassifyMapper.countByExample(builder.buildExamplePack(sclassify).getExample());
    }
}
