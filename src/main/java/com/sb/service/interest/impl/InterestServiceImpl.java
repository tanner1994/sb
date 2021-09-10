package com.sb.service.interest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.interest.InterestMapper;
import com.sb.dao.interest.model.Interest;
import com.sb.dao.interest.model.InterestExample;
import com.sb.service.interest.InterestService;

/**
 * 利率信息Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class InterestServiceImpl implements InterestService {

    @Autowired
    private InterestMapper interestMapper;

    @Override
    public Integer create(Interest interest) {
        interestMapper.insertSelective(interest);
        return interest.getId();
    }

    @Override
    public void deleteById(Integer id) {
        interestMapper.deleteByPrimaryKey(id);
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
    public void updateById(Interest interest) {
        interestMapper.updateByPrimaryKeySelective(interest);
    }

    @Override
    public void updateByIdInBatch(List<Interest> interests) {
        if (CollectionUtils.isEmpty(interests))
            return;
        for (Interest interest : interests) {
            this.updateById(interest);
        }
    }

    @Override
    public Interest findById(Integer id) {
        return interestMapper.selectByPrimaryKey(id);
    }

    @Override
    public Interest findOne(Interest interest) {
        ExampleBuilder<InterestExample, InterestExample.Criteria> builder =
            ExampleBuilder.create(InterestExample.class, InterestExample.Criteria.class);
        List<Interest> interests = interestMapper.selectByExample(builder.buildExamplePack(interest).getExample());
        if (interests.size() > 0) {
            return interests.get(0);
        }
        return null;
    }

    @Override
    public List<Interest> findList(Interest interest) {
        ExampleBuilder<InterestExample, InterestExample.Criteria> builder =
            ExampleBuilder.create(InterestExample.class, InterestExample.Criteria.class);
        return interestMapper.selectByExample(builder.buildExamplePack(interest).getExample());
    }

    @Override
    public PageData<Interest> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<InterestExample, InterestExample.Criteria> builder =
            ExampleBuilder.create(InterestExample.class, InterestExample.Criteria.class);
        ExampleBuilder.ExamplePack<InterestExample, InterestExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(interestMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Interest interest) {
        ExampleBuilder<InterestExample, InterestExample.Criteria> builder =
            ExampleBuilder.create(InterestExample.class, InterestExample.Criteria.class);
        return interestMapper.countByExample(builder.buildExamplePack(interest).getExample());
    }
}
