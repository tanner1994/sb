package com.sb.service.actionlog.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.actionlog.ActionLogMapper;
import com.sb.dao.actionlog.model.ActionLog;
import com.sb.dao.actionlog.model.ActionLogExample;
import com.sb.service.actionlog.ActionLogService;

/**
 * 动作执行日志Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class ActionLogServiceImpl implements ActionLogService {

    @Autowired
    private ActionLogMapper actionLogMapper;

    @Override
    public Integer create(ActionLog actionLog) {
        actionLogMapper.insertSelective(actionLog);
        return actionLog.getId();
    }

    @Override
    public void deleteById(Integer id) {
        actionLogMapper.deleteByPrimaryKey(id);
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
    public void updateById(ActionLog actionLog) {
        actionLogMapper.updateByPrimaryKeySelective(actionLog);
    }

    @Override
    public void updateByIdInBatch(List<ActionLog> actionLogs) {
        if (CollectionUtils.isEmpty(actionLogs))
            return;
        for (ActionLog actionLog : actionLogs) {
            this.updateById(actionLog);
        }
    }

    @Override
    public ActionLog findById(Integer id) {
        return actionLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public ActionLog findOne(ActionLog actionLog) {
        ExampleBuilder<ActionLogExample, ActionLogExample.Criteria> builder =
            ExampleBuilder.create(ActionLogExample.class, ActionLogExample.Criteria.class);
        List<ActionLog> actionLogs = actionLogMapper.selectByExample(builder.buildExamplePack(actionLog).getExample());
        if (actionLogs.size() > 0) {
            return actionLogs.get(0);
        }
        return null;
    }

    @Override
    public List<ActionLog> findList(ActionLog actionLog) {
        ExampleBuilder<ActionLogExample, ActionLogExample.Criteria> builder =
            ExampleBuilder.create(ActionLogExample.class, ActionLogExample.Criteria.class);
        return actionLogMapper.selectByExample(builder.buildExamplePack(actionLog).getExample());
    }

    @Override
    public PageData<ActionLog> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<ActionLogExample, ActionLogExample.Criteria> builder =
            ExampleBuilder.create(ActionLogExample.class, ActionLogExample.Criteria.class);
        ExampleBuilder.ExamplePack<ActionLogExample, ActionLogExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(actionLogMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(ActionLog actionLog) {
        ExampleBuilder<ActionLogExample, ActionLogExample.Criteria> builder =
            ExampleBuilder.create(ActionLogExample.class, ActionLogExample.Criteria.class);
        return actionLogMapper.countByExample(builder.buildExamplePack(actionLog).getExample());
    }
}
