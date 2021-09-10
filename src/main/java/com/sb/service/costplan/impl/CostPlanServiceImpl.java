package com.sb.service.costplan.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.costplan.CostPlanMapper;
import com.sb.dao.costplan.model.CostPlan;
import com.sb.dao.costplan.model.CostPlanExample;
import com.sb.service.costplan.CostPlanService;

/**
 * 成本核算方案Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class CostPlanServiceImpl implements CostPlanService {

    @Autowired
    private CostPlanMapper costPlanMapper;

    @Override
    public Integer create(CostPlan costPlan) {
        costPlanMapper.insertSelective(costPlan);
        return costPlan.getId();
    }

    @Override
    public void deleteById(Integer id) {
        costPlanMapper.deleteByPrimaryKey(id);
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
    public void updateById(CostPlan costPlan) {
        costPlanMapper.updateByPrimaryKeySelective(costPlan);
    }

    @Override
    public void updateByIdInBatch(List<CostPlan> costPlans) {
        if (CollectionUtils.isEmpty(costPlans))
            return;
        for (CostPlan costPlan : costPlans) {
            this.updateById(costPlan);
        }
    }

    @Override
    public CostPlan findById(Integer id) {
        return costPlanMapper.selectByPrimaryKey(id);
    }

    @Override
    public CostPlan findOne(CostPlan costPlan) {
        ExampleBuilder<CostPlanExample, CostPlanExample.Criteria> builder =
            ExampleBuilder.create(CostPlanExample.class, CostPlanExample.Criteria.class);
        List<CostPlan> costPlans = costPlanMapper.selectByExample(builder.buildExamplePack(costPlan).getExample());
        if (costPlans.size() > 0) {
            return costPlans.get(0);
        }
        return null;
    }

    @Override
    public List<CostPlan> findList(CostPlan costPlan) {
        ExampleBuilder<CostPlanExample, CostPlanExample.Criteria> builder =
            ExampleBuilder.create(CostPlanExample.class, CostPlanExample.Criteria.class);
        return costPlanMapper.selectByExample(builder.buildExamplePack(costPlan).getExample());
    }

    @Override
    public PageData<CostPlan> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<CostPlanExample, CostPlanExample.Criteria> builder =
            ExampleBuilder.create(CostPlanExample.class, CostPlanExample.Criteria.class);
        ExampleBuilder.ExamplePack<CostPlanExample, CostPlanExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(costPlanMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(CostPlan costPlan) {
        ExampleBuilder<CostPlanExample, CostPlanExample.Criteria> builder =
            ExampleBuilder.create(CostPlanExample.class, CostPlanExample.Criteria.class);
        return costPlanMapper.countByExample(builder.buildExamplePack(costPlan).getExample());
    }
}
