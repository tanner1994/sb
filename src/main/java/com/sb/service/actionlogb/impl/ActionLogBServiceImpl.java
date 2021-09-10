package com.sb.service.actionlogb.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.actionlogb.ActionLogBMapper;
import com.sb.dao.actionlogb.model.ActionLogB;
import com.sb.dao.actionlogb.model.ActionLogBExample;
import com.sb.service.actionlogb.ActionLogBService;

/**
 * 动作执行日志子表Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class ActionLogBServiceImpl implements ActionLogBService {

    @Autowired
    private ActionLogBMapper actionLogBMapper;

    @Override
    public Integer create(ActionLogB actionLogB) {
        actionLogBMapper.insertSelective(actionLogB);
        return actionLogB.getId();
    }

    @Override
    public void deleteById(Integer id) {
        actionLogBMapper.deleteByPrimaryKey(id);
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
    public void updateById(ActionLogB actionLogB) {
        actionLogBMapper.updateByPrimaryKeySelective(actionLogB);
    }

    @Override
    public void updateByIdInBatch(List<ActionLogB> actionLogBs) {
        if (CollectionUtils.isEmpty(actionLogBs))
            return;
        for (ActionLogB actionLogB : actionLogBs) {
            this.updateById(actionLogB);
        }
    }

    @Override
    public ActionLogB findById(Integer id) {
        return actionLogBMapper.selectByPrimaryKey(id);
    }

    @Override
    public ActionLogB findOne(ActionLogB actionLogB) {
        ExampleBuilder<ActionLogBExample, ActionLogBExample.Criteria> builder =
            ExampleBuilder.create(ActionLogBExample.class, ActionLogBExample.Criteria.class);
        List<ActionLogB> actionLogBs =
            actionLogBMapper.selectByExample(builder.buildExamplePack(actionLogB).getExample());
        if (actionLogBs.size() > 0) {
            return actionLogBs.get(0);
        }
        return null;
    }

    @Override
    public List<ActionLogB> findList(ActionLogB actionLogB) {
        ExampleBuilder<ActionLogBExample, ActionLogBExample.Criteria> builder =
            ExampleBuilder.create(ActionLogBExample.class, ActionLogBExample.Criteria.class);
        return actionLogBMapper.selectByExample(builder.buildExamplePack(actionLogB).getExample());
    }

    @Override
    public PageData<ActionLogB> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<ActionLogBExample, ActionLogBExample.Criteria> builder =
            ExampleBuilder.create(ActionLogBExample.class, ActionLogBExample.Criteria.class);
        ExampleBuilder.ExamplePack<ActionLogBExample, ActionLogBExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(actionLogBMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(ActionLogB actionLogB) {
        ExampleBuilder<ActionLogBExample, ActionLogBExample.Criteria> builder =
            ExampleBuilder.create(ActionLogBExample.class, ActionLogBExample.Criteria.class);
        return actionLogBMapper.countByExample(builder.buildExamplePack(actionLogB).getExample());
    }
}
