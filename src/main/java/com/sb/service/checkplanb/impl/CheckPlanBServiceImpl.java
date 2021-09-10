package com.sb.service.checkplanb.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.checkplanb.CheckPlanBMapper;
import com.sb.dao.checkplanb.model.CheckPlanB;
import com.sb.dao.checkplanb.model.CheckPlanBExample;
import com.sb.service.checkplanb.CheckPlanBService;

/**
 * 审核方案B表Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class CheckPlanBServiceImpl implements CheckPlanBService {

    @Autowired
    private CheckPlanBMapper checkPlanBMapper;

    @Override
    public Integer create(CheckPlanB checkPlanB) {
        checkPlanBMapper.insertSelective(checkPlanB);
        return checkPlanB.getId();
    }

    @Override
    public void deleteById(Integer id) {
        checkPlanBMapper.deleteByPrimaryKey(id);
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
    public void updateById(CheckPlanB checkPlanB) {
        checkPlanBMapper.updateByPrimaryKeySelective(checkPlanB);
    }

    @Override
    public void updateByIdInBatch(List<CheckPlanB> checkPlanBs) {
        if (CollectionUtils.isEmpty(checkPlanBs))
            return;
        for (CheckPlanB checkPlanB : checkPlanBs) {
            this.updateById(checkPlanB);
        }
    }

    @Override
    public CheckPlanB findById(Integer id) {
        return checkPlanBMapper.selectByPrimaryKey(id);
    }

    @Override
    public CheckPlanB findOne(CheckPlanB checkPlanB) {
        ExampleBuilder<CheckPlanBExample, CheckPlanBExample.Criteria> builder =
            ExampleBuilder.create(CheckPlanBExample.class, CheckPlanBExample.Criteria.class);
        List<CheckPlanB> checkPlanBs =
            checkPlanBMapper.selectByExample(builder.buildExamplePack(checkPlanB).getExample());
        if (checkPlanBs.size() > 0) {
            return checkPlanBs.get(0);
        }
        return null;
    }

    @Override
    public List<CheckPlanB> findList(CheckPlanB checkPlanB) {
        ExampleBuilder<CheckPlanBExample, CheckPlanBExample.Criteria> builder =
            ExampleBuilder.create(CheckPlanBExample.class, CheckPlanBExample.Criteria.class);
        return checkPlanBMapper.selectByExample(builder.buildExamplePack(checkPlanB).getExample());
    }

    @Override
    public PageData<CheckPlanB> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<CheckPlanBExample, CheckPlanBExample.Criteria> builder =
            ExampleBuilder.create(CheckPlanBExample.class, CheckPlanBExample.Criteria.class);
        ExampleBuilder.ExamplePack<CheckPlanBExample, CheckPlanBExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(checkPlanBMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(CheckPlanB checkPlanB) {
        ExampleBuilder<CheckPlanBExample, CheckPlanBExample.Criteria> builder =
            ExampleBuilder.create(CheckPlanBExample.class, CheckPlanBExample.Criteria.class);
        return checkPlanBMapper.countByExample(builder.buildExamplePack(checkPlanB).getExample());
    }
}
