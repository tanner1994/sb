package com.sb.service.bourse.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.bourse.BourseMapper;
import com.sb.dao.bourse.model.Bourse;
import com.sb.dao.bourse.model.BourseExample;
import com.sb.service.bourse.BourseService;

/**
 * 交易所Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class BourseServiceImpl implements BourseService {

    @Autowired
    private BourseMapper bourseMapper;

    @Override
    public Integer create(Bourse bourse) {
        bourseMapper.insertSelective(bourse);
        return bourse.getId();
    }

    @Override
    public void deleteById(Integer id) {
        bourseMapper.deleteByPrimaryKey(id);
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
    public void updateById(Bourse bourse) {
        bourseMapper.updateByPrimaryKeySelective(bourse);
    }

    @Override
    public void updateByIdInBatch(List<Bourse> bourses) {
        if (CollectionUtils.isEmpty(bourses))
            return;
        for (Bourse bourse : bourses) {
            this.updateById(bourse);
        }
    }

    @Override
    public Bourse findById(Integer id) {
        return bourseMapper.selectByPrimaryKey(id);
    }

    @Override
    public Bourse findOne(Bourse bourse) {
        ExampleBuilder<BourseExample, BourseExample.Criteria> builder =
            ExampleBuilder.create(BourseExample.class, BourseExample.Criteria.class);
        List<Bourse> bourses = bourseMapper.selectByExample(builder.buildExamplePack(bourse).getExample());
        if (bourses.size() > 0) {
            return bourses.get(0);
        }
        return null;
    }

    @Override
    public List<Bourse> findList(Bourse bourse) {
        ExampleBuilder<BourseExample, BourseExample.Criteria> builder =
            ExampleBuilder.create(BourseExample.class, BourseExample.Criteria.class);
        return bourseMapper.selectByExample(builder.buildExamplePack(bourse).getExample());
    }

    @Override
    public PageData<Bourse> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<BourseExample, BourseExample.Criteria> builder =
            ExampleBuilder.create(BourseExample.class, BourseExample.Criteria.class);
        ExampleBuilder.ExamplePack<BourseExample, BourseExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(bourseMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Bourse bourse) {
        ExampleBuilder<BourseExample, BourseExample.Criteria> builder =
            ExampleBuilder.create(BourseExample.class, BourseExample.Criteria.class);
        return bourseMapper.countByExample(builder.buildExamplePack(bourse).getExample());
    }
}
