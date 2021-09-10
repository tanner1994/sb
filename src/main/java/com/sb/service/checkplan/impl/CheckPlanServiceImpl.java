package com.sb.service.checkplan.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.checkplan.CheckPlanMapper;
import com.sb.dao.checkplan.model.CheckPlan;
import com.sb.dao.checkplan.model.CheckPlanExample;
import com.sb.service.checkplan.CheckPlanService;

/**
 * 审核方案主表Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class CheckPlanServiceImpl implements CheckPlanService {

    @Autowired
    private CheckPlanMapper checkPlanMapper;

    @Override
    public Integer create(CheckPlan checkPlan) {
        checkPlanMapper.insertSelective(checkPlan);
        return checkPlan.getId();
    }

    @Override
    public void deleteById(Integer id) {
        checkPlanMapper.deleteByPrimaryKey(id);
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
    public void updateById(CheckPlan checkPlan) {
        checkPlanMapper.updateByPrimaryKeySelective(checkPlan);
    }

    @Override
    public void updateByIdInBatch(List<CheckPlan> checkPlans) {
        if (CollectionUtils.isEmpty(checkPlans))
            return;
        for (CheckPlan checkPlan : checkPlans) {
            this.updateById(checkPlan);
        }
    }

    @Override
    public CheckPlan findById(Integer id) {
        return checkPlanMapper.selectByPrimaryKey(id);
    }

    @Override
    public CheckPlan findOne(CheckPlan checkPlan) {
        ExampleBuilder<CheckPlanExample, CheckPlanExample.Criteria> builder =
            ExampleBuilder.create(CheckPlanExample.class, CheckPlanExample.Criteria.class);
        List<CheckPlan> checkPlans = checkPlanMapper.selectByExample(builder.buildExamplePack(checkPlan).getExample());
        if (checkPlans.size() > 0) {
            return checkPlans.get(0);
        }
        return null;
    }

    @Override
    public List<CheckPlan> findList(CheckPlan checkPlan) {
        ExampleBuilder<CheckPlanExample, CheckPlanExample.Criteria> builder =
            ExampleBuilder.create(CheckPlanExample.class, CheckPlanExample.Criteria.class);
        return checkPlanMapper.selectByExample(builder.buildExamplePack(checkPlan).getExample());
    }

    @Override
    public PageData<CheckPlan> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<CheckPlanExample, CheckPlanExample.Criteria> builder =
            ExampleBuilder.create(CheckPlanExample.class, CheckPlanExample.Criteria.class);
        ExampleBuilder.ExamplePack<CheckPlanExample, CheckPlanExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(checkPlanMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(CheckPlan checkPlan) {
        ExampleBuilder<CheckPlanExample, CheckPlanExample.Criteria> builder =
            ExampleBuilder.create(CheckPlanExample.class, CheckPlanExample.Criteria.class);
        return checkPlanMapper.countByExample(builder.buildExamplePack(checkPlan).getExample());
    }
}
