package com.sb.service.selfsgroup.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.selfsgroup.SelfsGroupMapper;
import com.sb.dao.selfsgroup.model.SelfsGroup;
import com.sb.dao.selfsgroup.model.SelfsGroupExample;
import com.sb.service.selfsgroup.SelfsGroupService;

/**
 * 业务小组Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class SelfsGroupServiceImpl implements SelfsGroupService {

    @Autowired
    private SelfsGroupMapper selfsGroupMapper;

    @Override
    public Integer create(SelfsGroup selfsGroup) {
        selfsGroupMapper.insertSelective(selfsGroup);
        return selfsGroup.getId();
    }

    @Override
    public void deleteById(Integer id) {
        selfsGroupMapper.deleteByPrimaryKey(id);
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
    public void updateById(SelfsGroup selfsGroup) {
        selfsGroupMapper.updateByPrimaryKeySelective(selfsGroup);
    }

    @Override
    public void updateByIdInBatch(List<SelfsGroup> selfsGroups) {
        if (CollectionUtils.isEmpty(selfsGroups))
            return;
        for (SelfsGroup selfsGroup : selfsGroups) {
            this.updateById(selfsGroup);
        }
    }

    @Override
    public SelfsGroup findById(Integer id) {
        return selfsGroupMapper.selectByPrimaryKey(id);
    }

    @Override
    public SelfsGroup findOne(SelfsGroup selfsGroup) {
        ExampleBuilder<SelfsGroupExample, SelfsGroupExample.Criteria> builder =
            ExampleBuilder.create(SelfsGroupExample.class, SelfsGroupExample.Criteria.class);
        List<SelfsGroup> selfsGroups =
            selfsGroupMapper.selectByExample(builder.buildExamplePack(selfsGroup).getExample());
        if (selfsGroups.size() > 0) {
            return selfsGroups.get(0);
        }
        return null;
    }

    @Override
    public List<SelfsGroup> findList(SelfsGroup selfsGroup) {
        ExampleBuilder<SelfsGroupExample, SelfsGroupExample.Criteria> builder =
            ExampleBuilder.create(SelfsGroupExample.class, SelfsGroupExample.Criteria.class);
        return selfsGroupMapper.selectByExample(builder.buildExamplePack(selfsGroup).getExample());
    }

    @Override
    public PageData<SelfsGroup> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<SelfsGroupExample, SelfsGroupExample.Criteria> builder =
            ExampleBuilder.create(SelfsGroupExample.class, SelfsGroupExample.Criteria.class);
        ExampleBuilder.ExamplePack<SelfsGroupExample, SelfsGroupExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(selfsGroupMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(SelfsGroup selfsGroup) {
        ExampleBuilder<SelfsGroupExample, SelfsGroupExample.Criteria> builder =
            ExampleBuilder.create(SelfsGroupExample.class, SelfsGroupExample.Criteria.class);
        return selfsGroupMapper.countByExample(builder.buildExamplePack(selfsGroup).getExample());
    }
}
