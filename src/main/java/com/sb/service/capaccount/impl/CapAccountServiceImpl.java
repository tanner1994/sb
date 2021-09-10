package com.sb.service.capaccount.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.capaccount.CapAccountMapper;
import com.sb.dao.capaccount.model.CapAccount;
import com.sb.dao.capaccount.model.CapAccountExample;
import com.sb.service.capaccount.CapAccountService;

/**
 * 资金账号Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class CapAccountServiceImpl implements CapAccountService {

    @Autowired
    private CapAccountMapper capAccountMapper;

    @Override
    public Integer create(CapAccount capAccount) {
        capAccountMapper.insertSelective(capAccount);
        return capAccount.getId();
    }

    @Override
    public void deleteById(Integer id) {
        capAccountMapper.deleteByPrimaryKey(id);
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
    public void updateById(CapAccount capAccount) {
        capAccountMapper.updateByPrimaryKeySelective(capAccount);
    }

    @Override
    public void updateByIdInBatch(List<CapAccount> capAccounts) {
        if (CollectionUtils.isEmpty(capAccounts))
            return;
        for (CapAccount capAccount : capAccounts) {
            this.updateById(capAccount);
        }
    }

    @Override
    public CapAccount findById(Integer id) {
        return capAccountMapper.selectByPrimaryKey(id);
    }

    @Override
    public CapAccount findOne(CapAccount capAccount) {
        ExampleBuilder<CapAccountExample, CapAccountExample.Criteria> builder =
            ExampleBuilder.create(CapAccountExample.class, CapAccountExample.Criteria.class);
        List<CapAccount> capAccounts =
            capAccountMapper.selectByExample(builder.buildExamplePack(capAccount).getExample());
        if (capAccounts.size() > 0) {
            return capAccounts.get(0);
        }
        return null;
    }

    @Override
    public List<CapAccount> findList(CapAccount capAccount) {
        ExampleBuilder<CapAccountExample, CapAccountExample.Criteria> builder =
            ExampleBuilder.create(CapAccountExample.class, CapAccountExample.Criteria.class);
        return capAccountMapper.selectByExample(builder.buildExamplePack(capAccount).getExample());
    }

    @Override
    public PageData<CapAccount> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<CapAccountExample, CapAccountExample.Criteria> builder =
            ExampleBuilder.create(CapAccountExample.class, CapAccountExample.Criteria.class);
        ExampleBuilder.ExamplePack<CapAccountExample, CapAccountExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(capAccountMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(CapAccount capAccount) {
        ExampleBuilder<CapAccountExample, CapAccountExample.Criteria> builder =
            ExampleBuilder.create(CapAccountExample.class, CapAccountExample.Criteria.class);
        return capAccountMapper.countByExample(builder.buildExamplePack(capAccount).getExample());
    }
}
