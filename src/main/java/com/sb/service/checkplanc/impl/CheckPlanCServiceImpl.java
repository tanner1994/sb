package com.sb.service.checkplanc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.checkplanc.CheckPlanCMapper;
import com.sb.dao.checkplanc.model.CheckPlanC;
import com.sb.dao.checkplanc.model.CheckPlanCExample;
import com.sb.service.checkplanc.CheckPlanCService;

/**
 * 审核方案C表Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class CheckPlanCServiceImpl implements CheckPlanCService {

    @Autowired
    private CheckPlanCMapper checkPlanCMapper;

    @Override
    public Integer create(CheckPlanC checkPlanC) {
        checkPlanCMapper.insertSelective(checkPlanC);
        return checkPlanC.getId();
    }

    @Override
    public void deleteById(Integer id) {
        checkPlanCMapper.deleteByPrimaryKey(id);
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
    public void updateById(CheckPlanC checkPlanC) {
        checkPlanCMapper.updateByPrimaryKeySelective(checkPlanC);
    }

    @Override
    public void updateByIdInBatch(List<CheckPlanC> checkPlanCs) {
        if (CollectionUtils.isEmpty(checkPlanCs))
            return;
        for (CheckPlanC checkPlanC : checkPlanCs) {
            this.updateById(checkPlanC);
        }
    }

    @Override
    public CheckPlanC findById(Integer id) {
        return checkPlanCMapper.selectByPrimaryKey(id);
    }

    @Override
    public CheckPlanC findOne(CheckPlanC checkPlanC) {
        ExampleBuilder<CheckPlanCExample, CheckPlanCExample.Criteria> builder =
            ExampleBuilder.create(CheckPlanCExample.class, CheckPlanCExample.Criteria.class);
        List<CheckPlanC> checkPlanCs =
            checkPlanCMapper.selectByExample(builder.buildExamplePack(checkPlanC).getExample());
        if (checkPlanCs.size() > 0) {
            return checkPlanCs.get(0);
        }
        return null;
    }

    @Override
    public List<CheckPlanC> findList(CheckPlanC checkPlanC) {
        ExampleBuilder<CheckPlanCExample, CheckPlanCExample.Criteria> builder =
            ExampleBuilder.create(CheckPlanCExample.class, CheckPlanCExample.Criteria.class);
        return checkPlanCMapper.selectByExample(builder.buildExamplePack(checkPlanC).getExample());
    }

    @Override
    public PageData<CheckPlanC> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<CheckPlanCExample, CheckPlanCExample.Criteria> builder =
            ExampleBuilder.create(CheckPlanCExample.class, CheckPlanCExample.Criteria.class);
        ExampleBuilder.ExamplePack<CheckPlanCExample, CheckPlanCExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(checkPlanCMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(CheckPlanC checkPlanC) {
        ExampleBuilder<CheckPlanCExample, CheckPlanCExample.Criteria> builder =
            ExampleBuilder.create(CheckPlanCExample.class, CheckPlanCExample.Criteria.class);
        return checkPlanCMapper.countByExample(builder.buildExamplePack(checkPlanC).getExample());
    }
}
